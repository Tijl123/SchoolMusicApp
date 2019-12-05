import { Component, OnInit } from '@angular/core';
import { Track } from '../models/track.model';
import { MusicService } from '../music.service';
import { Router } from '@angular/router';
import { Album } from '../models/album.model';
import { Artist } from '../models/artist.model';

@Component({
  selector: 'app-track-detail',
  templateUrl: './track-detail.component.html',
  styleUrls: ['./track-detail.component.scss']
})
export class TrackDetailComponent implements OnInit {

  track: Track;
  albums: string;
  lyrics: string;

  constructor(private _musicService: MusicService, private router: Router) { }

  ngOnInit() {
    this._musicService.getTrackWhereTrackID(localStorage.getItem("trackId")).subscribe(
      result => {
        this.track = result;
        if (this.track.albums == null) {
          this.albums = "Geen albums gevonden."
        }
      },
      (err) => {
        console.log("error");
      }
    );

    this._musicService.getLyricsWhereTrackID(localStorage.getItem("trackId")).subscribe(
      result => {
        this.lyrics = result.lyrics;     
      },
      (err) => {
          this.lyrics = "Geen lyrics gevonden."
      }
    );
  }

  toonDetailsAlbum(albumID: string){
    localStorage.setItem("albumId", albumID);
    this.router.navigate(['/albumdetail']);
  }

  toonDetailsArtist(artistID: string){
    localStorage.setItem("artistId", artistID);
    this.router.navigate(['/artistdetail']);
  }

}

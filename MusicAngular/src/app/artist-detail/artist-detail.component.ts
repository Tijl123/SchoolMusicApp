import { Component, OnInit } from '@angular/core';
import { Artist } from '../models/artist.model';
import { MusicService } from '../music.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-artist-detail',
  templateUrl: './artist-detail.component.html',
  styleUrls: ['./artist-detail.component.scss']
})
export class ArtistDetailComponent implements OnInit {

  artist: Artist;

  constructor(private _musicService: MusicService, private router: Router) { }

  ngOnInit() {
    this._musicService.getArtistWhereArtistID(localStorage.getItem("artistId")).subscribe(
      result => {
        this.artist = result;
      },
      (err) => {
          
      }
    );
  }

  toonDetailsAlbum(albumID: string){
    localStorage.setItem("albumId", albumID);
    this.router.navigate(['/albumdetail']);
  }

}

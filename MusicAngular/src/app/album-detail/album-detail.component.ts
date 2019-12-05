import { Component, OnInit } from '@angular/core';
import { MusicService } from '../music.service';
import { Router } from '@angular/router';
import { Album } from '../models/album.model';

@Component({
  selector: 'app-album-detail',
  templateUrl: './album-detail.component.html',
  styleUrls: ['./album-detail.component.scss']
})
export class AlbumDetailComponent implements OnInit {

  album: Album;

  constructor(private _musicService: MusicService, private router: Router) { }

  ngOnInit() {
    this._musicService.getAlbumWhereAlbumID(localStorage.getItem("albumId")).subscribe(
      result => {
        this.album = result;
        console.log(this.album);
      },
      (err) => {
      }
    );
  }

  toonDetailsTrack(trackID: string){
    localStorage.setItem("trackId", trackID);
    this.router.navigate(['/trackdetail']);
  }

  toonDetailsArtist(artistID: string){
    localStorage.setItem("artistId", artistID);
    this.router.navigate(['/artistdetail']);
  }

}

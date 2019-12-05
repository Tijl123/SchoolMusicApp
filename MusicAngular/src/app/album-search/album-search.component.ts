import { Component, OnInit } from '@angular/core';
import { Album } from '../models/album.model';
import { MusicService } from '../music.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-album-search',
  templateUrl: './album-search.component.html',
  styleUrls: ['./album-search.component.scss']
})
export class AlbumSearchComponent implements OnInit {

  submitted : boolean = false;
  album: string;
  albums: Album[];

  constructor(private _musicService: MusicService, private router: Router) { }

  ngOnInit() {
    if (this.album != null) {
      this._musicService.getAlbumsWhereTitle(this.album).subscribe(
        result => {
          this.albums = result
        },
        (err) => {
          
        }
      );
    }
  }

  onSubmit() {
    this.submitted = true;
    this.ngOnInit();
  }

  toonDetails(albumID: string){
    localStorage.setItem("albumId", albumID);
    this.router.navigate(['/albumdetail']);
  }

}

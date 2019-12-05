import { Component, OnInit } from '@angular/core';
import { Artist } from '../models/artist.model';
import { MusicService } from '../music.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-artist-search',
  templateUrl: './artist-search.component.html',
  styleUrls: ['./artist-search.component.scss']
})
export class ArtistSearchComponent implements OnInit {

  submitted : boolean = false;
  artist: string;
  artists: Artist[];

  constructor(private _musicService: MusicService, private router: Router) { }

  ngOnInit() {
    if (this.artist != null) {   
      this._musicService.getArtistsWhereName(this.artist).subscribe(
        result => {
          this.artists = result;
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

  toonDetails(artistID: string){
    localStorage.setItem("artistId", artistID);
    this.router.navigate(['/artistdetail']);
  }

}

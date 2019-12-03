import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MusicService } from '../music.service';
import { Track } from '../models/track.model';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {

  submitted : boolean = false;
  artist: string;
  tracks: Array<Track>;

  constructor(private _musicService: MusicService, private router: Router) { }

  ngOnInit() {
  }

  onSubmit() {
    this.submitted = true;
    this._musicService.getTracksWhereArtist(this.artist).subscribe(
      result => {

      },
      (err) => {
        
      }
  );
}

}

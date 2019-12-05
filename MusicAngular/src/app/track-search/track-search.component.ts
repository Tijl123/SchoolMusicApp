import { Component, OnInit } from '@angular/core';
import { Track } from '../models/track.model';
import { MusicService } from '../music.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-track-search',
  templateUrl: './track-search.component.html',
  styleUrls: ['./track-search.component.scss']
})
export class TrackSearchComponent implements OnInit {

  submitted : boolean = false;
  track: string;
  tracks: Track[];

  constructor(private _musicService: MusicService, private router: Router) { }

  ngOnInit() {
    if(this.track != null){
      this._musicService.getTracksWhereTitle(this.track).subscribe(
        result => {
          this.tracks = result;
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

  toonDetails(trackID: string){
    localStorage.setItem("trackId", trackID);
    this.router.navigate(['/trackdetail']);
  }

}

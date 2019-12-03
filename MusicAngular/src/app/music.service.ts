import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Track } from './models/track.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MusicService {

  constructor(private http: HttpClient) { }

  getTracksWhereArtist(artist: string): Observable<Track> {
    return this.http.get<Track>("????" + artist);
  }

}

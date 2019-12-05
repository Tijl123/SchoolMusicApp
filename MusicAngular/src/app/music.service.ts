import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Track } from './models/track.model';
import { Observable } from 'rxjs';
import { Lyrics } from './models/lyrics.model';
import { Artist } from './models/artist.model';
import { Album } from './models/album.model';

@Injectable({
  providedIn: 'root'
})
export class MusicService {

  constructor(private http: HttpClient) { }

  getTrackWhereTrackID(trackID: string): Observable<Track> {
    return this.http.get<Track>("http://localhost:8050/music/trackId/" + trackID);
  }

  getTracksWhereTitle(track: string): Observable<Track[]> {
    return this.http.get<Track[]>("http://localhost:8050/music/track/" + track);
  }

  getAlbumWhereAlbumID(albumID: string): Observable<Album> {
    return this.http.get<Album>("http://localhost:8050/music/albumId/" + albumID);
  }

  getAlbumsWhereTitle(album: string): Observable<Album[]> {
    return this.http.get<Album[]>("http://localhost:8050/music/album/" + album);
  }

  getArtistWhereArtistID(artistID: string): Observable<Artist> {
    return this.http.get<Artist>("http://localhost:8050/music/artistId/" + artistID);
  }

  getArtistsWhereName(artist: string): Observable<Artist[]> {
    return this.http.get<Artist[]>("http://localhost:8050/music/artist/" + artist);
  }

  getLyricsWhereTrackID(trackId: string): Observable<Lyrics> {
    return this.http.get<Lyrics>("http://localhost:8050/music/lyrics/" + trackId);
  }

}

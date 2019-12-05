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

  private apiBase = 'http://localhost:8080/music/';

  constructor(private http: HttpClient) { }

  getTrackWhereTrackID(trackID: string): Observable<Track> {
    return this.http.get<Track>(this.apiBase + 'trackId/' + trackID);
  }

  getTracksWhereTitle(track: string): Observable<Track[]> {
    return this.http.get<Track[]>(this.apiBase + 'track/' + track);
  }

  getAlbumWhereAlbumID(albumID: string): Observable<Album> {
    return this.http.get<Album>(this.apiBase + 'albumId/' + albumID);
  }

  getAlbumsWhereTitle(album: string): Observable<Album[]> {
    return this.http.get<Album[]>(this.apiBase + 'album/' + album);
  }

  getArtistWhereArtistID(artistID: string): Observable<Artist> {
    return this.http.get<Artist>(this.apiBase + 'artistId/' + artistID);
  }

  getArtistsWhereName(artist: string): Observable<Artist[]> {
    return this.http.get<Artist[]>(this.apiBase + 'artist/' + artist);
  }

  getLyricsWhereTrackID(trackId: string): Observable<Lyrics> {
    return this.http.get<Lyrics>(this.apiBase + 'lyrics/' + trackId);
  }

}

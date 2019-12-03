import { Artist } from './artist.model';
import { Track } from './track.model';

export class Album {
    constructor(public albumID: number, public title: string, public artistID: number, public releaseDate: Date, public albumCoverUrl: string, public artist: Artist, public tracks: Array<Track>){}
}

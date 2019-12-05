import { Artist } from './artist.model';
import { Track } from './track.model';

export class Album {
    constructor(public albumID: string, public title: string, public artists: Array<Artist>, public tracks: Array<Track>){}
}

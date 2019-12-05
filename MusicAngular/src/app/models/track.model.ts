import { Album } from './album.model';
import { Artist } from './artist.model';

export class Track {
    constructor(public trackID: string, public title: string, public length: number, public albums: Array<Album>, public artists: Array<Artist>){}
}

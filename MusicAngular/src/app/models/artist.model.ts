import { Album } from './album.model';

export class Artist {
    constructor(public artistID: string, public name: string, public albums: Array<Album>){}
}

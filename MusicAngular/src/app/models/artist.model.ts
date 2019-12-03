import { Album } from './album.model';

export class Artist {
    constructor(public artistID: number, public name: string, public imageUrl: string, public albums: Array<Album>){}
}

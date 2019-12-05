import { Album } from './album.model';

export class Artist {
    constructor(public id: string, public name: string, public albums: Array<Album>){}
}

import { BrowserModule } from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RouterModule, Routes } from '@angular/router';
import { SharedModule } from './shared/shared.module';
import { HomeComponent } from './home/home.component';
import { MusicService } from './music.service';
import { HttpClientModule } from '@angular/common/http';
import { TrackDetailComponent } from './track-detail/track-detail.component';
import { ArtistSearchComponent } from './artist-search/artist-search.component';
import { ArtistDetailComponent } from './artist-detail/artist-detail.component';
import { AlbumSearchComponent } from './album-search/album-search.component';
import { AlbumDetailComponent } from './album-detail/album-detail.component';
import { TrackSearchComponent } from './track-search/track-search.component';

const appRoutes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'tracksearch', component: TrackSearchComponent },
  { path: 'trackdetail', component: TrackDetailComponent },
  { path: 'albumsearch', component: AlbumSearchComponent },
  { path: 'albumdetail', component: AlbumDetailComponent },
  { path: 'artistsearch', component: ArtistSearchComponent },
  { path: 'artistdetail', component: ArtistDetailComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    TrackDetailComponent,
    ArtistSearchComponent,
    ArtistDetailComponent,
    AlbumSearchComponent,
    AlbumDetailComponent,
    TrackSearchComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    RouterModule.forRoot(appRoutes, { enableTracing: true }),
    AppRoutingModule,
    HttpClientModule,
    SharedModule
  ],
  providers: [MusicService],
  bootstrap: [AppComponent]
})
export class AppModule { }

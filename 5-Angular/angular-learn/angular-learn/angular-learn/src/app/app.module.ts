import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MovieComponent } from './movie/movie.component';
import { MovieListComponent } from './movie-list/movie-list.component';
import { FormsModule } from '@angular/forms';
import { EditMovieComponent } from './edit-movie/edit-movie.component';
import { ProfileComponent } from './profile/profile.component';
import { HttpComponent } from './http/http.component';
import { LoginComponent } from './login/login.component';
import { CustomPipeComponent } from './custom-pipe/custom-pipe.component';
import { ArrayTransformPipe } from './custom-pipe/array-transform.pipe';

@NgModule({
  declarations: [
    AppComponent,
    MovieComponent,
    MovieListComponent,
    EditMovieComponent,
    ProfileComponent,
    HttpComponent,
    LoginComponent,
    CustomPipeComponent,
    ArrayTransformPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

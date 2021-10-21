import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { movies } from '../data';
import { Movie } from './model/movie';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {
  //title: string = "Joker";
  //genres: string[] = ["Drama", "Thriller"];

  /*movie: Movie = {
    id: 1,
    title: "Joker",
    genres: [
      { id: 2, name: "Drama" },
      { id: 4, name: "Thriller"}
    ],
    releaseDate: new Date(2019, 7, 31),
    mpaaRating: {
      id: 1,
      name: "PG-13"
    },
    rating: 8.5,
    duration: 122,
    budget: 70000000,
    bookingsOpen: false
  };*/
  
  @Input()
  movie!: Movie;

  @Output() favoriteSelected: EventEmitter<boolean> = new EventEmitter();

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  toggleFavorite() : void {
    this.movie.favorite = !this.movie.favorite;
    this.favoriteSelected.emit(this.movie.favorite);
  }

  showEdit() : void {
    this.router.navigate(['/edit-movie', this.movie.id]);
  }

}

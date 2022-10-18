package com.acmeflix.repository;

import com.acmeflix.domain.Movie;


public interface MovieRepository extends BaseRepository<Movie, Long> {
    Movie findByTitle(String title);

    Movie findByYear(String year);
}

package com.acmeflix.service;

import com.acmeflix.domain.Movie;

public interface MovieService extends BaseService<Movie, Long> {

    public Movie findByYear(String year);

    public Movie findByTitle(String title);


}

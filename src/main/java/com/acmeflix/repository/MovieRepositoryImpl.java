package com.acmeflix.repository;

import com.acmeflix.domain.Movie;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepositoryImpl extends BaseRepositoryImpl<Movie> implements MovieRepository {


    @Override
    public Movie findByTitle(final String title) {
        return null;
    }

    @Override
    public Movie findByYear(String year) {
        return null;
    }


}

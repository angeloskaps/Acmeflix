package com.acmeflix.service;

import com.acmeflix.domain.Movie;
import com.acmeflix.repository.BaseRepository;
import com.acmeflix.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl extends BaseServiceImpl<Movie> implements MovieService {
    private final MovieRepository movieRepository;

    @Override
    public BaseRepository<Movie, Long> getRepository() {
        return movieRepository;
    }

    @Override
    public Movie findByYear(final String year) {
        Movie movie = movieRepository.findByYear(year);
        return movie;
    }

    @Override
    public Movie findByTitle(final String title) {
        Movie movie = movieRepository.findByTitle(title);
        return movie;
    }
}

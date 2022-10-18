package com.acmeflix.repository;

import com.acmeflix.domain.Program;
import com.acmeflix.domain.Rating;


public interface RatingRepository extends BaseRepository<Rating, Long> {
    void addRating(Rating rating);

    Rating getRating(Program program);
}

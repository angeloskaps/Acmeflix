package com.acmeflix.service;

import com.acmeflix.domain.Profile;
import com.acmeflix.domain.Program;
import com.acmeflix.domain.Rating;

public interface RatingService extends BaseService<Rating, Long> {

    public void rate(Program program, Profile profile, Double rating);

    public Rating getRating(Program program);
}

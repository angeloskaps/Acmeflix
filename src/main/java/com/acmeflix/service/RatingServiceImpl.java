package com.acmeflix.service;

import com.acmeflix.domain.Profile;
import com.acmeflix.domain.Program;
import com.acmeflix.domain.Rating;
import com.acmeflix.repository.BaseRepository;
import com.acmeflix.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl extends BaseServiceImpl<Rating> implements RatingService {
    private final RatingRepository ratingRepository;

    @Override
    public BaseRepository<Rating, Long> getRepository() {
        return ratingRepository;
    }

    @Override
    public void rate(final Program program, final Profile profile, final Double rating) {
        ratingRepository.addRating(Rating.builder().profile(profile).rating(rating).program(program).build());
        logger.info("User Profile with the nickname {} rated Program {} with  {}", profile.getProfileNickname(), program.getTitle(), rating);
    }

    @Override
    public Rating getRating(final Program program) {
        return ratingRepository.getRating(program);
    }
}

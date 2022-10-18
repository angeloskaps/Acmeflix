package com.acmeflix.service;

import com.acmeflix.domain.Episode;
import com.acmeflix.domain.Season;
import com.acmeflix.domain.TVShow;
import com.acmeflix.repository.BaseRepository;
import com.acmeflix.repository.TVShowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class TvShowServiceImpl extends BaseServiceImpl<TVShow> implements TvShowService {
    private final TVShowRepository tvShowRepository;

    @Override
    public BaseRepository<TVShow, Long> getRepository() {
        return this.tvShowRepository;
    }

    @Override
    public TVShow findByYear(final String year) {
        TVShow tvShow = tvShowRepository.findByYear(year);

        return tvShow;
    }

    @Override
    public TVShow findByTitle(final String title) {
        TVShow tvShow = tvShowRepository.findByTitle(title);
        return tvShow;
    }

    @Override
    public void addSeasons(final TVShow tvShow, final Season... seasons) {
        tvShow.setSeasons(new ArrayList<>());
        Arrays.stream(seasons).forEach(season -> tvShow.getSeasons().add(season));

    }

    @Override
    public void addEpisodes(final Season season, Episode... episodes) {
        season.setEpisodes(new ArrayList<>());
        Arrays.stream(episodes).forEach(episode -> season.getEpisodes().add(episode));
    }


}

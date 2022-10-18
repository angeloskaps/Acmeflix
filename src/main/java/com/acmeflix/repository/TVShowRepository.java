package com.acmeflix.repository;

import com.acmeflix.domain.TVShow;

public interface TVShowRepository extends BaseRepository<TVShow, Long> {
    TVShow findByTitle(String title);

    TVShow findByYear(String year);


}

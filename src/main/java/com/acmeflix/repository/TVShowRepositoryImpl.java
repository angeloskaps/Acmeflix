package com.acmeflix.repository;

import com.acmeflix.domain.TVShow;
import org.springframework.stereotype.Repository;


@Repository
public class TVShowRepositoryImpl extends BaseRepositoryImpl<TVShow> implements TVShowRepository {



    @Override
    public TVShow findByTitle(String title) {
        return null;
    }

    @Override
    public TVShow findByYear(String year) {
        return null;
    }


}

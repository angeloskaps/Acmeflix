package com.acmeflix.bootstrap;

import com.acmeflix.base.BaseComponent;
import com.acmeflix.domain.*;
import com.acmeflix.service.AccountService;
import com.acmeflix.service.MovieService;
import com.acmeflix.service.RatingService;
import com.acmeflix.service.TvShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SampleDataGenerator extends BaseComponent implements CommandLineRunner {
    private final AccountService accountService;
    private final MovieService movieService;
    private final TvShowService tvShowService;
    private final RatingService ratingService;

    @Override
    public void run(String... args) throws Exception {
//create dummy accounts
        Account account1 = Account.builder()
                .id(1L)
                .email("test@test.com")
                .username("tester")
                .password("1344365472")
                .phone("6978384185")
                .subscriptionPlan(SubscriptionPlan.BASIC)
                .build();

        Account account2 = Account.builder()
                .id(1L)
                .email("test@test.com")
                .username("thanos")
                .password("afg4524414f")
                .phone("6972324185")
                .subscriptionPlan(SubscriptionPlan.FAMILY)
                .build();

        Account account3 = Account.builder()
                .id(1L)
                .email("test@test.com")
                .username("thanos")
                .password("afg4524414f")
                .phone("6972324185")
                .subscriptionPlan(SubscriptionPlan.PREMIUM)
                .build();

//one way to set Profiles to our accounts
        account1.setProfiles(List.of(
                Profile.builder()
                        .id(1L)
                        .profileNickname("Angelos")
                        .build(),
                Profile.builder()
                        .id(2L)
                        .profileNickname("Thanos")
                        .build(),
                Profile.builder()
                        .id(3L)
                        .profileNickname("Georgia")
                        .build()));

        account2.setProfiles(List.of(
                Profile.builder()
                        .id(1L)
                        .profileNickname("Nikos")
                        .build(),
                Profile.builder()
                        .id(2L)
                        .profileNickname("maria")
                        .build(),
                Profile.builder()
                        .id(3L)
                        .profileNickname("Together")
                        .build()));

//        second way to add profiles via service layer
        accountService.createProfiles(account3,
                Profile.builder()
                        .id(1L)
                        .profileNickname("Takis")
                        .build(),

                Profile.builder()
                        .id(2L)
                        .profileNickname("Manolia")
                        .build(),

                Profile.builder()
                        .id(3L)
                        .profileNickname("Xristos")
                        .build());


        //create movies
        Movie movie1 = Movie.builder()
                .title("Andor")
                .duration(130)
                .year("2022")
                .categories(List.of(Category.ADVENTURE))
                .languages(List.of(Language.ENGLISH))
                .subtitles(List.of(Subtitle.GERMAN, Subtitle.GREEK))
                .build();

        Movie movie2 = Movie.builder()
                .title("The Godfather")
                .duration(255)
                .year("1972")
                .categories(List.of(Category.DRAMA))
                .languages(List.of(Language.ENGLISH))
                .subtitles(List.of(Subtitle.GERMAN, Subtitle.FRENCH, Subtitle.SPANISH))
                .build();

        Movie movie3 = Movie.builder()
                .title("The Dark Knight")
                .duration(255)
                .year("2008")
                .categories(List.of(Category.ACTION, Category.ADVENTURE, Category.DRAMA))
                .languages(List.of(Language.ENGLISH, Language.FRENCH))
                .subtitles(List.of(Subtitle.GERMAN, Subtitle.FRENCH, Subtitle.GREEK))
                .build();

        Movie movie4 = Movie.builder()
                .title("The Godfather Part II")
                .duration(255)
                .year("1974")
                .categories(List.of(Category.DRAMA))
                .languages(List.of(Language.ENGLISH))
                .subtitles(List.of(Subtitle.GERMAN, Subtitle.FRENCH, Subtitle.SPANISH))
                .build();

        movie4.setProgramRecommendations(List.of(movie2));
        movie1.setProgramRecommendations(List.of(movie3));

        //create TV Shows
        TVShow tvShow1 = TVShow.builder()
                .title("Breaking Bad")
                .year("2008")
                .seasons(List.of(Season.builder().id(1L).title("Season 1").build(),
                        Season.builder().id(2L).title("Season 2").build(),
                        Season.builder().id(3L).title("Season 3").build(),
                        Season.builder().id(4L).title("Season 4").build(),
                        Season.builder().id(5L).title("Season 5").build()))
                .languages(List.of(Language.ENGLISH, Language.SPANISH))
                .subtitles(List.of(Subtitle.GERMAN, Subtitle.FRENCH, Subtitle.GREEK))
                .build();

        tvShow1.getSeasons().get(0).setEpisodes(Arrays.asList(
                Episode.builder().id(1L).title("Episode 1").duration(50).build(),
                Episode.builder().id(2L).title("Episode 2").duration(52).build(),
                Episode.builder().id(3L).title("Episode 3").duration(48).build(),
                Episode.builder().id(4L).title("Episode 4").duration(51).build(),
                Episode.builder().id(5L).title("Episode 5").duration(49).build()));

        tvShow1.getSeasons().get(1).setEpisodes(Arrays.asList(
                Episode.builder().id(6L).title("Episode 6").duration(50).build(),
                Episode.builder().id(7L).title("Episode 7").duration(52).build(),
                Episode.builder().id(8L).title("Episode 8").duration(48).build(),
                Episode.builder().id(9L).title("Episode 9").duration(51).build(),
                Episode.builder().id(10L).title("Episode 10").duration(49).build()));

        tvShow1.getSeasons().get(2).setEpisodes(Arrays.asList(
                Episode.builder().id(11L).title("Episode 11").duration(50).build(),
                Episode.builder().id(12L).title("Episode 12").duration(52).build(),
                Episode.builder().id(13L).title("Episode 13").duration(48).build(),
                Episode.builder().id(14L).title("Episode 14").duration(51).build(),
                Episode.builder().id(15L).title("Episode 15").duration(49).build()));

        tvShow1.getSeasons().get(3).setEpisodes(Arrays.asList(
                Episode.builder().id(16L).title("Episode 16").duration(50).build(),
                Episode.builder().id(17L).title("Episode 17").duration(52).build(),
                Episode.builder().id(18L).title("Episode 18").duration(48).build(),
                Episode.builder().id(19L).title("Episode 19").duration(51).build(),
                Episode.builder().id(20L).title("Episode 20").duration(49).build()));

        tvShow1.getSeasons().get(4).setEpisodes(Arrays.asList(
                Episode.builder().id(21L).title("Episode 21").duration(50).build(),
                Episode.builder().id(22L).title("Episode 22").duration(52).build(),
                Episode.builder().id(23L).title("Episode 23").duration(48).build(),
                Episode.builder().id(24L).title("Episode 24").duration(51).build(),
                Episode.builder().id(25L).title("Episode 25").duration(49).build()));

        accountService.createAll(account1, account2, account3);
        movieService.createAll(movie1, movie2, movie3, movie4);
        tvShowService.create(tvShow1);

        TVShow tvShow2 = TVShow.builder()
                .title("Sherlock")
                .year("2010")
                .languages(List.of(Language.ENGLISH, Language.SPANISH))
                .subtitles(List.of(Subtitle.GERMAN, Subtitle.FRENCH, Subtitle.GREEK))
                .build();
        tvShowService.create(tvShow2);

        TVShow tvShowRetrieve = tvShowService.get(2L);

        tvShowService.addSeasons(tvShowRetrieve,
                Season.builder().id(1L).title("Season 1").build(),
                Season.builder().id(2L).title("Season 2").build(),
                Season.builder().id(3L).title("Season 3").build(),
                Season.builder().id(4L).title("Season 4").build(),
                Season.builder().id(5L).title("Season 5").build());

        tvShowService.addEpisodes(tvShowRetrieve.getSeasons().get(3),
                Episode.builder().id(1L).title("Episode 1").duration(50).build(),
                Episode.builder().id(2L).title("Episode 2").duration(52).build(),
                Episode.builder().id(3L).title("Episode 3").duration(48).build(),
                Episode.builder().id(4L).title("Episode 4").duration(51).build(),
                Episode.builder().id(5L).title("Episode 5").duration(49).build(),
                Episode.builder().id(6L).title("Episode 6").duration(49).build());

        tvShowService.update(tvShow2);
        logger.info("Get all the saved data");
        accountService.findAll();
        movieService.findAll();
        tvShowService.findAll();

        logger.info("Add ratings to movies and TVshows");

        Account retrievedAccount1 = accountService.get(1L);
        ratingService.rate(movieService.get(1L), retrievedAccount1.getProfiles().get(0), 4.2);
        ratingService.rate(movieService.get(2L), retrievedAccount1.getProfiles().get(0), 4.1);
        ratingService.rate(movieService.get(3L), retrievedAccount1.getProfiles().get(0), 4.2);
        ratingService.rate(tvShowService.get(1L), retrievedAccount1.getProfiles().get(0), 4.9);
        ratingService.rate(tvShowService.get(2L), retrievedAccount1.getProfiles().get(0), 4.5);
        ratingService.rate(tvShowService.get(3L), retrievedAccount1.getProfiles().get(0), 4.4);

        Account retrievedAccount2 = accountService.get(2L);
        ratingService.rate(movieService.get(1L), retrievedAccount2.getProfiles().get(0), 4.8);
        ratingService.rate(movieService.get(2L), retrievedAccount2.getProfiles().get(0), 4.2);
        ratingService.rate(tvShowService.get(1L), retrievedAccount2.getProfiles().get(0), 4.3);
        ratingService.rate(tvShowService.get(2L), retrievedAccount2.getProfiles().get(0), 4.4);

        Account retrievedAccount3 = accountService.get(3L);
        ratingService.rate(movieService.get(1L), retrievedAccount3.getProfiles().get(0), 4.3);
        ratingService.rate(movieService.get(2L), retrievedAccount3.getProfiles().get(0), 4.2);
        ratingService.rate(movieService.get(3L), retrievedAccount3.getProfiles().get(0), 4.1);
        ratingService.rate(tvShowService.get(1L), retrievedAccount3.getProfiles().get(0), 4.8);
        ratingService.rate(tvShowService.get(2L), retrievedAccount3.getProfiles().get(0), 3.9);
        ratingService.rate(tvShowService.get(3L), retrievedAccount3.getProfiles().get(0), 4.1);
    }
}
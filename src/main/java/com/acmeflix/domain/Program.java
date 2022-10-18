package com.acmeflix.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class Program extends BaseModel {
    private String title;
    private String year;
    private List<Category> categories;
    List<Program> programRecommendations;
    private List<Language> languages;
    private List<Subtitle> subtitles;


}

package com.acmeflix.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class Season extends BaseModel {
    private String title;
    List<Episode> episodes;
}

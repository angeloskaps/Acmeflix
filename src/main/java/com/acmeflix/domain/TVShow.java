package com.acmeflix.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class TVShow extends Program {
    private List<Season> seasons;

}

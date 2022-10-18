package com.acmeflix.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Movie extends Program {
    private int duration;
}

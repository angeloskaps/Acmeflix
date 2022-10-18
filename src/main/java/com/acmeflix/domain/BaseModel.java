package com.acmeflix.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@Data
@SuperBuilder
public abstract class BaseModel implements Serializable {
    // Indicates that an annotated field or method is part of the serialization mechanism defined by the Java Object Serialization Specification.
    @Serial
    public static final Long serialVersionUID = 1L;
    Long id;
}

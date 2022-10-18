package com.acmeflix.domain;

import java.math.BigDecimal;

public enum SubscriptionPlan {
    BASIC(new BigDecimal(5.99)),
    FAMILY(new BigDecimal(9.99)),
    PREMIUM(new BigDecimal(14.99));
    private final BigDecimal subscription;

    SubscriptionPlan(BigDecimal subscription) {
        this.subscription = subscription;
    }

}








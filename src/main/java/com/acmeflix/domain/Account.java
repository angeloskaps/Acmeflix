package com.acmeflix.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class Account extends BaseModel {
    private String username;
    private String password;
    private String email;
    private String phone;
    private SubscriptionPlan subscriptionPlan;
    private List<Profile> profiles;
}

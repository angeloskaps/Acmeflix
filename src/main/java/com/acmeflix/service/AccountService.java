package com.acmeflix.service;

import com.acmeflix.domain.Account;
import com.acmeflix.domain.Profile;
import com.acmeflix.domain.SubscriptionPlan;

public interface AccountService extends BaseService<Account, Long> {

    void resetPassword(Account account, String password);

    void createProfiles(Account account, Profile... profiles);

    void addSubscriptionPlan(Account account, SubscriptionPlan subscriptionPlan);
}

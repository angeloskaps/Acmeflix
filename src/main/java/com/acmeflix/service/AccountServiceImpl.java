package com.acmeflix.service;

import com.acmeflix.domain.Account;
import com.acmeflix.domain.Profile;
import com.acmeflix.domain.SubscriptionPlan;
import com.acmeflix.repository.AccountRepository;
import com.acmeflix.repository.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public BaseRepository<Account, Long> getRepository() {
        return this.accountRepository;
    }


    @Override
    public void resetPassword(final Account account, final String password) {
        account.setPassword(password);
        logger.info("Password successfully changed to: {}", password);

    }

    @Override
    public void createProfiles(final Account account, final Profile... profiles) {
        account.setProfiles(new ArrayList<>());
        Arrays.stream(profiles).forEach(profile -> account.getProfiles().add(profile));
    }

    @Override
    public void addSubscriptionPlan(Account account, SubscriptionPlan subscriptionPlan) {
        account.setSubscriptionPlan(subscriptionPlan);
    }


}

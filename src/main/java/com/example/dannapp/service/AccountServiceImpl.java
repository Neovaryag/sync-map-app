package com.example.dannapp.service;

import com.example.dannapp.model.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import static com.example.dannapp.common.Cash.accountMap;

@Service
public class AccountServiceImpl implements AccountService {

    final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Override
    public Account sentToAccount(Account request) {
        final var account = new Account();
        accountMap.merge(request.accountNumber(), request, (v1, v2) ->
                new Account(v1.accountNumber(), v1.totalBalance() + v2.totalBalance()));
        account.setAccountNumber(request.accountNumber());
        account.setTotalBalance(request.totalBalance());
        log.info("Сумма {} получена в акаунте {} ", request.totalBalance(), request.accountNumber());

        return accountMap.get(request.accountNumber());
    }
}

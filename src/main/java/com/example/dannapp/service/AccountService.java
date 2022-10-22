package com.example.dannapp.service;

import com.example.dannapp.model.Account;

public interface AccountService {

    /**
     * Отправка сообщений с одного счета на другой
     *
     * @param request Account
     * @return Account
     */
    Account sentToAccount(Account request);
}

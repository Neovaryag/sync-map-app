package com.neovaryag.syncMapApp.service;

import com.neovaryag.syncMapApp.model.Account;

public interface AccountService {

    /**
     * Отправка сообщений с одного счета на другой
     *
     * @param request Account
     * @return Account
     */
    Account sentToAccount(Account request);
}

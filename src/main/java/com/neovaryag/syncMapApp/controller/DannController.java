package com.neovaryag.syncMapApp.controller;

import com.neovaryag.syncMapApp.model.Account;
import com.neovaryag.syncMapApp.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.neovaryag.syncMapApp.common.PathsConst.METHOD_SENT_TO_ACCOUNT;

@RestController
public class DannController {

    static Logger log = LoggerFactory.getLogger(DannController.class);

    private final AccountService accountService;

    public DannController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping(value = METHOD_SENT_TO_ACCOUNT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Account sentToAccount(@RequestBody Account request) {
        log.info("Отправлена сумма {} в акаунт {}", request.totalBalance(), request.accountNumber());
        return accountService.sentToAccount(request);
    }
}

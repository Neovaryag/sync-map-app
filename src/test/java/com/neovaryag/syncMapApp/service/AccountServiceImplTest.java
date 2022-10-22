package com.neovaryag.syncMapApp.service;

import com.neovaryag.syncMapApp.common.Cash;
import com.neovaryag.syncMapApp.model.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountServiceImplTest {

    @Autowired
    private AccountServiceImpl accountServiceImpl;

    @Test
    void testSentToAccount() {
        for (int i = 0; i < 10; i++) {
            var thread1 = new Thread(() -> {
                    accountServiceImpl.sentToAccount(new Account("18", 666));
                    accountServiceImpl.sentToAccount(new Account("14", 999));

            });
            var thread2 = new Thread(() -> {
                    accountServiceImpl.sentToAccount(new Account("18", 666));
                    accountServiceImpl.sentToAccount(new Account("14", 999));
            });
            thread1.start();
            thread2.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assertions.assertEquals(2, Cash.accountMap.size());
        Assertions.assertEquals(13320, Cash.accountMap.get("18").totalBalance());
        Assertions.assertEquals(19980, Cash.accountMap.get("14").totalBalance());
    }
}
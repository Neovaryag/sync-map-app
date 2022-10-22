package com.neovaryag.syncMapApp.common;

import com.neovaryag.syncMapApp.model.Account;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cash {
    public static Map<String, Account> accountMap = Collections.synchronizedMap(new HashMap<>());
}

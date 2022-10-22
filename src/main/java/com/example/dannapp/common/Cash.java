package com.example.dannapp.common;

import com.example.dannapp.model.Account;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cash {
    public static Map<String, Account> accountMap = Collections.synchronizedMap(new HashMap<>());
}

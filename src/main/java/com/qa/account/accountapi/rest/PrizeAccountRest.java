package com.qa.account.accountapi.rest;

import com.qa.account.accountapi.persistence.domain.PrizeAccount;
import com.qa.account.accountapi.service.PrizeAccountService;
import com.qa.account.accountapi.util.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping(Constants.URL_BASE)
@RestController
public class PrizeAccountRest {

    @Autowired
    private PrizeAccountService service;

    @GetMapping(Constants.URL_GET_ACCOUNTS)
    public List<PrizeAccount> getAccounts() {
        return service.getAccounts();
    }

    @GetMapping(Constants.URL_GET_ACCOUNT_BY_ID)
    public PrizeAccount getAccount(@PathVariable Long id) {
        return service.getAccount(id);
    }

    @PostMapping(Constants.URL_ADD_ACCOUNT)
    public ResponseEntity<PrizeAccount> createAccount(@RequestBody PrizeAccount prizeAccount) {
        return service.createAccount(prizeAccount);
    }

    @GetMapping(Constants.URL_GET_WINNINGS)
    public int getAccount(@PathVariable String accountNum) {
        return service.getWinnings(accountNum);
    }


}

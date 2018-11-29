package com.qa.account.accountapi.rest;

import com.qa.account.accountapi.persistence.domain.Prize;
import com.qa.account.accountapi.service.PrizeService;
import com.qa.account.accountapi.util.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping(Constants.URL_BASE)
@RestController
public class PrizeAccountRest {

    @Autowired
    private PrizeService service;

    @CrossOrigin(origins = Constants.CORS)
    @GetMapping(Constants.URL_GET_ACCOUNTS)
    public List<Prize> getAccounts() {
        return service.getAccounts();
    }

    @CrossOrigin(origins = Constants.CORS)
    @GetMapping(Constants.URL_GET_ACCOUNT_BY_ID)
    public Prize getAccount(@PathVariable Long id) {
        return service.getAccount(id);
    }

    @CrossOrigin(origins = Constants.CORS)
    @GetMapping(Constants.URL_ADD_ACCOUNT + "/{accountNum}")
    public Prize createAccount(@PathVariable String accountNum) {
        return service.createAccount(accountNum);
    }

    @CrossOrigin(origins = Constants.CORS)
    @GetMapping(Constants.URL_GET_WINNINGS)
    public int getAccount(@PathVariable String accountNum) {
        return service.getWinnings(accountNum);
    }

}

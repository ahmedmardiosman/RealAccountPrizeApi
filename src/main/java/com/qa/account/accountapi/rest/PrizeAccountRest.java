package com.qa.account.accountapi.rest;

import com.qa.account.accountapi.persistence.domain.Prize;
import com.qa.account.accountapi.service.PrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("${path.base}")
@RestController
public class PrizeAccountRest {

    @Autowired
    private PrizeService service;

    @GetMapping("${path.getAccounts}")
    public List<Prize> getAccounts() {
        return service.getAccounts();
    }

    @GetMapping("${path.getAccountById}")
    public Prize getAccount(@PathVariable Long id) {
        return service.getAccount(id);
    }

    @GetMapping("${path.addAccount}")
    public Prize createAccount(@PathVariable String accountNum) {
        return service.createAccount(accountNum);
    }

    @GetMapping("${path.getWinnings}")
    public int getAccount(@PathVariable String accountNum) {
        return service.getWinnings(accountNum);
    }

}

package com.qa.account.accountapi.service;

import com.qa.account.accountapi.persistence.domain.PrizeAccount;
import com.qa.account.accountapi.persistence.repository.PrizeAccountRepository;


import com.qa.account.accountapi.util.Prize;
import com.qa.account.accountapi.util.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class PrizeAccountServiceImpl implements PrizeAccountService {

    @Autowired
    private PrizeAccountRepository repo;

    @Override
    public List<PrizeAccount> getAccounts() {
        return repo.findAll();
    }

    @Override
    public PrizeAccount getAccount(Long id) {
        Optional<PrizeAccount> account = repo.findById(id);

        return account.get();
    }

    @Override
    public ResponseEntity<PrizeAccount> createAccount(PrizeAccount prizeAccount) {
        prizeAccount.setPrizeWinnings(getWinnings(prizeAccount.getAccountId()));
        prizeAccount.setDate(new SimpleDateFormat(Constants.DATE_FORMAT).format(new Date()));
        PrizeAccount savedPrizeAccount = repo.save(prizeAccount);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path(Constants.URI_LOCATION).buildAndExpand(savedPrizeAccount.getAccountId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @Override
    public int getWinnings(String accountNum) {
        return new Prize(accountNum).checkNumber(accountNum);
    }


}

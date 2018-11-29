package com.qa.account.accountapi.service;

import com.qa.account.accountapi.persistence.domain.Prize;
import com.qa.account.accountapi.persistence.repository.PrizeRepository;
import com.qa.account.accountapi.util.PrizeCalculator;
import com.qa.account.accountapi.util.constants.Constants;
import com.qa.account.accountapi.util.exceptions.AccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class PrizeAccountServiceImpl implements PrizeService {

    @Autowired
    private PrizeRepository repo;

    @Override
    public List<Prize> getAccounts() {
        return repo.findAll();
    }

    @Override
    public Prize getAccount(Long id) {
        Optional<Prize> account = repo.findById(id);
        return account.orElseThrow(() -> new AccountNotFoundException(id.toString()));
    }

    @Override
    public Prize createAccount(String accountNum) {
        return new Prize(getWinnings(accountNum), new SimpleDateFormat(Constants.DATE_FORMAT).format(new Date()));
    }

    @Override
    public int getWinnings(String accountNum) {
        return PrizeCalculator.calculatePrize(accountNum);
    }

}
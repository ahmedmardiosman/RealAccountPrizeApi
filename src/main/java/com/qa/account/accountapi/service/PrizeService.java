package com.qa.account.accountapi.service;

import com.qa.account.accountapi.persistence.domain.Prize;
import java.util.List;

public interface PrizeService {

    List<Prize> getAccounts();

    Prize getAccount(Long id);

    Prize createAccount(String accountNum);

    int getWinnings(String accountNum);
}

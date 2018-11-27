package com.qa.accountGenerator.accountapi.service;

import com.qa.accountGenerator.accountapi.persistence.domain.PrizeAccount;
import org.springframework.http.ResponseEntity;
import java.util.List;

public interface PrizeAccountService {

    List<PrizeAccount> getAccounts();

    PrizeAccount getAccount(Long id);

    ResponseEntity<PrizeAccount> createAccount(PrizeAccount prizeAccount);

    int getWinnings(String accountNum);
}

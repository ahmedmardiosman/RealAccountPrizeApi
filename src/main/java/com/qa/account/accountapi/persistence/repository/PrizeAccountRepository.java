package com.qa.account.accountapi.persistence.repository;

import com.qa.account.accountapi.persistence.domain.PrizeAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrizeAccountRepository extends JpaRepository<PrizeAccount, Long> {
}

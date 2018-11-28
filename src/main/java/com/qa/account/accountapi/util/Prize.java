package com.qa.account.accountapi.util;

import com.qa.account.accountapi.util.constants.Constants;
import com.qa.account.accountapi.util.exceptions.WrongAccountLengthException;
import com.qa.account.accountapi.util.exceptions.WrongAccountTypeException;
import org.springframework.beans.factory.annotation.Autowired;

import static com.qa.account.accountapi.util.constants.Constants.CASH_PRIZE_A;
import static com.qa.account.accountapi.util.constants.Constants.CASH_PRIZE_B;

public class Prize {

    private String accNum;

    public Prize(){

    }

    public Prize(String accNum){
        this.accNum = accNum;
    }

    public int checkNumber(String accNum){
        String accountType = accNum.substring(0,1);

        if(accountType.equals(Constants.ACCOUNT_TYPE_A)){
           return getCashPrize(accountType, accNum.length());
        }else if(accountType.equals(Constants.ACCOUNT_TYPE_B)){
            return getCashPrize(accountType, accNum.length());
        }else if(accountType.equals(Constants.ACCOUNT_TYPE_C)){
            return 0;
        }else{
            throw new WrongAccountTypeException(accountType.toString());
        }

    }

    private int getCashPrize(String accType, int size){
        int cash = (accType.equals(Constants.ACCOUNT_TYPE_A) ? CASH_PRIZE_A : CASH_PRIZE_B);

        boolean accountLengthIsSix = size==Constants.ACCOUNT_LENGTH_SIX;
        boolean accountLengthIsEight = size==Constants.ACCOUNT_LENGTH_EIGHT;
        boolean accountLengthIsTen = size==Constants.ACCOUNT_LENGTH_TEN;

        if(accountLengthIsSix){
            return cash*1;
        }else if(accountLengthIsEight){
            return cash*4;
        }else if(accountLengthIsTen){
            return cash*16;
        }else{
            throw new WrongAccountLengthException((size-2)+"");
        }
    }

    @Autowired
    public void setAccNum(String accNum){
        this.accNum=accNum;
    }

    public String getAccNum(){
        return accNum;
    }

}

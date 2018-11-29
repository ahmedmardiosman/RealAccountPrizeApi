package com.qa.account.accountapi.util;

import com.qa.account.accountapi.util.constants.Constants;
import com.qa.account.accountapi.util.exceptions.WrongAccountLengthException;
import com.qa.account.accountapi.util.exceptions.WrongAccountTypeException;
import static com.qa.account.accountapi.util.constants.Constants.CASH_PRIZE_A;
import static com.qa.account.accountapi.util.constants.Constants.CASH_PRIZE_B;

public class PrizeCalculator {


    public static int calculatePrize(String accNum){
        String accountType = accNum.substring(0,1);

        switch (accountType) {
            case Constants.ACCOUNT_TYPE_A:
                return getCashPrize(accountType, accNum.length());
            case Constants.ACCOUNT_TYPE_B:
                return getCashPrize(accountType, accNum.length());
            case Constants.ACCOUNT_TYPE_C:
                return 0;
            default:
                throw new WrongAccountTypeException(accountType);
        }
    }

    private static int getCashPrize(String accType, int length){
        int cash = (accType.equals(Constants.ACCOUNT_TYPE_A) ? CASH_PRIZE_A : CASH_PRIZE_B);

        switch(length){
            case Constants.ACCOUNT_LENGTH_SIX:
                return cash*1;
            case Constants.ACCOUNT_LENGTH_EIGHT:
                return cash*4;
            case Constants.ACCOUNT_LENGTH_TEN:
                return cash*16;
            default:
                throw new WrongAccountLengthException((length-2)+"");
        }
    }

}

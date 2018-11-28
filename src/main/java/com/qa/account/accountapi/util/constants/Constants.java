package com.qa.account.accountapi.util.constants;

public class Constants {

    public static final int ACCOUNT_LENGTH_SIX = 8;
    public static final int ACCOUNT_LENGTH_EIGHT = 10;
    public static final int ACCOUNT_LENGTH_TEN = 12;

    public static final String ACCOUNT_TYPE_A = "A";
    public static final String ACCOUNT_TYPE_B = "B";
    public static final String ACCOUNT_TYPE_C = "C";

    public static final int CASH_PRIZE_A = 25;
    public static final int CASH_PRIZE_B = 50;

    public static final String URL_BASE = "/prize";
    public static final String URL_GET_ACCOUNTS = "/getAccounts";
    public static final String URL_GET_ACCOUNT_BY_ID = "/getAccount/{id}";
    public static final String URL_ADD_ACCOUNT = "/addAccount";
    public static final String URL_GET_WINNINGS = "/getWinnings/{accountNum}";

    public static final String DATE_FORMAT = "dd-MM-yyyy";
    public static final String URI_LOCATION = "/{id}";

    public static final String CORS = "*";

}

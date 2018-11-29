package com.qa.account.accountapi.util.exceptions;

public class WrongAccountLengthException extends RuntimeException {

    public WrongAccountLengthException(String exception){
        super("Invalid Account Length Supplied. Actual: " + exception + ". Expected: 6, 8, 10");
    }

}

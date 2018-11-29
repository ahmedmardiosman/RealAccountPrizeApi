package com.qa.account.accountapi.util.exceptions;

public class WrongAccountTypeException extends RuntimeException {

    public WrongAccountTypeException(String exception){
        super("Invalid Account Type Supplied. Actual: " + exception + ". Expected: A, B, C");
    }

}

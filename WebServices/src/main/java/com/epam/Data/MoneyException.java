package com.epam.Data;

class MoneyExchangeException extends Exception {
    private String message;

    MoneyExchangeException(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

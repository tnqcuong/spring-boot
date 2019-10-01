package com.org.prototype.example.exception;

public class MemberAlreadyExistException extends RuntimeException {


    public MemberAlreadyExistException() {
    }

    public MemberAlreadyExistException(String s) {
        super(s);
    }

    public MemberAlreadyExistException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public MemberAlreadyExistException(Throwable throwable) {
        super(throwable);
    }

    public MemberAlreadyExistException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}

package com.partharoypc.planetexpress.Model;

public class SignupResponseModelClass {
    String message;

    public SignupResponseModelClass() {
    }

    public SignupResponseModelClass(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

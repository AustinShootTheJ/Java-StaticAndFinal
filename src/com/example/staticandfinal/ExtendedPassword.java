package com.example.staticandfinal;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    // used to override the store password method and view password prior to encryption.
//    @Override
//    public void storePassword(){
//        System.out.println("saving password as " + this.decryptedPassword);
//
//    }

}

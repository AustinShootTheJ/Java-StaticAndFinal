package com.example.staticandfinal;

// a very basic example of password encryption we will demo why we might want to set a class as final to prevent it from being
// extended.

public class Password {

    private static final int key = 748;
    private final int encryptedPassword;

    public Password(int password){
        this.encryptedPassword = encryptDecrypt(password);

    }

    private int encryptDecrypt(int password){
        return password ^ key;
    }

    // made final to prevent overriding in Extended Password allowing us to view the non encrypted password.
    public final void storePassword(){
        System.out.println("Saving password as " + this.encryptedPassword);

    }

    public boolean letMeIn(int password){
        if(encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return true;

    }else{
            System.out.println("Nope, you cannot come in ");
            return false;

}
    }

}

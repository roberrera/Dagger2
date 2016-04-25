package com.roberterrera.dagger2.classes;

/**
 * Created by Rob on 4/25/16.
 */
public class NetworkApi {

    public boolean validateUser (String username, String password){
        // A real network call would go here.
        if (username == null || username.length() == 0){
            return false;
        } else {
            return true;
        }
    }

}

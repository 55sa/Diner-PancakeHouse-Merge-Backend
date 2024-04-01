package edu.iu.habahram.DinerPancakeHouseMerge.model;

public class Customer {

    String username;

    String password;


    String email;

    public Customer(String username) {
        this.username = username;
    }

    public Customer(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String username() {
        return username;
    }


    public String email() {
        return email;
    }

    public String password() {
        return password;
    }
}

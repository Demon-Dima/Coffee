package com.ITcoffee.CoffeeShop.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

    public Users() {
    }

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String user_first_name, user_last_name, user_email_address, user_password;

    boolean This_is_a_blocked_user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_first_name() {
        return user_first_name;
    }

    public void setUser_first_name(String user_first_name) {
        this.user_first_name = user_first_name;
    }

    public String getUser_last_name() {
        return user_last_name;
    }

    public void setUser_last_name(String user_last_name) {
        this.user_last_name = user_last_name;
    }

    public String getUser_email_address() {
        return user_email_address;
    }

    public void setUser_email_address(String user_email_address) {
        this.user_email_address = user_email_address;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public boolean isThis_is_a_blocked_user() {
        return This_is_a_blocked_user;
    }

    public void setThis_is_a_blocked_user(boolean this_is_a_blocked_user) {
        This_is_a_blocked_user = this_is_a_blocked_user;
    }

    public Users(String user_first_name, String user_last_name, String user_email_address, String user_password, boolean this_is_a_blocked_user) {
        this.user_first_name = user_first_name;
        this.user_last_name = user_last_name;
        this.user_email_address = user_email_address;
        this.user_password = user_password;
        This_is_a_blocked_user = this_is_a_blocked_user;
    }
}

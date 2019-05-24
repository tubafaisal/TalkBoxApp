package com.example.talkbox.Activities;

public class UserModel {
    private String Name;
    private String Email;
    private String Password;
    private String PasswordRep;
    private String Phone;



    public UserModel() {
    }
    public UserModel(String name, String email, String password, String passwordRep, String phone) {
        Name = name;
        Email = email;
        Password = password;
        PasswordRep = passwordRep;
        Phone = phone;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPasswordRep() {
        return PasswordRep;
    }

    public void setPasswordRep(String passwordRep) {
        PasswordRep = passwordRep;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}

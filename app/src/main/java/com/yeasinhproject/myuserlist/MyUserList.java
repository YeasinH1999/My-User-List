package com.yeasinhproject.myuserlist;

import com.android.volley.toolbox.StringRequest;

public class MyUserList {

    private String userImg;
    private String nameOne;
    private String lastName;
    private String userAge;
    private String userGender;
    private String userBloodG;
    private String userEyeC;
    private String userBirthDay;
    private String btn_user_phone;
    private String btn_user_email;
    private String btn_user_web;

    public String userAddress, userCity, userPostalCode, userState,
            userCardNum, userCardType, userCurrency, userCardExpire,
            userCard_iban, userComName, userComTitle,
            userComDep, userComAdd;


    public MyUserList(String userImg, String nameOne, String lastName, String userAge, String userGender, String userBloodG, String userEyeC, String userBirthDay, String btn_user_phone, String btn_user_email, String btn_user_web, String userAddress, String userCity, String userPostalCode, String userState, String userCardNum, String userCardType, String userCurrency, String userCardExpire, String userCard_iban, String userComName, String userComTitle, String userComDep, String userComAdd) {
        this.userImg = userImg;
        this.nameOne = nameOne;
        this.lastName = lastName;
        this.userAge = userAge;
        this.userGender = userGender;
        this.userBloodG = userBloodG;
        this.userEyeC = userEyeC;
        this.userBirthDay = userBirthDay;
        this.btn_user_phone = btn_user_phone;
        this.btn_user_email = btn_user_email;
        this.btn_user_web = btn_user_web;
        this.userAddress = userAddress;
        this.userCity = userCity;
        this.userPostalCode = userPostalCode;
        this.userState = userState;
        this.userCardNum = userCardNum;
        this.userCardType = userCardType;
        this.userCurrency = userCurrency;
        this.userCardExpire = userCardExpire;
        this.userCard_iban = userCard_iban;
        this.userComName = userComName;
        this.userComTitle = userComTitle;
        this.userComDep = userComDep;
        this.userComAdd = userComAdd;
    }

    public String getUserImg() {
        return userImg;
    }

    public String getNameOne() {
        return nameOne;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserAge() {
        return userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public String getUserBloodG() {
        return userBloodG;
    }

    public String getUserEyeC() {
        return userEyeC;
    }

    public String getUserBirthDay() {
        return userBirthDay;
    }

    public String getBtn_user_phone() {
        return btn_user_phone;
    }

    public String getBtn_user_email() {
        return btn_user_email;
    }

    public String getBtn_user_web() {
        return btn_user_web;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserCity() {
        return userCity;
    }

    public String getUserPostalCode() {
        return userPostalCode;
    }

    public String getUserState() {
        return userState;
    }

    public String getUserCardNum() {
        return userCardNum;
    }

    public String getUserCardType() {
        return userCardType;
    }

    public String getUserCurrency() {
        return userCurrency;
    }

    public String getUserCardExpire() {
        return userCardExpire;
    }

    public String getUserCard_iban() {
        return userCard_iban;
    }

    public String getUserComName() {
        return userComName;
    }

    public String getUserComTitle() {
        return userComTitle;
    }

    public String getUserComDep() {
        return userComDep;
    }

    public String getUserComAdd() {
        return userComAdd;
    }
}

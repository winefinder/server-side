package com.ssf.prototype.wwine.model;

public class User {
    //TODO  User Schema의 수정이 필요해보인다.
    // CreatedTime , LogIn Time, Last LogIn Time
    private final String userId;
    private String userNickname;
    private String userName;
    private String userEmail;
    private String userGender;
    private String userAge;
    private String userImage;
    private String userPhone;


    public User(String userId, String userNickname,String userName){
        this.userId = userId ;
        this.userNickname = userNickname;
        this.userName = userName;
        this.userEmail= null;
        this.userGender= null;
        this.userAge= null;
        this.userImage= null;
        this.userPhone= null;
    }

    public String getUserId() { return userId; }

    public String getUserNickname() {
        return userNickname;
    }

    public String getUserName() { return userName; }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public String getUserAge() {
        return userAge;
    }

    public String getUserImage() {
        return userImage;
    }

    public String getUserPhone() {
        return userPhone;
    }
}

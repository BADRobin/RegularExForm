package oleg.bryl.controller;

public class AlreadyRegistered extends Exception{
    private String firstName;
    private String name;
    private String middleName;
    private String nickName;
    private String homePhone;
    private String mobilePhone;
    private String mobilePhone2;
    private String email;
    private String skype;

    public String addFirstName() {
        return firstName;
    }
    public String addName() {
        return name;
    }

    public String addMiddleName() {
        return firstName;
    }
    public String addNickName() {
        return nickName;
    }
    public String addHomePhone() {
        return homePhone;
    }
    public String addMobilePhone() {
        return mobilePhone;
    }
    public String addMobilePhone2() {
        return mobilePhone2;
    }
    public String addEmail() {
        return email;
    }
    public String addSkype() {
        return skype;
    }


    public AlreadyRegistered(String message, String addFirstName, String addName,
                             String addMiddleName, String addNickName, String addHomePhone,
                             String addMobilePhone, String addMobilePhone2, String addEmail, String addSkype) {
        super(message);
        this.firstName = addFirstName;
        this.name = addName;
        this.middleName = addMiddleName;
        this.nickName = addNickName;
        this.homePhone = addHomePhone;
        this.mobilePhone = addMobilePhone;
        this.mobilePhone2 = addMobilePhone2;
        this.email = addEmail;
        this.skype = addSkype;
    }
}

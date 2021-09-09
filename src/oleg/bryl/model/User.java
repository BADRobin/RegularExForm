package oleg.bryl.model;

import oleg.bryl.view.View;

import java.util.Date;
import java.util.Scanner;

import static oleg.bryl.model.Gruppen.*;
import static oleg.bryl.model.Gruppen.Группа3;

public class User {
    private View view;
    private Scanner scanner;

    private String firstName;
    private String name;
    private String middleName;
    private String nickName;
    private String comment;
    Gruppen groups = Gruppen.valueOf(Group1, Group2, Group3, Группа1, Группа2, Группа3);
    private String homePhone;
    private String mobilePhone;
    private String mobilePhone2;
    private String email;
    private String skype;
    private String addressIndex;
    private String city;
    private String street;
    private String homeNumber;
    private String roomNumber;
    private Date creation;
    private Date modification;

    public User(View view, Scanner scanner, String firstName, String name, String middleName,
                String nickName, String comment, Gruppen groups, String homePhone,
                String mobilePhone, String mobilePhone2, String email, String skype,
                String addressIndex, String city, String street, String homeNumber,
                String roomNumber, Date creation, Date modification) throws new SkypeNameIsRegistered {
        if
        this.view = view;
        this.scanner = scanner;
        this.firstName = firstName;
        this.name = name;
        this.middleName = middleName;
        this.nickName = nickName;
        this.comment = comment;
        this.groups = groups;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.mobilePhone2 = mobilePhone2;
        this.email = email;
        this.skype = skype;
        this.addressIndex = addressIndex;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        this.roomNumber = roomNumber;
        this.creation = creation;
        this.modification = modification;
    }

    public User(String fullName, String nickName, String comment, Gruppen groups, String fullPhonesNumber, String email, String skype, String fullAddress, Date creation, Date modification) {
    }

    public View getView() {
        return view;
    }
    public void setView(View view) {
        this.view = view;
    }
    public Scanner getScanner() {
        return scanner;
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Gruppen getGroups() {
        return groups;
    }
    public void setGroups(Gruppen groups) {
        this.groups = groups;
    }
    public String getHomePhone() {
        return homePhone;
    }
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    public String getMobilePhone2() {
        return mobilePhone2;
    }
    public void setMobilePhone2(String mobilePhone2) {
        this.mobilePhone2 = mobilePhone2;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSkype() {
        return skype;
    }
    public void setSkype(String skype) {
        this.skype = skype;
    }
    public String getAddressIndex() {
        return addressIndex;
    }
    public void setAddressIndex(String addressIndex) {
        this.addressIndex = addressIndex;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getHomeNumber() {
        return homeNumber;
    }
    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }
    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public Date getCreation() {
        return creation;
    }
    public void setCreation(Date creation) {
        this.creation = creation;
    }
    public Date getModification() {
        return modification;
    }
    public void setModification(Date modification) {
        this.modification = modification;
    }
    public  String getFullAddress() {
        return addressIndex + " " + city + " " + street + " " + homeNumber + " " + roomNumber;
    }
    public String getFullName() {
        return firstName + " " + name + " " + middleName;
    }

    @Override
    public String toString() {
        return "User{" +
                "view=" + view +
                ", scanner=" + scanner +
                ", firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comment='" + comment + '\'' +
                ", groups=" + groups +
                ", homePhone='" + homePhone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", mobilePhone2='" + mobilePhone2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", addressIndex='" + addressIndex + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", creation=" + creation +
                ", modification=" + modification +
                '}';
    }
}

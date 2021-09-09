package oleg.bryl.model;

import oleg.bryl.controller.ControllerUtility;
import oleg.bryl.view.View;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static oleg.bryl.model.Gruppen.*;
import static oleg.bryl.model.RegexForm.*;
import static oleg.bryl.view.InputForm.*;

public class Model {
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

    /**
     *
     * @param view
     * @param scanner
     */
    public Model(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public Model() {

    }
    public void addUser(){
        ControllerUtility controllerUtility = new ControllerUtility(scanner, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_FIRST_NAME_UA : REGEX_FIRST_NAME_EN;
        String str1 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_NAME_UA : REGEX_NAME_EN;
        String str2 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_MIDDLE_NAME_UA : REGEX_MIDDLE_NAME_EN;

        String str3 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_GROUPS_UA : REGEX_GROUPS_EN;
        String str4 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_CITY_UA : REGEX_CITY_EN;
        String str5 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_STREET_UA : REGEX_STREET_EN;
        String str6 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_HOME_NUMBER_UA : REGEX_HOME_NUMBER_EN;
        String str7 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_ROOM_NUMBER_UA : REGEX_ROOM_NUMBER_EN;


        this.firstName = controllerUtility.inputValueFromScanner(FIRST_NAME, str);
        this.name = controllerUtility.inputValueFromScanner(NAME, str1);
        this.middleName = controllerUtility.inputValueFromScanner(MIDDLE_NAME, str2);

        this.groups = Gruppen.valueOf(controllerUtility.inputValueFromScanner(GROUPS, str3));
        this.homePhone = controllerUtility.inputValueFromScanner(HOME_PHONE, REGEX_HOME_PHONE);
        this.mobilePhone = controllerUtility.inputValueFromScanner(MOBILE_PHONE, REGEX_MOBILE_PHONE);
        this.mobilePhone2 = controllerUtility.inputValueFromScanner(MOBILE_PHONE2, REGEX_MOBILE_PHONE);
        this.email = controllerUtility.inputValueFromScanner(EMAIL, REGEX_EMAIL);
        this.skype = controllerUtility.inputValueFromScanner(SKYPE, REGEX_SKYPE) ;
        this.addressIndex = controllerUtility.inputValueFromScanner(ADDRESS_INDEX, REGEX_ADDRESS_INDEX) ;
        this.city = controllerUtility.inputValueFromScanner(CITY, str4);
        this.street = controllerUtility.inputValueFromScanner(STREET, str5);
        this.homeNumber = controllerUtility.inputValueFromScanner(HOME_NUMBER, str6);
        this.roomNumber = controllerUtility.inputValueFromScanner(ROOM_NUMBER, str7);
    }
    public void addNickName(){
        ControllerUtility controllerUtility = new ControllerUtility(scanner, view);
        this.nickName = controllerUtility.inputValueFromScanner(NICK_NAME, REGEX_NICK_NAME);
    }
    public void addComment(){
        ControllerUtility controllerUtility = new ControllerUtility(scanner, view);
        String comm = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_COMMENT_UA : REGEX_COMMENT_EN;
        this.comment = controllerUtility.inputValueFromScanner(COMMENT, comm);
    }





//Создаем getter
    public String getFirstName() {
        return firstName;
    }
    public String getName() {
        return name;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getNickName() {
        return nickName;
    }
    public String getComment() {
        return comment;
    }
    public Gruppen getGroups() {
        return groups;
    }
    public String getHomePhone() {
        return homePhone;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
    public String getMobilePhone2() {
        return mobilePhone2;
    }
    public String getEmail() {
        return email;
    }
    public String getSkype() {
        return skype;
    }
    public String getAddressIndex() {
        return addressIndex;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public String getHomeNumber() {
        return homeNumber;
    }
    public String getRoomNumber() {
        return roomNumber;
    }
    public Date getCreation() {
        return creation;
    }
    public Date getModification() {
        return modification;
    }

    public String getFullName() {
        return getFirstName() + " " + getName() + " " + getMiddleName();
    }


    public  String getFullAddress() {
        return getAddressIndex() + " " + getCity() + " " + getStreet() + " " + getHomeNumber() + " " + getRoomNumber();
    }
    public String getFullPhonesNumber(){
        return getHomePhone() + " " + getMobilePhone() + " " + getMobilePhone2();
    }





}


package oleg.bryl.model;

public enum DBofUsers {
        FIRS_REGISTERED("Dracula", "Vladislav", "Capesh", "Graf", "0441234567", "0441234567", "0441234567", "vcd@gamil.com", "dracool");


    private final String firstName;
    private final String name;
    private final String middleName;
    private final String nickName;

    private final String homePhone;
    private final String mobilePhone;
    private final String mobilePhone2;
    private final String email;
    private final String skype;

    /**
     *
     * @param firstName
     * @param name
     * @param middleName
     * @param nickName
     * @param homePhone
     * @param mobilePhone
     * @param mobilePhone2
     * @param email
     * @param skype
     */
    DBofUsers(String firstName, String name, String middleName, String nickName, String homePhone, String mobilePhone, String mobilePhone2, String email, String skype) {
        this.firstName = firstName;
        this.name = name;
        this.middleName = middleName;
        this.nickName = nickName;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.mobilePhone2 = mobilePhone2;
        this.email = email;
        this.skype = skype;
    }
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

    /**
     *
     * @param addFirstName
     * @return
     */

    public static boolean checkInformation(String addFirstName){
        for (DBofUsers user: DBofUsers.values()){
            if(user.getFirstName().equals(addFirstName)){
                return true;
            }
        }return false;
    }
}

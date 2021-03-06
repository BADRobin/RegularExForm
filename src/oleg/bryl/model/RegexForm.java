package oleg.bryl.model;

public interface RegexForm {

    String REGEX_FIRST_NAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}[а-щьюяґіїє']$";
    String REGEX_FIRST_NAME_EN = "^[A-Z][a-z]{1,20}$";
    String REGEX_NAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}[а-щьюяґіїє']$";
    String REGEX_NAME_EN = "^[A-Z][a-z]{1,20}$";
    String REGEX_MIDDLE_NAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}[а-щьюяґіїє']$";
    String REGEX_MIDDLE_NAME_EN = "^[A-Z][a-z]{1,20}$";
    String REGEX_GROUPS_UA = "^[А-ЩЬЮЯҐІЇЄа-щьюяґіїє'0-9_-]{1,20}$";
    String REGEX_GROUPS_EN = "^[A-Za-z0-9_-]{1,20}$";
    String REGEX_HOME_PHONE = "[0-9]{10,15}$";
    String REGEX_MOBILE_PHONE = "[0-9]{10,15}$";

    String REGEX_NICK_NAME = "[A-Za-z0-9_.-]{1,20}$";
    String REGEX_COMMENT_UA = "[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}[а-щьюяґіїє']$";
    String REGEX_COMMENT_EN = "[A-Za-z0-9_.-]{1,20}$";

    String REGEX_EMAIL = "[A-Za-z0-9_-]+[@]+[a-z]+[.]+[a-z]{1,20}$";
    String REGEX_SKYPE = "[A-Za-z0-9_-]{1,20}$";
    String REGEX_ADDRESS_INDEX = "[0-9]{5}$";
    String REGEX_CITY_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_CITY_EN = "^[A-Z][a-z]{1,20}$";
    String REGEX_STREET_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_STREET_EN = "^[A-Z][a-z]{1,20}$";
    String REGEX_HOME_NUMBER= "[0-9]{1,500}$";
    String REGEX_ROOM_NUMBER = "[0-9]{1,500}$";

}

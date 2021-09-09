package oleg.bryl.controller;

public class SkypeNameIsRegistered extends Exception{
    private String skypeDate;

    public String getSkypeDate() {
        return skypeDate;
    }
    public SkypeNameIsRegistered(String message, String skypeDate){
        super(message);
        this.skypeDate = skypeDate;
    }
}

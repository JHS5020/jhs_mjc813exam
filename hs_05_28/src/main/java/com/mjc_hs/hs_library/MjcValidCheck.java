package com.mjc_hs.hs_library;

import java.util.regex.Pattern;

public class MjcValidCheck {


    public boolean isValidPhoneNumber(String text) {
        if (text == null ){
            return false;
        }
        String p = "^\\d{3}-\\d{3,4}-\\d{4}$";
        if (Pattern.matches(p, text)) {
            return true;
        }
        return false;
    }
    public boolean isValidZipNumber(String text){
        if (text == null ){
            return false;
        }
        String p = "^[1-9][0-9]{4}$";
        if (Pattern.matches(p, text)) {
            return true;
        }
        return false;
    }
    public boolean isValidEmail(String text){
        if (text == null ){
            return false;
        }
        String p = "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*\\.[a-zA-Z]{2,3}$";
        if (Pattern.matches(p, text)) {
            return true;
        }
        return false;
    }
}

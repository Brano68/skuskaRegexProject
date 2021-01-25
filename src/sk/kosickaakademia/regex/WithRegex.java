package sk.kosickaakademia.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WithRegex {

    public boolean compareWithRegex(String spz){
        Pattern p = Pattern.compile("^[A-Z]{2}[0-9]{3}[A-Z]{2}$");
        Matcher m = p.matcher(spz);
        boolean b = m.matches();
        if(b){
            return true;
        }else{
            return false;
        }
    }

    public boolean isNumberCorrect(String number){
        Pattern p = Pattern.compile("^[+]{1}[4]{1}[2]{1}[1]{1}[9]{1}[0-9]{8}$");
        Matcher m = p.matcher(number);
        boolean n1 = m.matches();
        //return n1;
        if(n1) return true;

        p = Pattern.compile("^[0]{2}[4]{1}[2]{1}[1]{1}[9]{1}[0-9]{8}$");
        m = p.matcher(number);
        boolean n2 = m.matches();
        if(n2) return true;

        p = Pattern.compile("^[0]{1}[9]{1}[0-9]{8}$");
        m = p.matcher(number);
        boolean n3 = m.matches();
        if(n3){
            return true;
        }else{
            return false;
        }

    }

    public boolean checkValue(String text){
        //ucitel
        //Pattern p = Pattern.compile("^(([1-9][0-9]*|0)|(0[\\.,]|[1-9][0-9]*[\\.,])([1-9][0-9]|0[1-9]))$");
        //ja
        //Pattern p = Pattern.compile("^([1-9]{1,}[0-9]{0,}|0)|(0[\\.,])|([0-9][1-9])$");
        Pattern p = Pattern.compile("^(0[\\.,])|([0-9][1-9])|([1-9]*[0-9]*)|([1-9]*[\\.,][0-9][1-9])$");
        Matcher m = p.matcher(text);
        boolean b = m.matches();

        if(b){
            return true;
        }else{
            return false;
        }
    }

}

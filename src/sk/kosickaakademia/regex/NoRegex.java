package sk.kosickaakademia.regex;

public class NoRegex {

    public boolean isValidSPZ(String spz){
        if(spz == null){
            return false;
        }

        spz = spz.toUpperCase().trim();

        if(spz.length()!=7){
            return false;
        }
        if(spz.charAt(0) < 65 || spz.charAt(0) > 90){
            return false;
        }
        if(spz.charAt(1) < 65 || spz.charAt(1) > 90){
            return false;
        }
        for(int i = 2; i < spz.length(); i++){
            if(!Character.isLetterOrDigit(spz.charAt(i))){
                return false;
            }
        }
        return true;
    }



}

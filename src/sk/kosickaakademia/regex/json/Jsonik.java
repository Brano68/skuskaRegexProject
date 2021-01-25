package sk.kosickaakademia.regex.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Jsonik {

    public static void urobJson(){
        JSONArray sports = new JSONArray();

        sports.add("Hockey");
        sports.add("Skates");
        sports.add("Swimming");

        JSONObject obj = new JSONObject();

        obj.put("name", "Milan");
        obj.put("age", 32);
        obj.put("sport", sports);
        obj.put("active", true);


        System.out.print(obj);
        System.out.println();
        //vypis listu ale iba sportu
        System.out.println("----");
        for(int i = 0; i < sports.size(); i++){
            System.out.println(sports.get(i));
        }
    }


}

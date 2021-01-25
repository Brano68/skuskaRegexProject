package sk.kosickaakademia.regex.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Jsonik {

    public static void urobJson(){
        JSONArray sports = new JSONArray();

        JSONObject obj = new JSONObject();

        obj.put("name", "Milan");
        obj.put("age", 32);
        obj.put("sport", sports);
        obj.put("active", true);

        System.out.print(obj);
    }


}

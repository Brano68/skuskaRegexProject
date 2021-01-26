package sk.kosickaakademia.regex.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

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

    public static void readJsonFromFile(){
        JSONParser parser = new JSONParser();
        try {
            Reader reader = new FileReader("resource/test.json");
            JSONObject jsonObject = (JSONObject)parser.parse(reader);

            String name = (String) jsonObject.get("name");
            System.out.println(name);

            Long age = (Long)jsonObject.get("age");
            //pretipovanie Long na int
            int p = age.intValue();
            System.out.println(age);

            JSONArray jsonArray = (JSONArray) jsonObject.get("messages");
            //list cez forko
            for(int i = 0; i < jsonArray.size(); i++){
                System.out.println(jsonArray.get(i));
            }

            //list cez iterator
            Iterator<String> iterator = jsonArray.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }


        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }


    public static void readWeatherFromJsonFile(){
        JSONParser parser = new JSONParser();
        try {
            Reader reader = new FileReader("resource/pocasie.json");
            JSONObject jsonObject = (JSONObject)parser.parse(reader);

            //Object main = jsonObject.get("main");
            //Double temp = (Double) jsonObject.get("temp");
            //System.out.println(temp);
            //System.out.println("Temperature is: " + (temp-273.15));
            JSONObject main = (JSONObject) jsonObject.get("main");
            System.out.println(main);

            Double temp = (Double) main.get("temp");
            System.out.println("Teplota: " + (temp-273.15));

            Long pressure = (Long) main.get("pressure");
            System.out.println("Tlak: " + (pressure));

            Long humidity = (Long) main.get("humidity");
            System.out.println("Vlhkost: " + (humidity));

            Long visibility = (Long) jsonObject.get("visibility");
            System.out.println("Viditelnost: " + (visibility));

            //sunrise
            JSONObject sys = (JSONObject) jsonObject.get("sys");
            Long sunrise = (Long) sys.get("sunrise");
            Long sunset = (Long) sys.get("sunset");
            System.out.println(sunrise);
            System.out.println(sunset);
            sunriseAndSunset(sunrise,sunset);

        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }

    public static void sunriseAndSunset(Long sunrise, Long sunset){
        //vychod slnka
        while (sunrise>(24*3600)){
            sunrise = sunrise - (24*3600);
        }
        int hodina = (int)(sunrise/3600);
        sunrise = sunrise - hodina*3600;
        int minuta = (int)(sunrise/60);
        System.out.println("Vychod: " + hodina + ":" + minuta);
        //zapad slnka
        while (sunset>(24*3600)){
            sunset = sunset - (24*3600);
        }
        hodina = (int)(sunset/3600);
        sunset = sunset - hodina*3600;
        minuta = (int)(sunset/60);
        System.out.println("Zapad: " + hodina + ":" + minuta);
    }
}

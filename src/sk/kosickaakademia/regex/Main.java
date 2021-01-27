package sk.kosickaakademia.regex;

import sk.kosickaakademia.regex.json.Jsonik;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
        NoRegex noRegex = new NoRegex();
        System.out.println(noRegex.isValidSPZ("KK2 7KK"));

        System.out.println(noRegex.isValidID("HU159876"));

        WithRegex withRegex = new WithRegex();
        System.out.println(withRegex.compareWithRegex("KK555UU"));

        System.out.println("cislo");
        System.out.println(withRegex.isNumberCorrect("+421910500264"));

         */
        //readAndMakeResult();
        Jsonik.urobJson();
        System.out.println("------");
        Jsonik.readJsonFromFile();
        Jsonik.readWeatherFromJsonFile();
        Jsonik.writeCities();
    }

    public static void readAndMakeResult(){
        WithRegex withRegex = new WithRegex();

        try
        {
            File file=new File("resource/money.txt");    //creates a new file instance
            FileReader fr=new FileReader(file);   //reads the file
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
            //StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters
            String line;
            while((line=br.readLine())!=null)
            {
                StringBuffer sb=new StringBuffer();
                sb.append(line);      //appends line to string buffer
                System.out.print(sb.toString() + " ");
                System.out.println(withRegex.checkValue(sb.toString()));
                //sb = null;
                //sb.append("\n");     //line feed
            }
            fr.close();    //closes the stream and release the resources
            //System.out.println("Contents of File: ");
            //System.out.println(sb.toString());   //returns a string that textually represents the object
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}

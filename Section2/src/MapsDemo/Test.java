package MapsDemo;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<String, String>();

        countries.put("DE", "Germany");
        countries.put("FR", "France");
        countries.put("SP", "Spain");
        countries.put("TR", "Türkiye");
        countries.put("JP", "Japan");
        countries.put("CH", "China");

        // let's remove China
        countries.remove("China");

        String myCountry = countries.get("DE");
        System.out.println("My country is " + myCountry);

        // we can print the values of map as follows
        for (String country: countries.values()) {
            System.out.println("Country is: " + country);
        }

        // iterate over keys
        for (String code: countries.keySet()) {
            System.out.println("Country Code is: " + code);
        }


    }
}

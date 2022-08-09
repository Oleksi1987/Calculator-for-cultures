import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.text.NumberFormat;

public class Calculator {


    public static void main(String args[]) {

        Scanner culture = new Scanner(System.in);
        String N = culture.next();
        culture.nextLine();

        Scanner hectares = new Scanner(System.in);
        float a = hectares.nextInt();
        hectares.nextLine();

        // create a hashmap
        HashMap<String, Double> area = new HashMap<>();


        area.put("beans", 0.01);
        area.put("beets", 0.02);
        area.put("cucumber", 0.03);
        area.put("cabbage", 0.04);
        area.put("onion", 0.05);

        String key = N;


        for (Map.Entry<String, Double> entry : area.entrySet()) {
            if (key.equals(entry.getKey())) {
                Double b = entry.getValue() * a;
                System.out.println("The value for key " + key + " is " + entry.getValue());
                System.out.println(b);
                break;


            }
        }
    }
}

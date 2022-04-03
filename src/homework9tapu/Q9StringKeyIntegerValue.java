package homework9tapu;
/*Create a HashMap object called people that will store String keys and Integer
        values: And use for each loop to iterate the value from Map*/

import java.util.HashMap;
import java.util.Map;

public class Q9StringKeyIntegerValue {
    public static void main(String[] args) {

        Map<String,Integer>people = new HashMap<>();
       // HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Palak", 1);
        people.put("Ritu", 5);
        people.put("Kanan", 3);
        people.put("Navya", 8);
      //  System.out.println(people);
        for( Map.Entry<String , Integer> data: people.entrySet()){
            System.out.println(data);
        }

    }
}

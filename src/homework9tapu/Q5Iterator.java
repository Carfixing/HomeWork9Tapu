package homework9tapu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Write a Java program to iterate through all elements in an array list using Iterator.
public class Q5Iterator {
    public static void main(String[] args) {



        Set<String> numbers = new HashSet<>();
        numbers.add("Boll");
        numbers.add("Cat");
        numbers.add("Mango");
        numbers.add("carrot");
        numbers.add("Parrot");
        numbers.add("Red");
        numbers.add("Orange");
        numbers.add("Red");
        numbers.add("Red");
        numbers.add("Red");

        //iterate set using iterator interface
        Iterator itr = numbers.iterator();//iterator = class
        while(itr.hasNext()) {//true then go inside ,false then not going inside
            System.out.println(itr.next());
        }

    }
}

package homework9tapu;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to retrieve an element (at a specified index) from a given array list
public class Q6SpecificArrayList {
    public static void main(String[] args) throws Exception {
        List carname = new ArrayList();
        carname.add("volvo");
        carname.add("BMW");
        carname.add("Audi");
        carname.add("Toyota");
        carname.add("Honda");
        System.out.println("The element at index 2 in the ArraysList is : "+ carname.get(2));//Audi
        System.out.println("The element at index 2 in the ArraysList is : "+ carname.get(1));//BMW
        System.out.println("The element at index 2 in the ArraysList is : "+ carname.get(4));//Honda
    }

}

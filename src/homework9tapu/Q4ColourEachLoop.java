package homework9tapu;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop*/
public class Q4ColourEachLoop {
    public static void main(String[] args) {

        //create a list and initilize it
        List<String> colour = new ArrayList<String>();//craeting arraylist
        colour.add("Red");
        colour.add("Green");
        colour.add("Orange");
        colour.add("white");
        colour.add("Black");

        for (String n :colour)
        {
            System.out.println(n);
        }

    }
}


package homework9tapu;

import java.util.ArrayList;
//Write a Java program to test an array list is empty or not. Define array list with underground tube names
public class Q7ArrayListIsEmpty {

    public static void main(String[] args) {
        ArrayList<String>tubename = new ArrayList<>();
        tubename.add("Picadaily");
        tubename.add("District");
        tubename.add("Metropolitan");
        tubename.add("Circle");
        tubename.add("Jublilee");
        tubename.add("Victoria");
        tubename.add("Northen line ");


        System.out.println("It's empty or not  : "+ tubename.isEmpty());
        System.out.println(tubename.contains("Circle"));//true
        System.out.println(tubename.contains("Bakeloo line"));//false
    }

}

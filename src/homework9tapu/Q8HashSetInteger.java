package homework9tapu;

import java.util.HashSet;
import java.util.Set;

/*Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
        Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
        and if else*/
public class Q8HashSetInteger {
    public static void main(String[] args) {
        //craete a hashset object called number
       HashSet<Integer> number = new HashSet<>();

        //add the value to the set
        number.add(4);
        number.add(7);
        number.add(8);
       //show which number betwwen 1 to 10 are in the set
        for(int i =1; i<=10; i++) {
            if (number.contains(i)) {
                System.out.println(i + "number is in the set.");
            } else {
                System.out.println(i + "number is not in the set.");
            }
        }
    }
}

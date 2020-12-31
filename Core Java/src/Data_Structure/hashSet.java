package Data_Structure;

import java.util.HashSet;

/**
 *
 * @author amitguho 10:27 PM 30.04.2020
 */
public class hashSet {

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers);
        /*  for (Integer number : numbers) {
            System.out.println(number);
        }
         */
        System.out.println(numbers.size());

        numbers.clear();
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());
        // numbers.removeAll(numbers);

    }
}

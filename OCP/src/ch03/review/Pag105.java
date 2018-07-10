package ch03.review;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author eder.crespo
 */
public class Pag105 {
    
    
    public static void main(String[] args) {
        
           sortingList();   
    }
    
    private static void causeUnsoportedOperationException() {
        
        String[]  array = {"Hello", "World"};
        
        List<String> list = Arrays.asList(array);
        
        System.out.println(list);
        
        list.set(1, "Moto");
        System.out.println(list);
        
        array[0] = "Hi";
        System.out.println(list);
        
        list.remove(1);
        System.out.println(list); //it throws an unsupportedOperationException
    }

    private static void sortingArray() {
        
        int[] numbers = {6, 9, 1, 8};
        Arrays.sort(numbers); //{1, 6, 8, 9}
        System.out.println(Arrays.binarySearch(numbers, 6)); //  1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
    }

    private static void sortingList() {
         
        List<Integer> list = Arrays.asList(9, 7, 5, 3);
        
        Collections.sort(list); //(3, 5, 7, 9)
        
        System.out.println(Collections.binarySearch(list, 3)); //   0
        System.out.println(Collections.binarySearch(list, 2));  // -1
         
    }

}

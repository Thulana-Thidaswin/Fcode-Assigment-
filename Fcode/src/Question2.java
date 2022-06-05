import java.util.Scanner;
import java.util.HashSet;

public class Question2 {
    static boolean duplicate(int arr[], int k) {
        // Creates an empty hashset
        HashSet<Integer> kSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            //if the array value is in the array return true
            if (kSet.contains(arr[i])) {
                return true;
            }
            // Adding it to the item set
            kSet.add(arr[i]);
            // when counter is greater than K the hashset value is removed from the top as to keep the distance
            if (i >= k)
                kSet.remove(arr[i - k]);
        }
        return false;
    }

    public static void main(String[] args) {
        //Since the question says Given arrays , It is assumed the array can be hardcoded
        Scanner userInput = new Scanner(System.in);
        int[] arrayOne = {5, 6, 8, 2, 4, 6, 9};
        int[] arrayTwo = {1, 2, 3, 2, 1};
        //Getting the K value from USer
        System.out.println("Please enter your K value");
        int k = 0;
        Boolean valid = false;
        //puts the User in a loop until the K value is properly validated
        while (valid == false) { //valid will be true ONLY after K is verfied
            //Try catch implemented to check if the input is a string or not
            try {
                k = Integer.parseInt(userInput.next());
                //if the K value extends the Array length then the array length size assigned to K
                if (k > arrayOne.length) {
                    k = arrayOne.length;
                    valid = true;
                } else if (k > -1) { //if K is greater than 0 it is approved
                    valid = true;
                } else {
                    System.out.println("Please enter a positive number for K");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter an Integer");
            }
        }
        //the array and K is fed to  the fuction Duplicate and it returns true IF a duplicate is found in the K distance
        if (duplicate(arrayOne, k)) {
            System.out.println("Duplicate found");
        } else {
            System.out.println("Duplicate not found");
        }
    }
}

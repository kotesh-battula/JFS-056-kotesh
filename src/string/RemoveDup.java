package string;
import java.util.Scanner;
public class RemoveDup {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int[] unique = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean found = false;

            // Check if element already exists
            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    found = true;
                    break;
                }
            }

            // If not found, add it
            if (!found) {
                unique[count] = arr[i];
                count++;
            }
        }

        // Print unique elements
        System.out.print("Unique elements: ");

        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}

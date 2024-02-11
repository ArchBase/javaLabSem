import java.util.Scanner;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {4, 5, 8, 9, 20, 34, 56, 67, 89, 97};

        int max = arr.length, min = 0, mid;
        mid = (max+min)/2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item to be searched: ");
        int item = sc.nextInt();

        while (mid < arr.length && min <= max) {
            System.out.println("min: "+min+" max: "+max);
            if(arr[mid] == item){
                System.out.println("Element found at: " + mid);
                System.exit(0);
            }
            else if(item > arr[mid]){
                min = mid + 1;
            }
            else if(item < arr[mid]){
                max = mid - 1;
            }
            mid = (max+min)/2;
        }
        System.out.println("min: "+min+" maxi: "+max);


        System.out.println("Element not found");


    }
}







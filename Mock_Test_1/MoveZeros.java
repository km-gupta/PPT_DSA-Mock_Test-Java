import java.util.Scanner;

public class MoveZeros {
    private static int[] takeArrayInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of element in an array: ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter the elements of array ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static int[] moveZerosToEnd(int[] arr, int left, int next) {
        //Base Condition
        if(next >= arr.length) return arr;

        if(arr[left] > 0) {
            arr = moveZerosToEnd(arr, left+1, next+1);
        } else {
            if(arr[next] > 0) {
                int temp = arr[left];
                arr[left] = arr[next];
                arr[next] = temp;
                arr = moveZerosToEnd(arr, left+1, next+1);
            } else {
                arr = moveZerosToEnd(arr, left, next+1);
            }
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        System.out.println("The modified array is");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = takeArrayInput();
        arr = moveZerosToEnd(arr,0,0);
        printArray(arr);
    }

    



    

    

    
}
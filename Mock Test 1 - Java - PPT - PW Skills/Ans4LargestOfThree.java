public class Ans4LargestOfThree {
    private static int largestOfThree(int num1, int num2, int num3) {
        if(num1 > num2) {
            if(num1 > num3) return num1;
            else return num3;
        } else {
            if (num2 > num3) return num2;
            else return num3;
        }
    }
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 11;
        int num3 = 15;
        
        int largest = largestOfThree(num1, num2, num3);
        System.out.println("Largest of the given three Number is : "+largest);
    }
}

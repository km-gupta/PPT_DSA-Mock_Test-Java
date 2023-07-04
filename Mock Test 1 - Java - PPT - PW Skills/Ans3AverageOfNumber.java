public class Ans3AverageOfNumber {
    private static int averageOfNumber(int[] nums) {
        int sum = 0;
        int i = 0;
        int avg = 0;
        int n = nums.length;
        do {
            sum +=nums[i++];
        } while(i<n);
        avg = sum/n;
        return avg;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int avg = averageOfNumber(nums);
        System.out.println(avg);
    }
}

class Ans1CheckTheNumber {
    private static void checkNumber(int num) {
        if(num > 0) {
            System.out.println("Given number is positive");
        } else if(num == 0) {
            System.out.println("Given number is zero");
        } else {
            System.out.println("Given number is negative");
        }
    }

    public static void main(String[] args) {
        int num = 0;
        checkNumber(num);
    }
}
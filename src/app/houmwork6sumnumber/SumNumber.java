package app.houmwork6sumnumber;

public class SumNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int sum = 0;

        for (int i : arr) {
            sum += i;
            System.out.println((i) + ") Num is " + (i) + ", sum is " + sum);
        }

        System.out.println("----------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}

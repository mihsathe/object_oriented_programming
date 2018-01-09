public class SumOfNumber {

    public static int sum(int number_1, int number_2, int number_3, int number_4) {
        int sum = number_1 + number_2 + number_3 + number_4;
        return sum;
    }

    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
    }
}

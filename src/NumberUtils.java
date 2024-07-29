public class NumberUtils {
    public static boolean isNarcissistic(int number) {
            char[] digits = String.valueOf(number).toCharArray();
            int sum = 0;
            for (int i = 0; i < digits.length; i++) {
                sum += (int) Math.pow((Integer.parseInt(String.valueOf(digits[i]))), digits.length);
            }
            return (sum == number);
    }
}

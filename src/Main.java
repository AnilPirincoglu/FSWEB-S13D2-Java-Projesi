public class Main {
    public static void main(String[] args) {

        //TODO isPalindrome task
        System.out.println("isPalindrome -1221: " + isPalindrome(-1221));
        System.out.println("isPalindrome 707: " + isPalindrome(707));
        System.out.println("isPalindrome 11212: " + isPalindrome(11212));

        System.out.println("****************************");
        //TODO isPerfectNumber
        System.out.println("isPerfectNumber 6: " + isPerfectNumber(6));
        System.out.println("isPerfectNumber 28: " + isPerfectNumber(28));
        System.out.println("isPerfectNumber 5: " + isPerfectNumber(5));
        System.out.println("isPerfectNumber -1: " + isPerfectNumber(-1));


    }

    public static boolean isPalindrome(int number) {
        String[] numbs = String.valueOf(Math.abs(number)).split("");
        int length = numbs.length;
        String[] reverseNumbs = new String[length];

        for (int i = 0; i < length; i++) {
            reverseNumbs[length - 1 - i] = numbs[i];
        }
        return String.join("", numbs).equals(String.join("", reverseNumbs));
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0)
            return false;
        int total = 1;
        int highest = (int) Math.ceil(Math.sqrt(number));

        for (int i = 2; i < highest; i++) {
            if (number % i == 0) {
                total += i;
                total += number / i;
            }
        }
        return total==number;
    }

}
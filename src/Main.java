public class Main {
    public static void main(String[] args) {

        //TODO isPalindrome task
        System.out.println("isPalindrome -1221: " + isPalindrome(-1221));
        System.out.println("isPalindrome 707: " + isPalindrome(707));
        System.out.println("isPalindrome 11212: " + isPalindrome(11212));

        System.out.println("\n****************************\n");
        //TODO isPerfectNumber
        System.out.println("isPerfectNumber 6: " + isPerfectNumber(6));
        System.out.println("isPerfectNumber 28: " + isPerfectNumber(28));
        System.out.println("isPerfectNumber 5: " + isPerfectNumber(5));
        System.out.println("isPerfectNumber -1: " + isPerfectNumber(-1));

        System.out.println("\n****************************\n");
        //TODO numberToWords
        System.out.println("123: " + numberToWords(123));
        System.out.println("1010: " + numberToWords(1010));
        System.out.println("-12: " + numberToWords(-12));


    }

    public static boolean isPalindrome(int number) {
        String[] numbers = String.valueOf(Math.abs(number)).split("");
        int length = numbers.length;
        String[] reverseNumbers = new String[length];

        for (int i = 0; i < length; i++) {
            reverseNumbers[(length - 1) - i] = numbers[i];
        }
        return String.join("", numbers).equals(String.join("", reverseNumbers));
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 2)//en küçük perfect sayı 6 dır. dolayısıyla ilk koşul 5 ten büyük olması olabilir.
            return false;
        int total = 1;
        int highest = (int) Math.sqrt(number) + 1;

        for (int i = 2; i < highest; i++) {
            if (number % i == 0) {
                total += i;
                if (i != number / i)
                    total += number / i;
            }
        }
        return total == number;
    }

    public static String numberToWords(int number) {
        if (number < 0)
            return "Invalid Value";

        String[] numbers = String.valueOf(Math.abs(number)).split("");
        String result = "";

        for (String numb : numbers) {
            switch (numb) {
                case "0":
                    result += " Zero";
                    break;
                case "1":
                    result += " One";
                    break;
                case "2":
                    result += " Two";
                    break;
                case "3":
                    result += " Three";
                    break;
                case "4":
                    result += " Four";
                    break;
                case "5":
                    result += " Five";
                    break;
                case "6":
                    result += " Six";
                    break;
                case "7":
                    result += " Seven";
                    break;
                case "8":
                    result += " Eight";
                    break;
                case "9":
                    result += " Nine";
                    break;
            }
        }
        return result.trim();
    }
}
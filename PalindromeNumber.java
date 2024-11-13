public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
       
        if (number < 0 || (number % 10 == 0 && number != 0)) {
            return false;
        }

        int reversed = 0;
        
        
        while (number > reversed) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        
        return number == reversed || number == reversed / 10;
    }
    
    public static void main(String[] args) {
        int number = 121; 
        System.out.println("Is " + number + " a palindrome? " + isPalindrome(number));
        
        number = 123;
        System.out.println("Is " + number + " a palindrome? " + isPalindrome(number));
    }
}

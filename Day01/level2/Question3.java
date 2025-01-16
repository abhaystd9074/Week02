import java.util.Scanner;

class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
       int st=0,end=text.length()-1;
          while(st<end){
            if(text.charAt(st) != text.charAt(end)){
                return false;
            }
          }
            return true;

    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The is a palindrome.");
        } else {
            System.out.println("The text  is not a palindrome.");
        }
    }

   
}

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to check: ");
        String text = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker(text);
        checker.displayResult();

        
    }
}
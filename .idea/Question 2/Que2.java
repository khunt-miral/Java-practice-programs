import java.util.Scanner;

//  WAP to find whether string is palindrome or not.


public class Que2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str).reverse();
        if(str.equals(sb.toString())) {
            System.out.println("Palindorome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}

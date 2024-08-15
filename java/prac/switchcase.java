import java.util.Scanner;

public class switchcase {
    public static void  main(String[] args) {
        System.out.println("Enter the character:");
        Scanner sc = new Scanner (System.in);
        String c=sc.nextLine();
        switch(c){
            case "a":System.out.println("Vowel");
            break;
            case "e":System.out.println("Vowel");
            break;
            case "i":System.out.println("Vowel");
            break;
            case "o":System.out.println("Vowel");
            break;
            case "u":System.out.println("Vowel");
            break;
            default:System.out.println("Not a vowel");
            
        }
        sc.close();
    }
}

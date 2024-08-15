package LL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LLImp ll = new LLImp();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("0 = stop \n 1 = Insert At Beginning \n 2 = Insert At End \n 3 = Display LL \n 4 = Delete At Beginning \n 5 = Delete At End");
            System.out.print("Enter your chioce:");
            int choice = sc.nextInt();
            System.out.println("-----------------------------------");

            if(choice == 0) break;

            switch(choice){
                case 1:
                    System.out.print("Enter the number to insert at beginning: ");
                    int n = sc.nextInt();
                    ll.insertAtBeg(n);
                    System.out.println("Element inserted");
                    System.out.println("-------------------------------");
                    break;


                case 2:
                    System.out.print("Enter the number to insert at end: ");
                    int m = sc.nextInt();
                    ll.insertAtend(m);
                    System.out.println("Element inserted");
                    System.out.println("-------------------------------");
                    break;

                case 3:
                    System.out.println("Elements are: ");
                    ll.display();
                    System.out.println();
                    System.out.println("---------------------------------");
                    break;

                case 4:
                    ll.removeAtBeg();

                    System.out.println("---------------------------------");
                    break;

                case 5:
                    ll.removeAtend();

                    System.out.println("---------------------------------");
                    break;
            }

        }
    }
}

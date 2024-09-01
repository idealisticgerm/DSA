package javaq.prac;

public class methods {
    // static void Mymethod(String fname, int age){
    //         System.out.println("My name is " +fname+ ", and I am "+age+" years old");
    //     }
    
        static void Fibonacci(int n){
            int n1 =0, n2=1,n3;
            System.out.print(n1+" "+n2);

            for (int i = 2; i < n; i++) {
               n3 = n1+n2;
               System.out.print(" "+n3);
               n1=n2;
               n2=n3; 
            }

        }
    public static void main(String[] args) {
        // Mymethod("Siddhesh", 21);
        Fibonacci(5);
}
}
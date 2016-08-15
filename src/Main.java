/**
 * Created by melaniejohnson on 8/3/16.
 */

public class Main {

    public static void main(String[] args){

        int a, b, c;         // Declares three ints, a, b, and c.
        a = 10;             //assigns value to a
        b = 13;             //assigns value to b
        c = 23;             //assigns value to c --which happens to be Mel's fave # --i'll do more w that later
        int sum = a + b + c; //adds all the numbers
        double product = a * b * c;
        double productQuotient = (a * b)/c;
        int Mel = 50;        //assigns value to Mel's age
        double pi = 3.14159; // declares and assigns a value of PI.

        System.out.println(pi + c);  //result of c added to value of pi
        System.out.println(a + b + c);  //result of adding a+b+c
        System.out.println(Mel - pi);  //Mel less pi (i.e. don't eat so much PIE!)
        System.out.println(pi / a);  //result of value of pi divided by a or 10
        System.out.println(Mel + c);    //result of adding mel's age plus c var for her favorite number
        System.out.println("Greetings to everyone in the Universe!");   //my version of Hello World
        System.out.println(sum); //adds a+b+c
        System.out.println(productQuotient); //(ab/c
        System.out.println(pi/sum);  //3.14159/a+b+c
        System.out.println(Mel/productQuotient); //Mel divided by [ab/c]
    }
}

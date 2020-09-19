import java.util.Scanner; // importing scanner property
import java.lang.Math;
public class quadraticsolver{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in); // create new scanner
       System.out.println("Welcome to quadratic formula solver");
       System.out.println("The quadratic formula is intended to root(s)\n" + "when f(x) = 0 for the function f(x) = ax^2 + bx + c\n");
       System.out.println("Additional note: a is coeeficient of x^2, b is coefficient of x and c is constant");
       double a;
       double b;
       double c;
       System.out.println("Please enter the value of a");
       a = input.nextDouble();
       System.out.println("Please enter the value of b");
       b = input.nextDouble();
       System.out.println("Please enter the value of c");
       c = input.nextDouble();
       // calculation part
       double firstroot;
       double secondroot;
       double iroot; // imaginary root if discriminant is less than 0
       double discriminant;
       discriminant = b * b - (4 * a * c);
       if(discriminant > 0){
           firstroot = (-b + Math.sqrt(discriminant))/(2 * a);
           secondroot = (-b - Math.sqrt(discriminant))/(2 * a);
           System.out.println("Two real roots are" + firstroot + "and" + secondroot);
        }
        else if(discriminant < 0){
           iroot = Math.sqrt(-discriminant)/(2 * a);
           System.out.println("The imaginary roots are" + (-b/(2 * a)) + "+/- i" + iroot);
        }
        else
        {
            firstroot = -b/(2 * a);
            System.out.println("One real root" + firstroot);
        }
    }
}

               
            
       
       
       
       
       
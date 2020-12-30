import java.util.Scanner;
import java.lang.Math;
public class finalgradecalculator{
   public static void main (String[] args){
       System.out.println("Welcome to final grade calculator");
       System.out.println("Please input your average grade for homework,midterm,quiz,partipation, and final exam");
       double hw;
       double md;
       double qz;
       double pp;
       double fe;
       Scanner z = new Scanner(System.in);
       System.out.println("Please enter your average grade for the homework");
       hw = z.nextDouble();
       System.out.println("Please enter your average grade for the midterm");
       md = z.nextDouble();
       System.out.println("Please enter your average grade for the quiz");
       qz = z.nextDouble();
       System.out.println("Please enter your average grade for the participation");
       pp = z.nextDouble();
       System.out.println("Please enter your average grade for the final exam");
       fe = z.nextDouble();
       System.out.println("Please input the proportion of each one of them in percentage which should sum up to 100%");
       double h;
       double m;
       double q;
       double p;
       double f;
       System.out.println("Please enter the proportion of homework in percentage");
       h = z.nextDouble();
       double h1 = h/100;
       System.out.println("Please enter the proportion of midterm in percentage");
       m = z.nextDouble();
       double m1 = m/100;
       System.out.println("Please enter the proportion of quiz in percentage");
       q = z.nextDouble();
       double q1 = q/100;
       System.out.println("Please enter the proportion of participation in percentage");
       p = z.nextDouble();
       double p1 = p/100;
       System.out.println("Please enter the proportion of final exam in percentage");
       f = z.nextDouble();
       double f1 = f/100;
       System.out.println("Please eneter the minimum grade that needs to be had in order to pass the course");
       double passinggrade;
       passinggrade = z.nextDouble();
       double finalgradecalculation = (h1 * hw) + (m1 * md) + (q1 * qz) + (p1 * pp) + (f1 * fe);
       System.out.println("Your final grade was calculated to be" + finalgradecalculation);
       if(finalgradecalculation >= passinggrade){
           System.out.println("You passed the class");
        }
        else{
        System.out.println("You failed the class");
        
    }
        System.out.println("Please input minimum grade to get A");
        double a = z.nextDouble();
        System.out.println("Please input minimum grade to get B");
        double b = z.nextDouble();
        System.out.println("Please input minimum grade to get C");
        double c = z.nextDouble();
        System.out.println("Please input minimum grade to get D");
        double d = z.nextDouble();
        if(finalgradecalculation >= a){
            System.out.println("Your letter grade is A");
        }else if(finalgradecalculation >= b && finalgradecalculation < a){
            System.out.println("Your letter grade is B");
        }else if(finalgradecalculation >= c && finalgradecalculation < b){
            System.out.println("Your letter grade is C");
        }else if(finalgradecalculation >= d && finalgradecalculation < c){
            System.out.println("Your letter grade is D");
        }else{
            System.out.println("Your letter grade is F");
        }
        System.out.println("Thank you for using our final grade calculator");
    }
}
            


       
       
       
       

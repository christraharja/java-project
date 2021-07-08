import java.util.Scanner; // import scanner property
import java.lang.Math; // import math property
public class phcalculator{
    public static void main(String[] args){
        System.out.println("Please input the PH, acidity level");
        int ph;
        // constructing scanner
        Scanner answer = new Scanner(System.in);
        ph = answer.nextInt();
        if(ph >= 0 & ph < 7){
            System.out.println("It is an acid since the ph is" + ph);
        }
        else if(ph == 7){
            System.out.println("It is neutral since the ph is" + ph);
        }
        else if(ph > 7 & ph <= 14){
            System.out.println("It is a base since the ph is" + ph);
        }else{
            System.out.println("The given ph is out of range");
        }
        //closing scanner
        answer.close();
    System.out.println("Thanks for using PH calculator");
    }
}
            

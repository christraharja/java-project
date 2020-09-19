import java.util.Scanner; // import scanner
public class currencyconverter{
    public static void main(String[] args){
        Scanner currency = new Scanner(System.in);// create scanner system
        int cur1;
        int cur2;
        System.out.println("Options available are 1 usd, 2 idr, 3 sgd");
        System.out.println("Please enter the initial currency");
        cur1 = currency.nextInt();
        System.out.println("Please enter the wanted currency");
        cur2 = currency.nextInt();
        double val;
        double x;
        val = currency.nextDouble();
        if(cur1 == 1 && cur2 == 2){
            x = val * 14500;
            System.out.println("The converted result = Rp" + x);
        }
        else if( cur1 == 1 && cur2 == 3){
            x = val * 1.36;
            System.out.println("The converted result = $" + x);
        }
        else if(cur1 == 2 && cur2 == 1){
            x = val * 0.000068;
            System.out.println("The converted result = $" + x);
        }
        else if(cur1 == 2 && cur2 == 3){
            x = val * 0.000093;
            System.out.println("The converted result = $" + x);
        }
        else if(cur1 == 3 && cur2 == 1){
            x = val * 0.73;
            System.out.println("The converted result = $" + x);
        }
        else if(cur1 == 3 && cur2 == 2){
            x = val * 10682;
            System.out.println("The converted result = Rp" + x);
        }else{
            System.out.println("Option is currently available, please choose another option");
        }
        System.out.println("Thanks for using this currency converter machine");
}
}
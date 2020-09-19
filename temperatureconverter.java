import java.util.Scanner; // importing scanner property
public class temperatureconverter{
    public static void main (String[] args){
        Scanner temp = new Scanner(System.in); // creating scanner system
        System.out.println("choose temperature conversion options below");
        System.out.println("from: 1 celcius, 2 fahrenheit, 3 kelvin");
        int inputTemptfrom;
        int inputTemptto;
        inputTemptfrom = temp.nextInt();
        System.out.println("to: 1 celcius, 2 fahrenheit, 3 kelvin");
        inputTemptto = temp.nextInt();
        System.out.println("Enter temperature");
        double t = temp.nextDouble();
        double converted;
        if (inputTemptfrom == 1  && inputTemptto == 1){
            converted = t;
            System.out.println("Conversion result = " + converted + "C");
        }
        else if (inputTemptfrom == 1 && inputTemptto == 3){
            converted = t + 273;
            System.out.println("Conversion result = " + converted + "K");
        }
        else if (inputTemptfrom == 1 && inputTemptto == 2){
            converted = (t * 9/5) + 32;
            System.out.println("Conversion result = " + converted + "F");
        }
        else if (inputTemptfrom == 3 && inputTemptto == 1){
            converted = t - 273;
            System.out.println("Conversion result = " + converted + "C");
        }
        else if (inputTemptfrom == 3 && inputTemptto == 3){
            converted = t;
            System.out.println("Conversion result = " + converted + "K");
        }
        else if (inputTemptfrom == 3 && inputTemptto == 2){
            converted = (t - 273) * 9/5 + 32;
            System.out.println("Conversion result = " + converted + "F");
        }
        else if (inputTemptfrom == 2 && inputTemptto == 2){
            converted = t;
            System.out.println("Conversion result = " + converted + "F");
        }
        else if (inputTemptfrom == 2 && inputTemptto == 1){
            converted = (t - 32) * 5/9;
            System.out.println("Conversion result = " + converted + "C");
        }
        else if (inputTemptfrom == 2 && inputTemptto == 3){
            converted = (t - 32) * 5/9 + 273;
            System.out.println("Conversion result = " + converted + "K");
        }
        else{
            System.out.println("Option is currently not available, please try again");
        }
    System.out.println("Thanks for using this temperature conversion system");
    System.exit(0);
    }
}

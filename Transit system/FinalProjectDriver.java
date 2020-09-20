/* class to ttest the transit system
 * main method
 */
import java.util.Scanner;// importing scanner class

public class FinalProjectDriver{
    public static void main(String [] args){
        Transitsystem abc = new Transitsystem();// to declare the Transitsystem object
        abc.readLine("data.txt");// call the method readLine
        Scanner pleasescan = new Scanner(System.in);// declare new scanner that is needed to take user inputs
        
        // declare two string variables needed
        String s;// represents the starting station
        String e;// represents the ending station
        System.out.print("Enter two stations, seperated by a comma:");
        String stationx [] = pleasescan.nextLine().split(",");// to take the input from the user using the scanner
        
        // set the values into starting and ending string
        s = stationx[0];
        e = stationx[1];
        
        // call the hasRoute method
        if(abc.hasRoute(s,e)){
            abc.printRoute();// if the route exists the it prints using printRoute method
        }else{
            System.out.println("There is no route between the station" + s + "and" + e);
        }// however if route does not exist then print the following statement above
    }
}

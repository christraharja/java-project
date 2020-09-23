import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.BufferedWriter;

public class  HW_Arrays{ 
  public static void main (String a[]){
     int answer = 'x';// declaring new integer to be used as condition for while loop
     Scanner yes = new Scanner(System.in);// declare scanner to take user's inputs
     PrintWriter consoleWriter = new PrintWriter(System.out);
        
        // creating while loop
     while(answer == 'x' || answer == 'x')
    {
         System.out.println("Enter the mass of the skydiver in kg:");// asking the user to input the mass
         double Mass = yes.nextDouble();
         System.out.println("Enter the cross sectional area of the skydiver in m^2: ");// asking the user to input the cross sectional area
         double Crosssectionarea = yes.nextDouble();
         System.out.println("Enter the drag coefficient of the skydiver:");// asking the user to input the coefficient
         double coefficient = yes.nextDouble();
         System.out.println("Enter the ending time in second: " );// asking the user to input theending time
         double endingTime = yes.nextDouble();
         System.out.println("Enter the time step in second:");// asking the user to input the time step
         double TimeStep = yes.nextDouble();
         yes.nextLine(); // in order to provide new line 
         System.out.println("Enter the output file name: ");// asking the user to input the name of the file
         String FileName = yes.nextLine(); 
         // down here is the method that is created to traces variable, I commented so it will not appear in the output, 
         // please do not forget to uncomment in order to have this method appear in the output
         //tracingvariable(Mass, Crosssectionarea,coefficient,endingTime, TimeStep, FileName);
         // initializing the array needed
         int thesize = (int)(endingTime/TimeStep) + 1;// to calculate thesize
         double time[] = new double[thesize];// array for the time
         double Velocity[] = new double [thesize];// array for the velocity
         // initializing the time and velocity
         time[0] = 0.0;
         Velocity[0] = 0.0;
         int j = 1;
        
         // calculating the velocity using for loop
         for(double T = TimeStep; T < endingTime; T = T + TimeStep)
          {
             time[j] = T;
             Velocity[j] = velocitycalculation(Mass,Crosssectionarea,coefficient,T,TimeStep, Velocity[j-1]);// pasing parameters from another method
             j++;
          }
            
         BufferedWriter fileWriter;// declaring class
         try{
              fileWriter = new BufferedWriter(new FileWriter(FileName));// initialize new file
              int Output = (Velocity.length > time.length) ? time.length : Velocity.length;// ternatary is being used here to make sure that if the condition is eveluated to be true then the statement after ? will be executed
              printAddition(Velocity, time,Output,fileWriter); // for the output file
                
              if(Output > 10)// since we expect to have 10 examples as the output
                Output = 10;
                printAddition(Velocity, time, Output,consoleWriter);
                consoleWriter.flush();
                
                fileWriter.close();// closing the fileWriter
            } catch (IOException e1) {
                e1.printStackTrace();
            }
                
            System.out.println("Please enter dive? (y/[n]): ");// for the exit option
            answer = yes.next().charAt(0);
         }
            
            yes.close();// closing the scaner
            consoleWriter.close(); // closing the console writer
     }
   
   // creating method to do the main calcuclation
  public static double velocitycalculation(double Mass, double Crosssectionarea, double coefficient, double span, double time, double velocity){
        return velocity + (9.81 - ((coefficient * Crosssectionarea * 1.14)/(2 * Mass)) * velocity * velocity ) * span;// the main formula
   }
    
   // creating method to print the time and velocity as the output
  public static void printAddition(double Velocity[], double time[], int thesize, Writer writer)throws IOException{
     writer.append("Time & velocity");// providing the title for the data in the output (time and velocity)
        
     for(int k=0; k < thesize; k++)
     {
            writer.append(String.format("%.2f,",time[k]));// using append to print the time in output
            writer.append(String.format("%.4f \n",Velocity[k]));// using append to print the velocity in output
            
      }
    }
   // new method to trace variable
  public static void tracingvariable(double Mass,double Crosssectionarea, double coefficient, double endingtime, double timestep, String Filename){
      System.out.println("The mass is" + Mass);
      System.out.println("The crosses section area is" + Crosssectionarea);
      System.out.println("The drag coeficient is" + coefficient);
      System.out.println("The ending time is" + endingtime);
      System.out.println("The time step is" + timestep);
      System.out.println("The filename is" + Filename);
  }
}
            
        
                
                
            
            
            
            
    
   
            
            
        
            
           
    


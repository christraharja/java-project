import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class HW_Loops_Files{
    public static void main(String[] args){
        int CourseNum; // declaring number of the course
        Scanner inputFile = null; // file containing data
        
        try{// to set inputFile to the new scanner object and new FileInputstream object.
            inputFile = new Scanner(new FileInputStream("courseData.txt"));
        } catch (FileNotFoundException e){// if we are not able tolocate the .txt file, should print error message
            System.out.println("The file is not found.");
            System.exit(0);
        }
        // Let's do initialization using float variable for three of these below
        float pW = inputFile.nextFloat();// represents program weight
        float mW = inputFile.nextFloat();// represents midterm weight
        float fW = inputFile.nextFloat();// represents final weight
        testingvariable( pW, mW, fW);
        int CourseNumber = inputFile.nextInt();
        // to print the table 
        System.out.printf("Grade data for class" + CourseNumber + ": %n%n");
        System.out.println("ID Programs Mideterm Final Weighted Average Programs grade");
        System.out.println(" -- -------- ------- ----- ---------------- ---------------");  
        // Let's initialize the average of the class
        float average_class = 0;
        
        for(int i = 1; i <= 3; i++){// this for loop is expected to execute three times
            int StudentNumber = inputFile.nextInt();
            int ProgramGrade = inputFile.nextInt();
            int MidtermGrade = inputFile.nextInt();
            int FinalGrade = inputFile.nextInt();
           
            // Let's calculate the weighted average 
            float WeightedAverage = ((pW * ProgramGrade) + (mW * MidtermGrade) +(fW * FinalGrade));
            average_class = WeightedAverage + average_class;// accumulate the sum
            //print he statistics
        
            System.out.print(StudentNumber + "    " + ProgramGrade + "    " + MidtermGrade + "        " + FinalGrade + "             "+ WeightedAverage);
            if(ProgramGrade>=70.00){// assuming that 70 is a required grade to pass the class
                System.out.print("Pass the class");
            }
            else
            {
                System.out.print("Fail the class");
            }
            System.out.printf("%n");// space for next student
        }
        
        int z = inputFile.nextInt();
        System.out.printf("Class average =" + (average_class/3)+ "%n%n");
        // to print the average of the class
        float average_class2 = 0;
        CourseNumber = inputFile.nextInt();
        // print the table
        System.out.printf("Grade data for class" + CourseNumber + ": %n%n");
        System.out.println("ID Programs Mideterm Final Weighted Average Programs grade");
        System.out.println(" -- -------- ------- ----- ---------------- ---------------");  
        
        for(int i = 1; i <=5; i++){// for loop is expected to execute five times
            int StudentNumber = inputFile.nextInt();
            int ProgramGrade = inputFile.nextInt();
            int MidtermGrade = inputFile.nextInt();
            int FinalGrade = inputFile.nextInt(); 
            
            // let's calculate the weighted average
            float WeightedAverage = ((pW * ProgramGrade) + (mW * MidtermGrade) +(fW * FinalGrade));
            average_class2 = WeightedAverage + average_class2;
            // print the statistics
            System.out.print(StudentNumber + "    " + ProgramGrade + "    " + MidtermGrade + "        " + FinalGrade + "             "+ WeightedAverage);
        
            if(ProgramGrade>=70.00){// assuming that the passing grade is 70
                System.out.println("Pass the class");
            }
            else
            {
                System.out.print("Fail the class");
            }
            System.out.printf("%n");// to provided space
        }
        
        z = inputFile.nextInt();
        // calculaing and printing the average of the class
        System.out.printf("Class Average =" + (average_class2/5) +"%n%n");
    
        float average_class3 = 0;
        CourseNumber = inputFile.nextInt();
        // print the table
        System.out.printf("Grade data for class" + CourseNumber + ": %n%n");
        System.out.println("ID Programs Mideterm Final Weighted Average Programs grade");
        System.out.println(" -- -------- ------- ----- ---------------- ---------------");  
        
        for(int i = 1; i <= 3; i++){//for loop is expected to execute three times
            int StudentNumber = inputFile.nextInt();
            int ProgramGrade = inputFile.nextInt();
            int MidtermGrade = inputFile.nextInt();
            int FinalGrade = inputFile.nextInt(); 
            
            // let's calculate the weighted average
            float WeightedAverage = ((pW * ProgramGrade) + (mW * MidtermGrade) +(fW * FinalGrade));
            // accumulate the sum
            average_class3 = WeightedAverage + average_class3;
            // print the statistic
            System.out.print(StudentNumber + "    " + ProgramGrade + "    " + MidtermGrade + "        " + FinalGrade + "             "+ WeightedAverage);
         
            if( ProgramGrade>= 70.00){// assuming that 70 is a required grade to pass this class
                System.out.print("Pass the class");
            }
            else
            {
                System.out.print("Fail the class");
            }
            System.out.printf("%n");// to have space
        }
        
        z = inputFile.nextInt();
        // calculate the average of the class
        System.out.printf("Class Average =" + (average_class3/3) +"%n%n");
    }
    
    public static void testingvariable( float pW, float mW, float fW){// this method is created intentionally to trace variables
       System.out.println("Down here are the testing variable = ");
       float pw = pW;
       System.out.println("Program weight =" + pw);
       float mw = mW;
       System.out.println("Middle weight =" + mw);
       float fw = fW;
       System.out.println("Final weight =" + fw);
    } 
}
        
       
       
            
                
    
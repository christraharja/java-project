import java.util.Scanner;
public class HW_Branching{
    public static void main(String[] args) {// called it for three times as expected in the canvas.
        data();
        System.out.println("");
        data();
        System.out.println("");
        data();
    }
        
    public static void data(){
        Scanner homework = new Scanner(System.in);//Declaring new scanner.
            double average = 0;
        System.out.println("Enter the sales for Store 1:");// for store 1
            double firststore = homework.nextDouble();
        System.out.println("Enter the sales for Store 2:");// for store 2
            double secondstore = homework.nextDouble();
        System.out.println("Enter the sales for Store 3:");// for store 3
            double thirdstore = homework.nextDouble();
        System.out.println("Enter the sales for Store threshold:"); // for threshold
            double threshold = homework.nextDouble();
            
         // Condition if else statements for the program
         // Condition if one of those three greater than the threshold
         // In this case the average is just whatever value for the store that is greater than the threshold.
            if(firststore >= threshold && secondstore < threshold && thirdstore < threshold){
                System.out.println("Store 1 did great!");
                System.out.println("The average sales for exceeding stores:" + firststore);
        }
            else if (secondstore> threshold && firststore < threshold && thirdstore < threshold){
                System.out.println("Store 2 did great!");
                System.out.println("The average sales for exceeding stores:" + secondstore);
            }
            else if (thirdstore> threshold && secondstore < threshold && firststore < threshold) {
                System.out.println("Store 3 did great!");
                System.out.println("The average sales for exceeding stores:" + thirdstore);
            }// Condition if two of those three greater than the threshold  
             // In this case the average will be the sum of two stores that are greater than the threshold divided by two.
            else if (firststore> threshold && secondstore > threshold){  
                System.out.println("Store 1 and store 2 did great!");
                average = (firststore + secondstore)/2;
                System.out.println("The average sales for exceeding stores:" + average);
            }
            else if (firststore> threshold && thirdstore > threshold){   
                System.out.println("Store 1 and store 3 did great!");
                average = (firststore + thirdstore)/2;
                System.out.println("The average sales for exceeding stores:" + average);
            }
            else if (secondstore > threshold && thirdstore > threshold){
                System.out.println("Store 2 and store 3 did great!");
                average = (secondstore + thirdstore)/2;
                System.out.println("The average sales for exceeding stores:" + average);
            }// Condition if all of them are greater than the threshold
             // In this case the average will be the sum of three stores that are greater than the threshold divided by three.
            else if (firststore> threshold && secondstore > threshold && thirdstore> threshold){
                System.out.println("Store 1, store 2, and store 3 did great!");
                average = (firststore + secondstore + thirdstore)/3;
                System.out.println("The average sales for exceeding storfes:" + average);
            } // Special condition where no store is greater than the threshold
              // In this case the average will not appear in the program since no store is greater than the threshold
            else if (firststore < threshold &&  secondstore < threshold && thirdstore < threshold){
                System.out.println("No store met the threshold");
            }
        }
    }
                
                
                
                
                
    
           
        

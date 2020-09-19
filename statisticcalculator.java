import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
public class statisticcalculator{
    public static void main(String[] args){
        System.out.println("Welcome to statistics calculator!");
        System.out.println("Please choose options below");
        System.out.println("1 find the mean");
        System.out.println("2 find the median");
        System.out.println("3 find the mode");
        Scanner opt = new Scanner(System.in);
        int option;
        option = opt.nextInt();
        if(option == 1){// find the mean
            System.out.println("Please enter the list of numbers");
            int length1;
            System.out.println("Please enter the amount of number in the list");
            length1 = opt.nextInt();
            int [] dset1 = new int[length1];
            for(int k=0; k<length1; k++){
                dset1[k]=opt.nextInt();
            }
            int summation;
            summation = 0;
            for(int i: dset1){
                summation = summation + i;
            }
            System.out.println("The mean of the list is" + ((double)summation/dset1.length));
        }
        else if(option == 2){// find the median
            System.out.println("Please enter the list of numbers");
            int length2;
            System.out.println("Please enter the amount of number in the list");
            length2 = opt.nextInt();
            int [] dset2 = new int[length2];
            for(int j=0; j<length2; j++){
                dset2[j]=opt.nextInt();
            }
            Arrays.sort(dset2);
            if(dset2.length % 2 != 0){
                System.out.println("The median of the list is" + dset2[dset2.length/2]);
            }
            else
            {
                System.out.println("The median of the list is" + (dset2[dset2.length/2] + dset2[dset2.length/2-1])/2);
            }
        }
        else if(option == 3){// find the mode
            System.out.println("Please enter the list of numbers");
            int length3;
            System.out.println("Please enter the amount of number in the list");
            length3 = opt.nextInt();
            int [] dset3 = new int[length3];
            for(int i=0; i<length3; i++){
                dset3[i]=opt.nextInt();
            }
            int maximum;
            int maximumapp;
            maximum = -1;
            maximumapp = -1;
            for(int a=0; a<dset3.length; a++){
                int c; // to count the amount of number in the list
                c = 0;
                for(int b=0 ; b<dset3.length; b++){
                    if(dset3[a] == dset3[b]){
                        c++;
                    }
                if(c > maximumapp){
                    maximum = dset3[a];
                    maximumapp = c;
                }
            }
            System.out.println("The mode of the list is" + maximum);
        }    
    }else
    {
        System.out.println("The option is currenty not available, please try again");
    }
    System.out.println("Thanks for using this statistics calculator");
}
}
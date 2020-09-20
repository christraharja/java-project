/* Transitsystem class was created to read data from the given file
 * check to see if there is apossible path
 * Afterward, print paths that can be used
 */
import java.util.Scanner;// importing scanner class
import java.io.IOException;// importing IOException
import java.io.FileInputStream;// importing fileinputstream
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.lang.String;

public class Transitsystem{
    // declaring instance variables needed for this class
    private ArrayList<String> nameofthestation;// to store the name of the station
    private ArrayList<Line> lineobject;// to store the line
    private ArrayList<Integer> pathway;
    private String nameline = "";
    private String startstation;
    private String endstation;
    
    public Transitsystem(){// making constructor method
        lineobject = new ArrayList<Line>();
        nameofthestation = new ArrayList<String>();
        pathway = new ArrayList<Integer>();
    }
    
    public void readLine(String filename){
        // declaring needed locale variables for this method
        String nameline;
        int amtofstation;
        
        Scanner myfile = null;// declaring new scanner to take input file
        // create exception try and catch for the input file
        try{
            myfile = new Scanner(new FileInputStream(filename));
        }catch(FileNotFoundException e){
            System.out.println("The file was not found");
            System.exit(0);
        }
        
        Line linez;// declaring class linez
        while(myfile.hasNextLine())// declaring while loop until there is no more line left
            
          { linez = new Line();// make the line as an object
            String numberstation [] = myfile.nextLine().split("");// make first line's split
            nameline = numberstation[0];// get the name of the line
            linez.setName(nameline);// set the linename to line object form
            try{
                amtofstation = Integer.parseInt(numberstation[1]);// obtain the number of the station
            
                String stationy [] = myfile.nextLine().split("");// to get the second line
            
            // add stations to the line object type
                for(int j = 0; j < amtofstation; j++){
                linez.addStation(stationy[j]);
                nameofthestation.add(stationy[j]);
            }
        }catch(NumberFormatException ex){
        lineobject.add(linez);// add the line object tto array list lines
    }
}
 }   
    // this method was made to find paths between the first place to the destination
    private void findpath(int x, int y){
        boolean[] hasitbeenvisited = new boolean[nameofthestation.size()];
        ArrayList<Integer> listofstation = new ArrayList<>();
        listofstation.add(x);
    }
    
    // method to check if there exists a station to transit exist between the first splace to the destination
    public boolean hasRoute(String startstation, String endstation){
        // initializing the start and end 
        this.startstation = startstation;
        this.endstation = endstation;
        
        // get the index of the first station
        int idxone = nameofthestation.indexOf(startstation);
        // get the index of the destination station
        int idxtwo = nameofthestation.indexOf(endstation);
        Line initialline = getnameline(startstation);// get the line object of the first station
        
        // if statement only to check if transit station exists
        if(idxone < 0 && idxtwo < 0){
            return false;
        } else if (initialline.hasStation(endstation))
        {
            getdetailabouttheline(initialline, startstation, endstation);
            return true;
        }
        else
        {
        
        findpath(idxone, idxtwo);
        boolean sl = false;
        if(pathway.size()==0)
            return false;
            return true;
        }
    }
    
    // this method is to get the line object if the startstation exists
    private Line getnameline(String startstation){
        for(int j = 0; j < lineobject.size(); j++)
        {
            if(lineobject.get(j).hasStation(startstation)){
                return lineobject.get(j);
            }
        } return null;
    }
    
    // addition method to keep track of the index for the array
    private int getIndex (ArrayList<String>stations,String station){
        for(int i = 0; i < stations.size(); i++){
            if(stations.get(i).equals(station)){
                return i;
            }
        }
        return -1;
    }
    
    // method to get the detail about the station lines
    private void getdetailabouttheline(Line linez, String startstation, String endstation){ 
        ArrayList<String> station = linez.getStationx();
        nameline = linez.getName();
        int s = getIndex(station, startstation);
        int e = getIndex(station, endstation);
        for(int o = s; o < e; o++)
        {
            boolean sl = true;
            pathway.add(nameofthestation.indexOf(station.get(o)));
        }
    }
    
    // method to print the paths between two given stations
    public void printRoute(){
        boolean sl = false;
        if(sl && pathway.size() != 0){
            System.out.println("Take the" + nameline + "line comes from" + startstation + " transfer to" + endstation);
        }
        else if(sl == false && pathway.size() != 0){
            
            // loop through pathway list
            for(int e = 1; e < pathway.size(); e++){
                // get the name of the station
                String station = nameofthestation.get(pathway.get(e-1));
                String tf;
                // get the destination station name
                String secondstation = nameofthestation.get(pathway.get(e));
                // get the line object
                Line lineX = getnameline(station);
                Line lineE = getnameline(secondstation);
                // if e is less than or equal to pathway
                if(e <= pathway.size()-1)
                {
                    if(e-1 == 0)
                    {
                        System.out.print("Take the" + lineX.getName() + "line from" + nameofthestation.get(pathway.get(e-1)));
                    }
                }
                
                // find the transgfer station
                tf = lineX.findTransfer(lineE);
                
                if(!lineX.getName().equals(lineE.getName())){
                    System.out.print(", transfer to the "+ lineE.getName() + "line at" +  tf);
                }
                
                if(e == pathway.size()-1){
                    System.out.print(", continue to" + endstation);
                }
            }
        }
    }
}
                
                    
        
    
    
        
        
    
        
   
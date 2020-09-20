/* Line class was made to contain the line name and stations that exists in the line*/

import java.util.Scanner;// importing scanner class
import java.util.ArrayList;// import array list

public class Line{
    private String linename;// declaring instance variable
    private ArrayList<String>stationx;
    
   public Line(){// constructor method to initialize
       stationx = new ArrayList<String>();
    }
    
   public void addStation(String station){// method to add station
       stationx.add(station);
    }
    
   public boolean hasStation(String station){// method to check if the station exist
        
      for(String nameofthestation : stationx){
           
          if(nameofthestation.equalsIgnoreCase(station)){
               return true;// return true if exists
            }
            } return false;// otherwise return false
    }
    
   public String findTransfer(Line otherLine){// method to find transfer station
        ArrayList<String> anotherstats = otherLine.stationx;
        
        //loop in order to check whether the station exists
        for(int i = 0; i < anotherstats.size(); i++){
            
            if(hasStation(anotherstats.get(i))){
                return anotherstats.get(i);
            }
        }
        return ("");
    }
    
   // getter method to get the of th line
   public String getName(){
        return linename;// returns the string of linename
    }
   // getter method to get stationx
   public ArrayList getStationx(){
       return stationx;
    }
   // setter method to set stationx
   public void setStationx(ArrayList <String> n){
        stationx = n;
    }
   // setter method to set the name with parameter value n
   public void setName(String n){
        linename = n;
    }
}
    
    
        
        

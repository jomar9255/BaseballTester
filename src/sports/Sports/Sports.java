/*
 * Developed by Joshua Marquardt
 * 09/11/2016
 */

package sports.Sports;

/**
 *
 * @author jomar9255
 */
public class Sports{
    private int numberOfPlayers;
    private String teamName;
    
    public Sports(){
        numberOfPlayers = (int)(Math.random() * 30) + 1;
        teamName = "Unknown";
    }
    
    public Sports(int numPlayers, String name){
        numberOfPlayers = numPlayers;
        teamName = name;
    }
    
    public int getPlayers(){
        return numberOfPlayers;
    }
    
    public void setPlayers(int numPlayers){
        numberOfPlayers = numPlayers;
    }
    
    public String getName(){
        return teamName;
    }
    
    public void setName(String name){
        teamName = name;
    }
    
   
}

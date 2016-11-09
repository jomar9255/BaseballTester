/*
 * Developed by Joshua Marquardt
 * 09/11/2016
 */

package sports.Sports;

/**
 *
 * @author jomar9255
 */
public class BaseballTeam extends Sports implements Stats {
    private int wins, losses, ties;
    
    public BaseballTeam(){
        super();
        wins = 0;
        losses = 0;
        ties = 0;
    }
    
    public BaseballTeam(int numPlayers,String name, int win, int loss, int tie){
        super(numPlayers,name);
        wins = win;
        losses = loss;
        ties = tie;
    }
    
    @Override
    public String overAllPoints(){
        String out = super.getName() 
                + " record: " 
                + wins + "/"
                + losses + "/"
                + ties + "/";
        return out;
    }
    
}

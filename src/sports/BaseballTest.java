
package sports;
import sports.Sports.Sports;
import sports.Sports.BaseballTeam;
public class BaseballTest {

    public static void main(String[] args) {
     
        BaseballTeam myTeam = new BaseballTeam(25, "Hawkeye Homers", 5, 7, 9);
        System.out.println(myTeam.getName());//prints the team name
        myTeam.setName("Duck Dodgers");//name is set from the Sports class
        System.out.println(myTeam.overAllPoints());
    }
    
}

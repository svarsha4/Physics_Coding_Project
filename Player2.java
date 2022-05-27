
import java.util.ArrayList;

import java.util.Scanner;

/**
 * creates a Player2 object which consists of the player's name and team and player2 will always have the turn after player1
 *
 * Saul Varshavsky
 * @version (a version number or a date)
 */
public class Player2
{
    private String player;
    private String team;
    private ArrayList<Integer> displacement;
    private ArrayList<Integer> launchVelocity;
    private ArrayList<Integer> angle;
    private ArrayList<Integer> landVelocity;
    private int l;
    private int j;
    private int u;
    private int v;
    /**
     * @param: none
     * default constructor which is meant to decide on the player and team name by using a scanner
     * initializes each of the array lists above with random values
     * user decides on which index in the array he or she wants to obtain an element of either of the above array lists, and stores the user's responses in the private integer variables above 
     * 
     */public Player2() 
    {
        Scanner pteam = new Scanner(System.in);
        System.out.println("What is the name of Player2?");
        player = pteam.nextLine();
        System.out.println("What is the name of " + player + "'s team?");
        team = pteam.nextLine();

    

        displacement = new ArrayList<Integer>();
        int i = 0;
        while( i < 21 )
        {
            displacement.add((int)(Math.random()*100+(i+1)));
            i++;
        }
        launchVelocity = new ArrayList<Integer>();
        i = 0;
        while( i < 21 )
        {
            launchVelocity.add((int)(Math.random()*100+(i+1)));
            i++;
        }

        landVelocity = new ArrayList<Integer>();
        i = 0;
        while( i < 21 )
        {
            landVelocity.add((int)(Math.random()*100+(i+1)));
            i++;
        }
        angle = new ArrayList<Integer>();
        i = 0;
        int degree = 3;
        while(i < 30)
        {
            angle.add(degree);
            degree += 3;
            i++;

        }
        Scanner scan = new Scanner(System.in);
        System.out.println("There are 21 random launch velocities for " + player + " to choose from. Please choose the launch velocity number you would like to have");
        l = scan.nextInt();
        System.out.println("There are 21 random land velocities for " + player + " to choose from. Please choose the land velocity number you would like to have");
        j = scan.nextInt();
        System.out.println("There are 21 random horizontal displacements for " + player + " to choose from. Please choose the horizontal displacement number you would like to have");
        u = scan.nextInt();
        System.out.println("There are 30 random launch angles for " + player + " to choose from. Please choose the launch angle number you would like to have");
        v = scan.nextInt();

    }
    /**
     * @param: none
     * @return: a random element from the index the user specified in the launchVelocity array list
     * Note: the index is updated to the user's chosen index -1, so as to avoid having the user choose 0 as one of the indexes
     * this just simply makes the user less confused, especially if the user doesn't have programming experience
     */public int getLaunchVelocity()
    {
        
        return launchVelocity.get(l-1);
    }
    /**
     * @param: none
     * @return: a random element from the index the user specified in the landVelocity array list
     * Note: the index is updated to the user's chosen index -1, so as to avoid having the user choose 0 as one of the indexes
     * this just simply makes the user less confused, especially if the user doesn't have programming experience
     */public int getLandVelocity()
    {
        
        return landVelocity.get(j-1);
    }
    /**
     * @param: none
     * @return: a random element from the index the user specified in the displacement array list
     * Note: the index is updated to the user's chosen index -1, so as to avoid having the user choose 0 as one of the indexes
     * this just simply makes the user less confused, especially if the user doesn't have programming experience
     */public int getDisplacement()
    {
        
        return displacement.get(u-1);
    }
    /**
     *  @param: none
     * @return: a random element from the index the user specified in the angle array list
     * Note: the index is updated to the user's chosen index -1, so as to avoid having the user choose 0 as one of the indexes
     * this just simply makes the user less confused, especially if the user doesn't have programming experience
     */public int getAngle()
    {
        
        return angle.get(v-1);
    }
    

    /**
     *  @param: none
     * @return: the name of the player
     */public String getPlayer()
    {
        return player;
    }

    /**
     * @param: none
     * @return: the name of the player's team
     */public String getTeam()
    {
        return team;
    }

    /**
     * @param: none
     * @return: String indicating all the information about the player1 object
     */public String toString()
    {

        String information = "Player2 name: " + getPlayer() + "     Team name: " + getTeam() + "    These are the values you may be using depending on the question type: v0 = " + launchVelocity.get(l-1) + " vf = " + landVelocity.get(j-1) + " x = " + displacement.get(u-1) + " theta = " + angle.get(v-1);
        return information;

    }

    
     
    
}

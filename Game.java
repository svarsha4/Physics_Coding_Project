import java.util.Scanner;
import java.util.ArrayList;
/**
 * The Game class essentially runs the whole game and performs all of the necessary mathematical calculations to verify the user's answers to various questions
 *
 * Saul Varshavsky
 * @version (a version number or a date)
 */
public class Game
{

    /**
     * main method: starts the game
     * calls the setUp method if users (multiplayer game) want to play the game
     */public static void main(String [] args)
    {
        int penalty1 = 0;
        int penalty2 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to start or continue playing HORSE? (y/n)");
        String cont = scan.nextLine();
        if(cont.equals("y"))
        {
            setUp(penalty1, penalty2);
        }
    }

    /**
     * @param: int penalty1 int penalty2
     * lays out the instructions of the game HORSE and from there calls the play1 method, since player1 goes first
     * the same parameters penalty1 and penalty2 get transferred to the play1 method, as they will be very important later on
     * @return: none
     */public static void setUp(int penalty1, int penalty2)
    {
        System.out.println("Before the game starts, the players need to be determined.");
        Player1 p1 = new Player1();
        Player2 p2 = new Player2();

        System.out.println("Some of the values that were asked from above may be used, depending on which question is asked.");
        System.out.println("Your main goal of the game is NOT to LOSE.");
        System.out.println("The player loses when HORSE is spelled out.");
        System.out.println("The letter from the word HORSE is spelled each time the player doesn't make the basketball inside the hoop.");
        System.out.println("You must rely on your knowledge of physics and calculus to make the ball inside the hoop.");
        System.out.println("If you get a negative value, ALWAYS take the absolute value of it");
        System.out.println("If you have any decimal, cut it off completely and include ONLY the whole number");
        System.out.println("With that said...Good luck!");
        System.out.println("One last thing...Player1 goes first! The players each take turns, starting from Player1, then going to Player2, then repeating.");
        play1(p1, p2, penalty1, penalty2);

    }

    /**
     * @param: Player1 p1, Player2 p2, int penalty1, int penalty2
     * creates a planet object, so as to access the questions
     * depending on the question that is asked to player1, a certain calculate type method will be called, that will contain
     * the same parameters as above in addition to the new planet object that was created
     * These parameters may not all be useful now, but when they are constantly transferred they are able to get to the methods they are supposed to be used in without causing unecessary disruptions in the game
     * @return: none
     */public static void play1(Player1 p1, Player2 p2, int penalty1, int penalty2)
    {
        Planet mars = new Planet(p1, p2);

        if(mars.getQuestion().equals("What is the launch angle?"))
        {

            System.out.println("Given the hoop is at a HORIZONTAL distance of x = " + p1.getDisplacement() + " m away from the origin, the ball makes it inside the hoop with vf = " + p1.getLandVelocity() + " m/s, and the time it takes for the ball to reach and go inside the hoop is t = 20 s");
            System.out.println("Here is your acceleration equation " + mars.getAccelerationEquation1());
            Scanner ask = new Scanner(System.in);
            System.out.println("Find the launch angle of the ball to make it inside the hoop (Answer is expressed in radians, but only include the numerical value)");
            int ans1 = ask.nextInt();
            calculateAngle1(ans1, p1, p2, mars, penalty1, penalty2);
        }
        else if(mars.getQuestion().equals("What is the final velocity?"))
        {

            System.out.println("Given the ball is launched at an angle of theta = " + p1.getAngle() + " radians, the height of the hoop is h = 30 m, and the time it takes for the ball to reach and go inside the hoop is  t = 20 s");
            System.out.println("Here is your acceleration equation " + mars.getAccelerationEquation1());
            Scanner ask = new Scanner(System.in);
            System.out.println("Find the velocity of the ball when it lands inside the hoop (Answer is expressed in m/s, but only include the numerical value)");
            int ans2 = ask.nextInt();
            calculateLandVelocity1(ans2, p1, p2, mars, penalty1, penalty2);
        }
        else if(mars.getQuestion().equals("What is the initial velocity?"))
        {

            System.out.println("Given the ball is launched at an angle of theta = " + p1.getAngle() + " radians, the height of the hoop is h = 30 m, the time it takes for the ball to reach and go inside the hoop is  t = 20 s, and the ball makes it inside the hoop with vf = " + p1.getLandVelocity() + " m/s");
            System.out.println("He is your acceleration equation " + mars.getAccelerationEquation1());
            Scanner ask = new Scanner(System.in);
            System.out.println("Find the launch velocity of the ball to make it inside the hoop (Answer is expressed in m/s, but only include the numerical value)");
            int ans3 = ask.nextInt();
            calculateLaunchVelocity1(ans3, p1, p2, mars, penalty1, penalty2);
        }
        else if(mars.getQuestion().equals("What is the horizontal displacement?"))
        {
            System.out.println("Given the ball lands in the hoop with a landing velocity of vf = " + p1.getLandVelocity() + " m/s and takes t = 20 s to reach and land inside the hoop");
            System.out.println("He is your acceleration equation " + mars.getAccelerationEquation1());
            Scanner ask = new Scanner(System.in);
            System.out.println("Find the distance L the ball is away from the hoop. (Answer is expressed in m but only include the numerical value)");
            int ans4 = ask.nextInt();
            calculateDisplacement1(ans4, p1, p2, mars, penalty1, penalty2);

        }
    }

    /**
     * @param: Player1 p1, Player2 p2, int penalty1, int penalty2
     * creates a planet object, so as to access the questions
     * depending on the question that is asked to player2, a certain calculate type method will be called, that will contain
     * the same parameters as above in addition to the new planet object that was created
     * These parameters may not all be useful now, but when they are constantly transferred they are able to get to the methods they are supposed to be used in without causing unecessary disruptions in the game
     * @return: none
     */public static void play2(Player1 p1, Player2 p2, int penalty1, int penalty2)
    {
        Planet mars = new Planet(p1, p2);

        if(mars.getQuestion().equals("What is the launch angle?"))
        {

            System.out.println("Given the hoop is at a HORIZONTAL distance of x = " + p2.getDisplacement() + " m away from the origin, the ball makes it inside the hoop with vf = " + p2.getLandVelocity() + " m/s, and the time it takes for the ball to reach and go inside the hoop is t = 20 s");
            System.out.println("Here is your acceleration equation " + mars.getAccelerationEquation2());
            Scanner ask = new Scanner(System.in);
            System.out.println("Find the launch angle of the ball to make it inside the hoop (Answer is expressed in radians, but only include the numerical value)");
            int ans1 = ask.nextInt();
            calculateAngle2(ans1, p1, p2, mars, penalty1, penalty2);
        }
        else if(mars.getQuestion().equals("What is the final velocity?"))
        {

            System.out.println("Given the ball is being launched at an angle of theta =  " + p2.getAngle() + " radians, the height of the hoop is h = 30 m, the time it takes for the ball to reach and go inside the hoop is  t = 20 s");
            System.out.println("Here is your acceleration equation " + mars.getAccelerationEquation2());
            Scanner ask = new Scanner(System.in);
            System.out.println("Find the velocity of the ball when it lands inside the hoop (Answer is expressed in m/s, but only include the numerical value)");
            int ans2 = ask.nextInt();
            calculateLandVelocity2(ans2, p1, p2, mars, penalty1, penalty2);
        }
        else if(mars.getQuestion().equals("What is the initial velocity?"))
        {

            System.out.println("Given the ball is launched at an angle of theta = " + p2.getAngle() + " radians, the height of the hoop is h = 30 m, the time it takes for the ball to reach and go inside the hoop is  t = 20 s, and the ball makes it inside the hoop with vf = " + p2.getLandVelocity() + " m/s");
            System.out.println("Here is your acceleration equation " + mars.getAccelerationEquation2());
            Scanner ask = new Scanner(System.in);
            System.out.println("Find the launch velocity of the ball to make it inside the hoop (Answer is expressed in m/s, but only include the numerical value)");
            int ans3 = ask.nextInt();
            calculateLaunchVelocity2(ans3, p1, p2, mars, penalty1, penalty2);
        }
        else if(mars.getQuestion().equals("What is the horizontal displacement?"))
        {
            System.out.println("Given the ball lands in the hoop with a landing velocity of vf = " + p2.getLandVelocity() + " m/s and takes t = 20 s to reach and land inside the hoop");
            System.out.println("He is your acceleration equation " + mars.getAccelerationEquation2());
            Scanner ask = new Scanner(System.in);
            System.out.println("Find the distance L the ball is away from the hoop. (Answer is expressed in m but only include the numerical value)");
            int ans4 = ask.nextInt();
            calculateDisplacement2(ans4, p1, p2, mars, penalty1, penalty2);

        }
    }

    /**
     * @param: int ans4, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2
     * calculates the actual value of the variable that player1 was supposed to solve for in one of the questions
     * verifies player1's answer, by seeing if it matches with the actual value
     * if the verification proves successful, then player1 is correct and it becomes player2's turn by having the method play2 called
     * otherwise, player1 is wrong and the method updatePenalty1 is called with the same parameters as above, except ans4 and mars
     */public static void calculateDisplacement1(int ans4, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2)
    {
        int vf = p1.getLandVelocity();
        double v0 = vf - ((mars.getTwo1())/3.0)*Math.pow(20,3) - ((mars.getOne1())/2.0)*Math.pow(20,2) + mars.getZero1()*20.0;
        int val = (int)(((mars.getTwo1())/12.0)*Math.pow(20,4) + ((mars.getOne1())/6.0)*Math.pow(20,3) - ((mars.getZero1())/2.0)*Math.pow(20,2) + v0*20);
        int x = Math.abs(val);

        if(ans4 == x)
        {
            System.out.println("correct!");
            play2(p1, p2, penalty1, penalty2);
        }
        else
        {
            System.out.println("Sorry " + p1.getPlayer() +", your team " + p1.getTeam() + " gets a letter.");
            updatePenalty1(p1, p2, penalty1, penalty2);
        }
    }

    /**
     * @param: int ans4, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2
     * calculates the actual value of the variable that player2 was supposed to solve for in one of the questions
     * verifies player2's answer, by seeing if it matches with the actual value
     * if the verification proves successful, then player2 is correct and it becomes player1's turn by having the method play1 called
     * otherwise, player1 is wrong and the method updatePenalty2 is called with the same parameters as above, except ans4 and mars
     */public static void calculateDisplacement2(int ans4, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2)
    {
        int vf = p2.getLandVelocity();
        double v0 = vf - ((mars.getTwo2())/3.0)*Math.pow(20,3) - ((mars.getOne2())/2.0)*Math.pow(20,2) + mars.getZero2()*20.0;
        int val = (int)(((mars.getTwo2())/12.0)*Math.pow(20,4) + ((mars.getOne2())/6.0)*Math.pow(20,3) - ((mars.getZero2())/2.0)*Math.pow(20,2) + v0*20);
        int x = Math.abs(val);
        if(ans4 == x)
        {
            System.out.println("correct!");
            play1(p1, p2, penalty1, penalty2);
        }
        else
        {
            System.out.println("Sorry " + p1.getPlayer() +", your team " + p1.getTeam() + " gets a letter.");
            updatePenalty2(p1, p2, penalty1, penalty2);
        }
    }

    /**
     * @param: int ans1, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2
     * calculates the actual value of the variable that player1 was supposed to solve for in one of the questions
     * verifies player1's answer, by seeing if it matches with the actual value
     * if the verification proves successful, then player1 is correct and it becomes player2's turn by having the method play2 called
     * otherwise, player1 is wrong and the method updatePenalty1 is called with the same parameters as above, except ans1 and mars
     */public static void calculateAngle1(int ans1, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2)
    {

        int vf = p1.getLandVelocity();
        int x = p1.getDisplacement();
        double v0 = (vf - ((mars.getTwo1())/3)*Math.pow(20, 3) - ((mars.getOne1())/2)*Math.pow(20, 2) + (mars.getZero1())*20);
        double val = Math.abs(x/(v0*20));
        int theta = (int)(Math.acos(val));
        if(ans1 == theta)
        {
            System.out.println("correct!");
            play2(p1, p2, penalty1, penalty2);
        }

        else
        {
            System.out.println("Sorry " + p1.getPlayer() +", your team " + p1.getTeam() + " gets a letter.");
            updatePenalty1(p1, p2, penalty1, penalty2);

        }
    }

    /**
     *  @param: int ans1, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2
     * calculates the actual value of the variable that player2 was supposed to solve for in one of the questions
     * verifies player2's answer, by seeing if it matches with the actual value
     * if the verification proves successful, then player2 is correct and it becomes player1's turn by having the method play1 called
     * otherwise, player2 is wrong and the method updatePenalty2 is called with the same parameters as above, except ans1 and mars
     */public static void calculateAngle2(int ans1, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2)
    {

        int vf = p2.getLandVelocity();
        int x = p2.getDisplacement();
        double v0 = (vf - ((mars.getTwo2())/3)*Math.pow(20, 3) - ((mars.getOne2())/2)*Math.pow(20, 2) + (mars.getZero2())*20);
        double val = Math.abs(x/(v0*20));
        int theta = (int)(Math.acos(val));
        if(ans1 == theta)
        {
            System.out.println("correct!");
            play1(p1, p2, penalty1, penalty2);
        }

        else
        {
            System.out.println("Sorry " + p2.getPlayer() +", your team " + p2.getTeam() + " gets a letter.");
            updatePenalty2(p1, p2, penalty1, penalty2);

        }
    }

    /**
     *  @param: int ans2, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2
     * calculates the actual value of the variable that player1 was supposed to solve for in one of the questions
     * verifies player1's answer, by seeing if it matches with the actual value
     * if the verification proves successful, then player1 is correct and it becomes player2's turn by having the method play2 called
     * otherwise, player1 is wrong and the method updatePenalty1 is called with the same parameters as above, except ans2 and mars
     */public static void calculateLandVelocity1(int ans2, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2)
    {
        double acceleration = mars.getTwo1()*Math.pow(20, 2) + mars.getOne1()*20 - mars.getZero1();
        double v0y = (30 - 0.5*acceleration*Math.pow(20, 2))/20;
        double v0ysquared = Math.pow(v0y, 2);
        double vfysquared = 2*acceleration*30 + v0ysquared;
        double val = vfysquared/Math.pow((Math.sin(p1.getAngle())), 2);
        double absvalue = Math.abs(val);
        int vf = (int)(Math.sqrt(absvalue));

        if(ans2 == vf)
        {
            System.out.println("correct!");
            play2(p1, p2, penalty1, penalty2);
        }

        else
        {
            System.out.println("Sorry " + p1.getPlayer() +", your team " + p1.getTeam() + " gets a letter.");
            updatePenalty1(p1, p2, penalty1, penalty2);

        }
    }

    /**
     * @param: int ans2, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2
     * calculates the actual value of the variable that player2 was supposed to solve for in one of the questions
     * verifies player2's answer, by seeing if it matches with the actual value
     * if the verification proves successful, then player2 is correct and it becomes player1's turn by having the method play1 called
     * otherwise, player2 is wrong and the method updatePenalty2 is called with the same parameters as above, except ans2 and mars
     */public static void calculateLandVelocity2(int ans2, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2)
    {
        double acceleration = mars.getTwo2()*Math.pow(20, 2) + mars.getOne2()*20 - mars.getZero2();
        double v0y = (30 - 0.5*acceleration*Math.pow(20, 2))/20;
        double v0ysquared = Math.pow(v0y, 2);
        double vfysquared = 2*acceleration*30 + v0ysquared;
        double val = vfysquared/Math.pow((Math.sin(p2.getAngle())), 2);
        double absvalue = Math.abs(val);
        int vf = (int)(Math.sqrt(absvalue));

        if(ans2 == vf)
        {
            System.out.println("correct!");
            play1(p1, p2, penalty1, penalty2);
        }

        else
        {
            System.out.println("Sorry " + p2.getPlayer() +", your team " + p2.getTeam() + " gets a letter.");
            updatePenalty2(p1, p2, penalty1, penalty2);

        }
    }

    /**
     * @param: int ans3, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2
     * calculates the actual value of the variable that player1 was supposed to solve for in one of the questions
     * verifies player1's answer, by seeing if it matches with the actual value
     * if the verification proves successful, then player1 is correct and it becomes player2's turn by having the method play2 called
     * otherwise, player1 is wrong and the method updatePenalty1 is called with the same parameters as above, except ans3 and mars
     */public static void calculateLaunchVelocity1(int ans3, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2)
    {
        double acceleration = mars.getTwo1()*Math.pow(20, 2) + mars.getOne1()*20 - mars.getZero1();
        double vfysquared = Math.pow((p1.getLandVelocity()), 2)*Math.pow((Math.sin(p1.getAngle())), 2);
        double v0ysquared = vfysquared - 2*acceleration*30;
        double val = v0ysquared/Math.pow((Math.sin(p1.getAngle())), 2);
        double absvalue = Math.abs(val);
        int v0 = (int)(Math.sqrt(absvalue));

        if(ans3 == v0)
        {
            System.out.println("correct!");
            play2(p1, p2, penalty1, penalty2);
        }

        else
        {
            System.out.println("Sorry " + p1.getPlayer() +", your team " + p1.getTeam() + " gets a letter.");
            updatePenalty1(p1, p2, penalty1, penalty2);

        }
    }

    /**
     * @param: int ans3, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2
     * calculates the actual value of the variable that player2 was supposed to solve for in one of the questions
     * verifies player2's answer, by seeing if it matches with the actual value
     * if the verification proves successful, then player2 is correct and it becomes player1's turn by having the method play1 called
     * otherwise, player2 is wrong and the method updatePenalty2 is called with the same parameters as above, except ans3 and mars
     */public static void calculateLaunchVelocity2(int ans3, Player1 p1, Player2 p2, Planet mars, int penalty1, int penalty2)
    {
        double acceleration = mars.getTwo2()*Math.pow(20, 2) + mars.getOne2()*20 - mars.getZero2();
        double vfysquared = Math.pow((p2.getLandVelocity()), 2)*Math.pow((Math.sin(p2.getAngle())), 2);
        double v0ysquared = vfysquared - 2*acceleration*30;
        double val = v0ysquared/Math.pow((Math.sin(p2.getAngle())), 2);
        double absvalue = Math.abs(val);
        int v0 = (int)(Math.sqrt(absvalue));

        if(ans3 == v0)
        {
            System.out.println("correct!");
            play1(p1, p2, penalty1, penalty2);
        }

        else
        {
            System.out.println("Sorry " + p1.getPlayer() +", your team " + p1.getTeam() + " gets a letter.");
            updatePenalty2(p1, p2, penalty1, penalty2);

        }
    }

    /**
     *  @param: Player1 p1, Player2 p2, int penalty1, int penalty2
     *  increments the penalty1 for player1 and calls the horse1 method with the exact same parameters
     *  @return: none
     */public static void updatePenalty1(Player1 p1, Player2 p2, int penalty1, int penalty2)
    {
        penalty1++;
        horse1(penalty1, penalty2, p1, p2);
    }

    /**
     * @param: Player1 p1, Player2 p2, int penalty1, int penalty2
     *  increments the penalty2 for player2 and calls the horse2 method with the exact same parameters
     * @return: none
     */public static void updatePenalty2(Player1 p1, Player2 p2, int penalty1, int penalty2)
    {
        penalty2++;
        horse2(penalty1, penalty2, p1, p2);
    }

    /**
     * @param: int penalty1, int penalty2, Player1 p1, Player2 p2
     * using the number of penalty1 that was obtained from the updatePenalty1 method for player1, it can be determined which letter or letters are in HORSE for player1
     * once the letter or letters is/are decided, the play2 method will be called to start player2's turn
     * if player1 loses, then a question gets asked to the player which from there terminates the game
     * @return: none
     */public static void horse1(int penalty1, int penalty2, Player1 p1, Player2 p2)
    {
        if(penalty1 == 1)
        {
            System.out.println("" + p1.getPlayer() + " has H");
            play2( p1, p2, penalty1, penalty2);

        }
        else if(penalty1 == 2)
        {
            System.out.println("" + p1.getPlayer() + " has HO");
            play2(p1, p2, penalty1, penalty2);
        }
        else if(penalty1 == 3)
        {
            System.out.println("" + p1.getPlayer() + " has HOR");
            play2(p1, p2, penalty1, penalty2);
        }
        else if(penalty1 == 4)
        {
            System.out.println("" + p1.getPlayer() + " has HORS");
            play2(p1, p2, penalty1, penalty2);
        }
        if(penalty1 == 5)
        {
            System.out.println("" + p1.getPlayer() + " has HORSE");
            System.out.println("" + p1.getPlayer() + " you lose!");
            System.out.println("However, you deserve a cool question!");
            System.out.println("For every problem that involves finding the launch angle, it seems that it approaches a certain value.");
            Scanner conc = new Scanner(System.in);
            System.out.println("Which value does the launch angle approach for any random displacement and velocity (Round to 2 decimal places)");
            double approach = conc.nextDouble();
            if(approach == 1.57)
            {
                System.out.println("That is approximately pi/2 radians or 90 degrees, given there is an acceleration function bt^2 + ct - d where b,c, and d are constants!");
                System.out.println("Therefore, for every i, which represents the number of a random horizontal displacement and landing velocity where 1 <= i <= 21,");
                System.out.println("a random value for either the horizontal displacement x(i) or landing velocity vf(i) will be generated such that x(i+2) < random displacement value < x(50) and vf(i+2) < random landing velocity value < vf(50)");
                System.out.println("and the calculated launch angle for any random generated value on both intervals will approach pi/2 radians");
                System.out.println("This is an excellent illustration of how physics, calculus, and computer science work together to produce something awesome!");

            }
            else
            {
                System.out.println("wrong value");
                System.out.println("play the game again and see if you can get it next time");

            }
        }
    }

    /**
     * @param: int penalty1, int penalty2, Player1 p1, Player2 p2
     * using the number of penalty2 that was obtained from the updatePenalty2 method for player2, it can be determined which letter or letters are in HORSE for player2
     * once the letter or letters is/are decided, the play1 method will be called to start player1's turn
     * if player2 loses, then a question gets asked to the player which from there terminates the game
     * @return: none
     */public static void horse2(int penalty1, int penalty2, Player1 p1, Player2 p2)
    {
        if(penalty2 == 1)
        {
            System.out.println("" + p2.getPlayer() + " has H");
            play1( p1, p2, penalty1, penalty2);

        }
        else if(penalty2 == 2)
        {
            System.out.println("" + p2.getPlayer() + " has HO");
            play1(p1, p2, penalty1, penalty2);
        }
        else if(penalty2 == 3)
        {
            System.out.println("" + p2.getPlayer() + " has HOR");
            play1(p1, p2, penalty1, penalty2);
        }
        else if(penalty2 == 4)
        {
            System.out.println("" + p2.getPlayer() + " has HORS");
            play1(p1, p2, penalty1, penalty2);
        }
        if(penalty2 == 5)
        {
            System.out.println("" + p2.getPlayer() + " has HORSE");
            System.out.println("" + p2.getPlayer() + " you lose!");
            System.out.println("However, you deserve a cool question!");
            System.out.println("For every problem that involves finding the launch angle, it seems that it approaches a certain value.");
            Scanner conc = new Scanner(System.in);
            System.out.println("Which value does the launch angle approach for any random displacement and velocity (Round to 2 decimal places)");
            double approach = conc.nextDouble();
            if(approach == 1.57)
            {
                System.out.println("That is approximately pi/2 radians or 90 degrees, given there is an acceleration function bt^2 + ct - d where b,c, and d are constants!");
                System.out.println("Therefore, for every i, which represents the number of a random horizontal displacement and landing velocity where 1 <= i <= 21,");
                System.out.println("a random value for either the horizontal displacement x(i) or landing velocity vf(i) will be generated such that x(i+2) < random displacement value < x(50) and vf(i+2) < random landing velocity value < vf(50)");
                System.out.println("and the calculated launch angle for any random generated value on both intervals will approach pi/2 radians");
                System.out.println("This is an excellent illustration of how physics, calculus, and computer science work together to produce something awesome!");

            }
            else
            {
                System.out.println("wrong value");
                System.out.println("play the game again and see if you can get it next time");

            }

        }
    }
}


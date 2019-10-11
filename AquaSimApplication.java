import java.awt.Color;
import java.util.Random;

/** Aquarium Lab Series: <br>    
 *      The AquaSimApplication class contains the main function that will
 *      run the Aquarium Simulation. (This description should be updated
 *      when the behavior of the program changes.)<br>
 *
 * Modifications: <br>
 *   23 March 2008,  Alyce Brady,  Created skeleton main that constructs and
 *                                 displays an empty aquarium.<br>
 *   (date), (your name), Modified to .... <br>
 *
 *  @author  Alyce Brady  (should be Your Name)
 *  @version 23 March 2008  (should be today's date)
 *  @see AquariumController
 **/
public class AquaSimApplication
{
    /**
     *  This is the main function.  It executes the program.
     *  @param    String args[] is never used
     **/
    private static Random generator;
    
    public static void main(String args[])
    {
        System.out.println("Aquarium Simulation starts in: 5 Minutes");

        // CONSTRUCT OBJECTS NEEDED FOR THE AQUARIUM SIMULATION.
            generator = new Random();
           
        
        // Construct the aquarium.  Specify its dimensions when creating it.
        Aquarium aqua;                 // create reference to an Aquarium ...
        aqua = new Aquarium(700, 700); // ... object that has now been created
     
        
        
       
        // Construct fish and add them to the aquarium.
        
        AquaFish Bee = new AquaFish(aqua, getColor());
        aqua.add(Bee);
        
        AquaFish Joe = new AquaFish(aqua, getColor());
        aqua.add(Joe);
        
        AquaFish Tree = new AquaFish(aqua, getColor());
        aqua.add(Tree);
        
        AquaFish Aye = new AquaFish(aqua, getColor());
        aqua.add(Aye);
        
        AquaFish See = new AquaFish(aqua, getColor());
        aqua.add(See);
        
        AquaFish Deed = new AquaFish(aqua, getColor());
        aqua.add(Deed);
        
        
        
        
            // Add AquaFish to Aquarium
        // Construct a graphical user interface (GUI) to display and control
        // the simulation.  The user interface needs to know about the
        // aquarium, so we pass aqua to the user interface constructor.
        AquaSimGUI userInterface;              // create reference to GUI ...
        userInterface = new AquaSimGUI(aqua, true);  // ... and then GUI itself

        // Tell the user how to start the aquarium simulation.
        System.out.println("Press the Start button to start the simulation.");

        // Now wait for the user to press the start button.
        userInterface.waitForStart();

        // Draw the initial view of the aquarium and its contents.
        userInterface.showAquarium();


        // RUN THE AQUARIUM SIMULATION.

        // Make the fish move and redisplay.
        
        int b = userInterface.getNumberOfSteps();
        
        for(int i=0;i<b;i++){
        Bee.moveForward();
        
        if(Bee.atWall())
        {
            Bee.changeDir();
        }
            
        Joe.moveForward();
        if(Joe.atWall())
        {
            Joe.changeDir();
        }
            
        Tree.moveForward();
        if(Tree.atWall())
        {
            Tree.changeDir();
        }

        Aye.moveForward();
        if(Aye.atWall())
        {
            Aye.changeDir();
        }
            
        See.moveForward();
        if(See.atWall())
        {
            See.changeDir();
        }
            
        Deed.moveForward();
        if(Deed.atWall())
        {
            Deed.changeDir();
        }
        
        userInterface.showAquarium();}
        
        // WRAP UP.

        // Remind user how to quit application.
        userInterface.println ("Close GUI display window to quit.");

    }//end main

    public static Color getColor(){
        int randNum = generator.nextInt(6);
        if(randNum==0)
        {
            return Color.RED;
        }
        else if(randNum==1)
        {
            return Color.BLUE;
        }
        else if (randNum==2)
        {
            return Color.GREEN;
        }
        else if (randNum==3)
        {
            return Color.ORANGE;
        }
        else if (randNum==4)
        {
            return Color.YELLOW;
        }
        else
        {
            return Color.MAGENTA;
        }
        }    
}//end class

//import a scanner it will be used to gather user input
import java.util.Scanner;
//get the public class which is required in almost all java things and is the main entry point. 
public class main {
    //next we need to make the void mane str4ing its teh entry point of the program 
    public static void main(String[] args) {
        // display a title
        System.out.println("\n\n\t*** The Leviathan: A open water monster hunting simulator**\n");
        // siplay intro and description of this app
        displayIntro();
        ScenarioTheBigBlueLeviathan();
        displayEnd();



    }

        //we need to display teh intro or get the intro to be a thing. 
        public static void displayIntro(){

            System.out.println("you aboard a old wooden ship thats packed with cannons harpoons and spears that wrentch off the side that appear long enough to go feet into the water.");
            System.out.println("a raggedy sailor appraoches you \"Alright you sea loving scalewag\" the old sailor barks\" we are gonna be hunting a real big monster out here and youve been tasked as one of the heasds to the ship.\" he points towards the cannons\"those are the cannnons, they are there to soften up the monster, it can deflect some attacking monsters but dont rely on them\" the rugged sailor points to the spears\" those are our best defense, as long as the wooden sticks can survive teh force nothing will ever get past those\" lastly the silaor points to the gisnt harpoon stationsed in teh nmiddle of the ship\" and thats big bertha, when the monsters weak enough we fire that beauty into the stomach of a leviahtan and put it down" );

        }

        //get a scenario and print our the titel and deescription
        public static void ScenarioTheBigBlueLeviathan(){
        System.out.println("\n\t * The big blue leviathan *\n");
        System.out.println("after tailing a beast for hundereds of acres you make it out to the deep blue ocean");
        System.out.println("the leviathan you were hunting is a 900 foot long behemoth that is known for disguising itself amongst the waves it creates");
        System.out.println("youve tacked it back to its home territory, the waves are large and the ship rocks back and forth");
            //give the user some choices
            System.out.println("#1) wait for the leviathan to show itself (risk it might be to late when it does)");
            System.out.println("#2) Go up to the crows nest and attempt to search for the leviathan (risk: it is a blue leviathan that uses the water to hide so it might be difficult)");
            System.out.println("#3) statrt firing the cannons to force the leviathan to show itself (risk: you could waste ammo and draw more attention to youreself than necasary.)");
            System.out.print("\n please make youre choice: \n");
            //create scanner to get the users input
            Scanner scanner = new Scanner(System.in);
            //get the users input
            int choice = scanner.nextInt();
            //evaluate the users chouce and display the result
            if(choice == 1){
                System.out.println("\n after a couple of minutes you feel uneasy as something bumps the boat, as you look over th eship you see a large blue shadow moving just under youre boat, THE BEAST HAS BEEN SPOTTED\n");
                ScenarioUnderBoat();
            } else if(choice == 2){
                System.out.println("\n you climb up to the crows nest and look around, off in the distance i giant wave is forming and withing that wave you can see the levithans face staring directly at youre ship, THE BEAST HAS BEEN SPOTTED\n");
                ScenarioSpottedInTheDistance();
            } else if(choice == 3){
                System.out.println("\n you fire into the water with youre cannonas and need to reload, while you are reloading youre boat gets uprooted from the water in the jaws of a massive blue levithan with a white underbelly that crunches down into youre boat, you died");
                displayBadEnd();
            }
            else{
                System.out.println("you failed at commanding youre ship and got eaten. youre dead");
                displayBadEnd();
            }


          

        }//repeat the steps to make another scenario
        public static void ScenarioUnderBoat(){
            System.out.println("The leviathan is dangerously close to youre boat what would you like to do");
            System.out.println("#1) fire youre cannons(risk: you mnight need to reload and the cannnons dont penetrate water well)");
            System.out.println("#2) stab with the spears (risk: the levithan could break the spears)");
            System.out.println("#3) fire the harpoon (risk: the creature likley isnt weak enough for it to kill the monster)");
            System.out.print("make youre choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice == 1){
                System.out.println("\n you fire the cannnons and multiple cannon balls strike the monster sending it away. the dorcel fin turns back twoards you and pokes out the water, CLEAN HIT\n");
                ScenarioUnderCleanHit();
            }
            else if(choice == 2){
                System.out.println("\nYou stab the leviathan with multiple spears wounding it and making it bleed, it swims away gathering a large wave to come twoards you with it inside the wave, CRITICAL HIT\n");
                ScenarioUnderCrit();
            }
            else if(choice == 3){
                System.out.println("\n you fire the harpoon and it digs into the monsters back but dosent go in far enough, you have no way of truly ending this beasts life any more.");
                displayBadEnd();
            }
            else{
                System.out.println("you failed at commanding youre ship and got eaten. youre dead");
                displayBadEnd();
            }
        }  //repeat the steps for a scenario
        public static void ScenarioSpottedInTheDistance(){
            System.out.println("The leviathan was spotted in a wave far out");
            System.out.println("#1) fire youre cannons (risk: the cannons dont penetrate water very well)");
            System.out.println("#2) Wait for it to apporach and stab it with teh spears (risk: teh leviathan might break teh spears) ");
            System.out.println("#3) fire the harpoon(risk: the creature might not be weak enough)");
            System.out.print("make youre choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice == 1){
                System.out.println("\n you fire the cannons and the monster takes multiple hits and goes under teh water bleeding, CRITICAL HIT\n");
                ScenarioBleedingUnderWater();
            }
            else if(choice == 2){
                System.out.println("\nyou attempt to stab the leviahtan but it built up enough speed to ram through the spears and youre boat\n");
                displayBadEnd();
            }
            else if(choice == 3){
                System.out.println("\n you fire the harpoon and it digs into the underbelly of the monster as it stops moving and the wave crashes down, the water calms as it floats up to the surface. ");
                
            }
            else{
                System.out.println("you failed at commanding youre ship and got eaten. youre dead");
                displayBadEnd();
        }
    }

    //make another scenario got three more to go 
        public static void ScenarioUnderCrit(){
            System.ou.println("the levithan is coming twoards you in a wave far out");
            System.out.println("#1) fire youre cannons (risk: the cannons dont penetrate water very well)");
            System.out.println("#2) Wait for it to apporach and stab it with teh spears (risk: teh leviathan might break teh spears) ");
            System.out.println("#3) fire the harpoon(The rugged sialor looks eager to fire)");
            System.out.print("make youre choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice == 1){
                System.out.println("\n you fire the cannons and the monster takes multiple hits and goes under teh water bleeding, CRITICAL HIT\n");
                ScenarioBleedingUnderWater();
            }
            else if(choice == 2){
                System.out.println("\nyou attempt to stab the leviahtan but it built up enough speed to ram through the spears and youre boat\n");
                displayBadEnd();
            }
            else if(choice == 3){
                System.out.println("\n you fire the harpoon and it digs into the underbelly of the monster as it stops moving and the wave crashes down, the water calms as it floats up to the surface. ");
                
            }
            else{
                System.out.println("you failed at commanding youre ship and got eaten. youre dead");
                displayBadEnd();
        }

        }
        //make another scenario got three more to go 
        public static void ScenarioUnderCleanHit(){
            System.out.println("the levithan is heading twoards you creating a wave to ride ");
            System.out.println("#1) fire youre cannons (risk: the cannons dont penetrate water very well and they need reloading)");
            System.out.println("#2) Wait for it to apporach and stab it with teh spears (risk: teh leviathan might break teh spears) ");
            System.out.println("#3) fire the harpoon(The rugged sialor looks eager to fire)");
            System.out.print("make youre choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice == 1){
                System.out.println("\n you reload and fire the cannons and the monster takes multiple hits and goes under teh water bleeding, CRITICAL HIT\n");
                ScenarioBleedingUnderWater();
            }
            else if(choice == 2){
                System.out.println("\nyou attempt to stab the leviahtan but it built up enough speed to ram through the spears and youre boat\n");
                displayBadEnd();
            }
            else if(choice == 3){
                System.out.println("\nyou fire the harpoon and it digs into the monsters back but dosent go in far enough, you have no way of truly ending this beasts life any more.\n  ");
                displayBadEnd();
            }
            else{
                System.out.println("you failed at commanding youre ship and got eaten. youre dead");
                displayBadEnd();
        }



        }
        public static void ScenarioBleedingUnderWater(){
            System.out.println("#1) reload and fire the cannons");
            System.out.println("#2 attempt to stab it while it goes under youre boat");
            System.out.println("#3) its weak shoot the harpoon");
            System.out.print(" make youre choice");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice == 1){
                System.out.println("\n you reload and fire the cannons but its too late and the leviathan raises form the water with youre boat in its mouth \n");
                displayBadEnd();
            }
            else if(choice == 2){
                System.out.println("\nyou attempt to stab the leviahtan but teh spears dig in and youre boat flips. you come face to face with the monster, blue deep eyes stare at you with teeth bigger than you, wide narrow face with spikes running down its hide, you get the perfect angle to see this camoflaguged beast as it eats you \n");
                displayBadEnd();
            }
            else if(choice == 3){
                System.out.println("\nyou fire the harpoon down twoards the water and it digs in and through the beasts back shoving below youre ship calming the ocean as its body is right next to the boat, you see the white underbelly of the beast smooth and its hide rough and spikey, its tail looks powerful. \n  ");
                
            }
            else{
                System.out.println("you failed at commanding youre ship and got eaten. youre dead");
                displayBadEnd();
        }


        }




        public static void displayEnd(){
            //display ending
            System.out.println("\n\n\t *** yarghhh we did it lads. the laeviathan has been felled *** ");


        }
        public static void displayBadEnd(){
            System.out.println("\n\n\t ** you died**");
            System.exit(0);
        }

}
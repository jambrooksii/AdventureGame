package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean again = false;

        do {
            Scanner Advent = new Scanner(System.in);
            System.out.println("Welcome to Zombieland, Would you like to play");
            String userName = Advent.nextLine();


            if (userName.toLowerCase().equals("yes")) {
                System.out.println("Welcome to the most realistic Zombie game ever created, Start by picking a player" +
                        " Potter, Rocko, Betty White, Prince");
                userName = Advent.nextLine();
            } else
                System.out.println("Your Lame");
            if (userName.toLowerCase().equals("potter")) {
                System.out.println("great Choice, Potter has special wizard abilities to fight off zombies");
            } else if (userName.toLowerCase().equals("rocko")) {
                System.out.println("Not such a great choice Rocko is pretty weak and slow but Good Luck!!!");
            } else if (userName.toLowerCase().equals("betty white")) {
                System.out.println("Betty White is old but strong as hell and super fast and smart.  Great Choice!!!");
            } else if (userName.toLowerCase().equals("prince")) {
                System.out.println("Ahh you chose Prince, he has some knarly dance moves Good Luck!");
            } else
                System.out.println("Not one of the 4 names please try again");

            System.out.println("You wake up in the moring to the sound of 100 zombies attempted to break into you house" +
                    " What do you do first, [Find Weapon], [Use Bathroom], [Head to car]" +
                    ", [go back to sleep]");
            //Use Bathroom end game
            String userName1 = Advent.nextLine();
            if (userName1.toLowerCase().equals("use bathroom")) {
                System.out.println("Why would u use the bathroom in a time like this...... Zombies break through the bathroom window and You die!" + " Thanks for playing");
            }
            //Head to Car
            if (userName1.toLowerCase().equals("head to car")) {
                System.out.println("You grabed your keys, make it to the car and start driving.  Where are you headed [Home Depot]," +
                        " [supermarket], [bar], [out of town]");
                userName1 = Advent.nextLine();
                if (userName1.toLowerCase().equals("supermarket")) {
                    System.out.println("good choice, you stock up on food and water and head out, Where are you going [get gas]," +
                            " [woods], [ocean], [bar]");
                    userName1 = Advent.nextLine();
                    if (userName1.toLowerCase().equals("woods")) {
                        System.out.println("Woods are full of Zombies and they eat your brain.  You Die");
                    } else if (userName1.toLowerCase().equals("get gas")) {
                        System.out.println("The gas station is out of gas and you approached by some criminals and they steal all your supplies!! You Lose!");
                    } else if (userName1.toLowerCase().equals("ocean")) {
                        System.out.println("YOu head to the ocean and find your self a nice big boat and sail away into the sunset");
                    }
                }
            }
            if (userName1.toLowerCase().equals("find weapon")) {
                System.out.println("You search all around the house and find [axe], [sword], [wand], [gun]");
                userName1 = Advent.nextLine();
                if (userName1.toLowerCase().equals("wand") && userName.toLowerCase().equals("potter")) {
                    System.out.println("Good Choice Mr. Potter, You kill all the zombies with one flick of the wrist. YOU WIN!!!");
                } else if (userName1.toLowerCase().equals("wand") && !userName.toLowerCase().equals("potter")) {
                    System.out.println("Why would you chose a wand your not a wizard!! YOU LOSE!!!");
                }
            }
            if (userName1.toLowerCase().equals("gun")) {
                System.out.println("Your have no ammo, and the zombies break in, You put up a good fight, Buuuuut, You Die!!");
            }
            if (userName1.toLowerCase().equals("sword") && userName.toLowerCase().equals("betty white")) {
                System.out.println("little did you know Betty white is cold wit a sword, she fights her way throw hundred of zombies and escapes! You Win!");
            } else if (userName1.toLowerCase().equals("sword") && !userName.toLowerCase().equals("betty white")) {
                System.out.println("You no Betty White with a sword, You put up a good fight but lose in the end. You LOSE!!");
            }
            if (userName1.toLowerCase().equals("axe")) {
                System.out.println("You fight your way out the house with the axe, where to next [bar], [woods], [ocean]");
                userName1 = Advent.nextLine();
            }
            if (userName1.toLowerCase().equals("woods")) {
                System.out.println("Woods are full of Zombies and they eat your brain.  You Die");
            }
            if (userName1.toLowerCase().equals("ocean")) {
                System.out.println("YOu head to the ocean and find your self a nice big boat and sail away into the sunset");
            }
            if (userName1.toLowerCase().equals("go back to sleep") && userName.toLowerCase().equals("rocko")) {
                System.out.println("You go back to sleep, wake up and everythinhg is over.  YOu WIN");
            } else if (userName1.toLowerCase().equals("go back to sleep") && !userName.toLowerCase().equals("rocko")) {
                System.out.println("You Never Wake up");
            }
            //Home Deopt end game
            if (userName1.toLowerCase().equals("home depot")) {
                System.out.println("You stock up on weapons and material and head back to the car, but zombies get you as you are loading the car.  You Die!");
            } else if (userName1.toLowerCase().equals("bar")) {
                System.out.println("There are no Zombies at the bar and you have your self a few drinks, then you stumble out the bar.  Where are you headed now? [back home], [Go for a Stroll], [stay], [woods] ");
            }
            userName1 = Advent.nextLine();
            if (userName1.toLowerCase().equals("back home")) {
                System.out.println("You make it home and the zombies are gone, so you grab a beer plop on the couch and watch Teen mom.  YOU WIN!!!!");
            } else if (userName1.toLowerCase().equals("go for a stroll")) {
                System.out.println("Your Strolling down the street and your pick up by a group a very nice folk! You Win");
            } else if (userName1.toLowerCase().equals("stay")) {
                System.out.println("You stay at the bar and get wasted, you pass out and wake up dead because you were eaten by Zombies");
            }
            System.out.println("Do you want to play again Yes or No");
            String playAgain = Advent.nextLine();
            if (playAgain.toLowerCase().equals("yes")) {
                again = true;
            } else if (playAgain.toLowerCase().equals("no")) {
                System.out.println("CHICKEN!!!!");
            }

        } while (again == true);

    }
}


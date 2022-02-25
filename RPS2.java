package com.example.ICS3U;

import java.util.Random;
import java.util.Scanner;

public class RPS2 {
    public static String[] options = {"rock", "paper", "scissors"}; //array of options for the user to choose from

    public static void ascii(String ascii) {
        /*
        ASCII art from
        https://gist.github.com/wynand1004/b5c521ea8392e9c6bfe101b025c39abe
        */
        if (ascii.equals("rock")) {
            System.out.println("""
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
""");
        }
        else if (ascii.equals("paper")) {
            System.out.println("""
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)
""");
        }
        else{
            System.out.println("""
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
""");
        }
    }

    public static void rounds(int rounds) { //Method to play the game

    //Declare variables
    int playerScore = 0;
    int computerScore = 0;
        if(rounds == 3) { //If the number of rounds is 3 [Option 1]

            for (int i = 0; i < rounds; i++) { //Loop to play the game
                System.out.println("\n\n"); //Print out the round number
                System.out.println("1. rock\n2. paper\n3. scissors\n"); //Print out the options
                System.out.println("\nEnter the name of your choice! ");
                System.out.println("\n\n");
                Scanner input = new Scanner(System.in); //Declare scanner
                System.out.println("Enter your choice: ");
                Random rand = new Random(); //Declare random number generator
                int computerChoice = rand.nextInt(options.length); //Declare random number generator
                String userChoice = input.nextLine();//Declare user input
                System.out.println("\n\n");

                if (userChoice.equals(options[0])) { //If user chooses rock
                    System.out.println("You:");
                    ascii(options[0]);
                    System.out.println("Computer: ");
                    if (computerChoice == 0) { //If computer chooses rock
                        ascii(options[0]); //Print out the ascii art
                        System.out.println("You: rock    |   Computer: rock");
                        System.out.println("It's a tie!");
                        i--; //Decrement i, rerun the round
                    }
                    else if (computerChoice == 1) { //If computer chooses paper
                        ascii(options[1]); //Print out the ascii art
                        System.out.println("You: rock    |    Computer: paper");
                        System.out.println("You lose!");
                        computerScore++; //Increment computer score
                    }
                    else { //If computer chooses scissors
                        ascii(options[2]); //Print out the ascii art
                        System.out.println("You: rock    |    Computer: scissors");
                        System.out.println("You win!");
                        playerScore++; //Increment player score
                    }
                }
                else if (userChoice.equals(options[1])) { //If user chooses paper
                    System.out.println("You:");
                    ascii(options[1]); //Print out the ascii art
                    System.out.println("Computer: ");
                    if (computerChoice == 0) { //If computer chooses rock
                        ascii(options[0]); //Print out the ascii art
                        System.out.println("You: paper    |    Computer: rock");
                        System.out.println("You win!");
                        playerScore++; //Increment player score
                    }
                    else if (computerChoice == 1) { //If computer chooses paper
                        ascii(options[1]); //Print out the ascii art
                        System.out.println("You: paper    |    Computer: paper");
                        System.out.println("It's a tie!");
                        i--; //Decrement i, rerun the round
                    }
                    else { //If computer chooses scissors
                        ascii(options[2]); //Print out the ascii art
                        System.out.println("You: paper    |    Computer: scissors");
                        System.out.println("You lose!");
                        computerScore++;
                    }
                }
                else if (userChoice.equals(options[2])) { //If user chooses scissors
                    System.out.println("You:");
                    ascii(options[2]); //Print out the ascii art
                    System.out.println("Computer: ");
                    if (computerChoice == 0) {//If computer chooses rock
                        ascii(options[0]); //Print out the ascii art
                        System.out.println("You: scissors    |    Computer: rock");
                        System.out.println("You lose!");
                        computerScore++;
                    }
                    else if (computerChoice == 1) { //If computer chooses paper
                        ascii(options[1]); //Print out the ascii art
                        System.out.println("You: scissors    |    Computer: paper");
                        System.out.println("You win!");
                        playerScore++;
                    }
                    else { //If computer chooses scissors
                        ascii(options[2]); //Print out the ascii art
                        System.out.println("You: scissors    |    Computer: scissors");
                        System.out.println("It's a tie!");
                        i--; //Decrement i, rerun the round
                    }
                }
                else { //If user enters an invalid option
                    System.out.println("Invalid option!");
                    i--; //Decrement i, rerun the round
                }
            }
        }
        else if (rounds == 5) {// If user chooses 5 rounds, [option 2]
            //USER ALWAYS WINS

            for (int i = 0; i < rounds; i++) { //Run the game 5 times
                System.out.println("\n\n"); //Print a new line
                System.out.println("1. rock\n2. paper\n3. scissors\n"); //Print out the options
                System.out.println("\n\nEnter the name of your choice! ");
                System.out.println("\n\n");
                Scanner input = new Scanner(System.in); //Create scanner
                System.out.println("Enter your choice: ");
                String userChoice = input.nextLine(); //Get user choice
                if (userChoice.equals(options[0])) { //If user chooses rock
                    System.out.println("You: ");
                    ascii(options[0]); //Print out the ascii art
                    System.out.println("Computer: ");
                    ascii(options[2]); //Print out the ascii art
                    System.out.println("You: rock   |    Computer: Scissors");
                    System.out.println("You win!");
                    playerScore++; //Increment player score
                    }
                else if (userChoice.equals(options[1])) { //If user chooses paper
                    System.out.println("You: ");
                    ascii(options[1]); //Print out the ascii art
                    System.out.println("Computer: ");
                    ascii(options[0]); //Print out the ascii art
                    System.out.println("You: paper   |    Computer: rock");
                    System.out.println("You win!");
                    playerScore++; //Increment player score
                }
                else if (userChoice.equals(options[2])) { //If user chooses scissors
                    System.out.println("You: ");
                    ascii(options[2]); //Print out the ascii art
                    System.out.println("Computer: ");
                    ascii(options[1]); //Print out the ascii art
                    System.out.println("You: scissors   |    Computer: paper");
                    System.out.println("You win!");
                    playerScore++; //Increment player score
                }
                else { //If user enters an invalid option
                    System.out.println("Invalid option!");
                    i--; //Decrement i, rerun the round
                }
            }
        }
        else if (rounds == 7) { //If user chooses 7 rounds, [option 3]
            //USER ALWAYS LOSES
            for (int i = 0; i < rounds; i++) { //Run the game 7 times
                System.out.println("1. rock\n2. paper\n3. scissors\n"); //Print out the options
                System.out.println("Enter the name of your choice! ");
                System.out.println("\n\n");
                Scanner input = new Scanner(System.in); //Create scanner
                System.out.println("Enter your choice: ");
                String userChoice = input.nextLine(); //Get user choice
                System.out.println("\n\n");
                if (userChoice.equals(options[0])) { //If user chooses rock
                    System.out.println("You: ");
                    ascii(options[0]); //Print out the ascii art
                    System.out.println("Computer: ");
                    ascii(options[2]); //Print out the ascii art
                    System.out.println("You: rock   |    Computer: paper");
                    System.out.println("You lose!");
                    computerScore++; //Add 1 to computer score
                }
                else if (userChoice.equals(options[1])) { //If user chooses paper
                    System.out.println("You: ");
                    ascii(options[1]); //Print out the ascii art
                    System.out.println("Computer: ");
                    ascii(options[0]); //Print out the ascii art
                    System.out.println("You: paper   |    Computer: scissors");
                    System.out.println("You lose!");
                    computerScore++; //Add 1 to computer score
                }
                else if (userChoice.equals(options[2])) { //If user chooses scissors
                    System.out.println("You: ");
                    ascii(options[2]); //Print out the ascii art
                    System.out.println("Computer: ");
                    ascii(options[1]); //Print out the ascii art
                    System.out.println("You: scissors   |    Computer: rock");
                    System.out.println("You lose!");
                    computerScore++; //Add 1 to computer score
                }
                else { //If user enters an invalid option
                    System.out.println("Invalid option!");
                    i--; //Decrement i, rerun the round
                }
            }
        }

        System.out.println("\n\n");
        System.out.println("----------------- Final Score -----------------");
        //Print final score
        System.out.println("You: " + playerScore + "    |    Computer: " + computerScore);
        if(playerScore > computerScore){ //If player score is greater than computer score
            System.out.println("You win!");
            System.exit(0); //Exit the game
        }
        else if(playerScore < computerScore){ //If player score is less than computer score
            System.out.println("You lose!");
        }
        else{ //If player score is equal to computer score
            System.out.println("It's a tie!");
        }
    }

    public static void main(String[] args) { //Main method
        //Declare variables and initialize scanner
        Scanner scanner = new Scanner(System.in);
        int rounds;

        System.out.println("\n\nWelcome to Rock, Paper, Scissors!\n\n"); //Welcome message

        System.out.println("*************** RULES ***************\n"); //Print out the rules
        System.out.println("1. Rock beats scissors\n2. Scissors beats paper\n3. Paper beats rock\n\n");
        System.out.println("Same choices will be a tie and the round will rerun\n\n");
        System.out.println("**************************************\n\n");

        //Prompt user for number of rounds
        System.out.println("\n\nHow many rounds would you like to play?");
        rounds = scanner.nextInt(); //Get number of rounds
        if(rounds == 3 || rounds == 5 || rounds == 7) { //If user chooses 3, 5, or 7 rounds
            //Call the playGame method
            rounds(rounds);

            System.out.println("\n\n");
            System.out.println("Would you like to play again? (y/n)"); //Prompt user for input
            String playAgain = scanner.next(); //Get user input
            if(playAgain.equals("y") || playAgain.equals("Y") || playAgain.equals("yes") || playAgain.equals("Yes")) {
                //If user chooses to play again
                main(args); //Call the main method
            }
            else { //If user chooses to quit
                System.out.println("\n");
                System.out.println("Thanks for playing!"); //Print out thanks message
                System.exit(0); //Exit the game
            }
        }
        else { //If user does not choose 3, 5, or 7 rounds
            System.out.println("Invalid number of rounds. Please try again.");
            main(args); //Recursively call the main method. Rerun the game
        }
    }
}
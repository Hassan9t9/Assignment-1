package question_2;

import question_1.BenefitModel;
import question_1.EmployeeModel;
import question_1.SoftwareManagementRoom;

import java.util.Scanner;

public class UIHandler {
    private Birds birds;
    private Dogs dogs;
    private Rabbits rabbits;
    Scanner sc = new Scanner(System.in);

    public UIHandler(){
        this.birds = new Birds();
        this.dogs = new Dogs();
        this.rabbits = new Rabbits();
    }

    public void showMainMenu(){
        System.out.println("\n\nSELECT THE FOLLOWING INSTRUCTIONS:-");
        System.out.println("1- Get All Mutual Characteristics");
        System.out.println("2- Get Birds Characteristics");
        System.out.println("3- Get Dogs Characteristics");
        System.out.println("4- Get Rabbits Characteristics");
        mainMenuHandler();
    }

    public void mainMenuHandler(){
        System.out.print("\nSelect Instruction: ");
        String instruction= sc.next();

        switch (instruction){
            case "1":
                getMutualCharacteristics();
                break;
            case "2":
                getBirdsCharacteristics();
                break;
            case "3":
                getDogsCharacteristics();
                break;
            case "4":
                getRabbitsCharacteristics();
                break;
            default:
                System.out.print("You Select Invalid Instruction\n");
                mainMenuHandler();
        }
    }

    void getMutualCharacteristics(){
        System.out.print("\nMutual Characteristics: ");
        birds.breathe();
        dogs.eatFood();
        rabbits.pet();
        backMenu();
    }

    void getBirdsCharacteristics(){
        System.out.print("\nBirds Characteristics: ");
        birds.makeNest();
        birds.walk();
        birds.singSong();
        birds.fly();
        birds.breathe();
        birds.eatFood();
        birds.pet();
        backMenu();
    }

    void getDogsCharacteristics(){
        System.out.print("\nDogs Characteristics: ");
        dogs.bark();
        dogs.walk();
        dogs.playDead();
        dogs.run();
        dogs.breathe();
        dogs.eatFood();
        dogs.pet();
        backMenu();
    }

    void getRabbitsCharacteristics(){
        System.out.print("\nRabbits Characteristics: ");
        rabbits.hop();
        rabbits.burrow();
        rabbits.breathe();
        rabbits.eatFood();
        rabbits.pet();
        backMenu();
    }

    public void backMenu(){
        System.out.print("\n\nPress any key to menu: ");
        String x = sc.next();
        showMainMenu();
    }
}

package Game;

import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;

public class odd_or_even {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Odd ou Even");
        Thread.sleep (600);
        System.out.println("Player vs Machine");
        Thread.sleep (1000);
        System.out.println(".");
        Thread.sleep (600);
        System.out.println(".");
        Thread.sleep (600);
        System.out.println(".");
        Thread.sleep (600);
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Choice:");
        System.out.println("0. Odd");
        System.out.println("1. Even");
        int HumanChoice = keyboard.nextInt();
        int MachineChoice = 0;
        if(HumanChoice == 0){
            MachineChoice = 1;
        }
        Thread.sleep (600);
        System.out.println("Now choose any number from 0 to 100");
        int HumanValue = keyboard.nextInt();
        while(HumanValue > 100){
            System.out.println("Your choice exceeded the allowed limit");
            System.out.println("Try Againmente");
            HumanValue = keyboard.nextInt();

        }
        int valueMachine = random.nextInt(100);
        int sumvalue = valueMachine + HumanValue;
        int resultado = 1;
        if((sumvalue % 2) != 0){
            resultado = 0;
        }
        String Odd_Even = "Odd";
        if(resultado == 1){
            Odd_Even = "Even";
        }
        Thread.sleep (600);
        System.out.println("The Machine chose "+valueMachine+ " and the sum between the two is "+sumvalue);
        Thread.sleep (600);
        if(valueMachine == resultado){
            System.out.println("You Loser");
        }
        else{
            System.out.println("You Won");
        }
    }
}

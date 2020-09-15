package Game;

import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;

public class Jokenpo {
    public static void main(String[] args) throws InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int x = 0;
        System.out.println("Rock - Paper - sissors");
        Thread.sleep(600);
        System.out.println("Player vs Machine");
        Thread.sleep(600);
        System.out.println(".");
        Thread.sleep(600);
        System.out.println(".");
        Thread.sleep(600);
        System.out.println(".");
        Thread.sleep(600);
        while (x == 0) {
            System.out.println("Choice: ");
            Thread.sleep(300);
            System.out.println("1. Rock");
            Thread.sleep(300);
            System.out.println("2. Paper");
            Thread.sleep(300);
            System.out.println("3. Sissors");
            int humanChoice = keyboard.nextInt();
            int Machinechoice = random.nextInt(3) + 1;
            String resultado = humanChoice + "#" + Machinechoice;
            while (humanChoice == 0 || humanChoice > 3) {
                System.out.println("Invalid Number - Try again: ");
                humanChoice = keyboard.nextInt();
            }
            Thread.sleep(600);
            switch (Machinechoice) {
                case 1:
                    System.out.println("The Machine Chose Rock");
                    break;
                case 2:
                    System.out.println("The Machine Chose Paper");
                    break;
                case 3:
                    System.out.println("The Machine Chose Sissors");
                    break;
            }
            Thread.sleep(600);
            System.out.println(".");
            Thread.sleep(600);
            System.out.println(".");
            Thread.sleep(600);
            switch (resultado) {
                case "1#1":
                    System.out.println("A tie");
                    break;
                case "1#2":
                    System.out.println("You loser");
                    break;
                case "1#3":
                    System.out.println("You Won");
                    break;
                case "2#1":
                    System.out.println("You Won");
                    break;
                case "2#2":
                    System.out.println("A tie");
                    break;
                case "2#3":
                    System.out.println("You loser");
                    break;
                case "3#1":
                    System.out.println("You loser");
                    break;
                case "3#2":
                    System.out.println("You Won");
                    break;
                case "3#3":
                    System.out.println("A tie");
                    break;


            }
            Thread.sleep(600);
            System.out.println("Type it: ");
            Thread.sleep(300);
            System.out.println("1. Leave");
            Thread.sleep(300);
            System.out.println("0. Play again");
            x = keyboard.nextInt();
        }
    }
}

package Game;

import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;

public class Par_Impar {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Impar ou Par");
        Thread.sleep (600);
        System.out.println("Player vs Máquina");
        Thread.sleep (1000);
        System.out.println(".");
        Thread.sleep (600);
        System.out.println(".");
        Thread.sleep (600);
        System.out.println(".");
        Thread.sleep (600);
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Escolha:");
        System.out.println("0. Impar");
        System.out.println("1. Par");
        int escolhaHumano = teclado.nextInt();
        int escolhaMaquina = 0;
        if(escolhaHumano == 0){
            escolhaMaquina = 1;
        }
        Thread.sleep (600);
        System.out.println("Agora escolha um número qualquer de 0 a 100");
        int valorHumano = teclado.nextInt();
        while(valorHumano > 100){
            System.out.println("Sua escolha excedeu o limite permitido");
            System.out.println("Tente novamente");
            valorHumano = teclado.nextInt();

        }
        int valorMaquina = random.nextInt(100);
        int valordasoma = valorHumano + valorMaquina;
        int resultado = 1;
        if((valordasoma % 2) != 0){
            resultado = 0;
        }
        String impar_par = "impar";
        if(resultado == 1){
            impar_par = "par";
        }
        Thread.sleep (600);
        System.out.println("A Máquina escolheu "+valorMaquina+ " e a soma entre os dois é "+valordasoma);
        Thread.sleep (600);
        if(valorMaquina == resultado){
            System.out.println("Você perdeu");
        }
        else{
            System.out.println("Você ganhou");
        }
    }
}

package Exercicio;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	

        Scanner leia = new Scanner(System.in);

        int contador,num,par = 0,impar = 0;

        for(contador = 0;contador < 10; contador++) {
            System.out.println("Digite um número: ");
            num = leia.nextInt();

            if(num % 2 == 0) {
                par++;         }
            else {
                impar++;
            }

    }
        System.out.println("A quantidade de números pares é: " + par);
        System.out.println("A quantidade de números impares é: " + impar);

    }


	}



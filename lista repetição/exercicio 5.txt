package Exercicio;

import java.util.Scanner;

public class exercico5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);

	        int numero, resultado = 0;

	        do{
	            System.out.println("Digite um número: ");
	            numero = entrada.nextInt();
	            resultado += numero;
	        }while(numero != 0);

	        System.out.println("A soma dos números digitados é: " + resultado);

	        entrada.close();

	    }

	
	}



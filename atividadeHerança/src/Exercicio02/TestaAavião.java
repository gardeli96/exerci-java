package Exercicio02;

public class TestaAavião {

	public static void main(String[] args) {
		 Avião objetoAviao = new Avião();

	        objetoAviao.marca = "Boeing";
	        objetoAviao.modelo = "772";
	        objetoAviao.ano = 2016;
	        objetoAviao.velocidade = 0;

	        objetoAviao.imprimir();
	        objetoAviao.decolar(500);
	        System.out.println("A velocidade é: "+objetoAviao.velocidade);




	    }

	}



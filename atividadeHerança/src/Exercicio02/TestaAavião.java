package Exercicio02;

public class TestaAavi�o {

	public static void main(String[] args) {
		 Avi�o objetoAviao = new Avi�o();

	        objetoAviao.marca = "Boeing";
	        objetoAviao.modelo = "772";
	        objetoAviao.ano = 2016;
	        objetoAviao.velocidade = 0;

	        objetoAviao.imprimir();
	        objetoAviao.decolar(500);
	        System.out.println("A velocidade �: "+objetoAviao.velocidade);




	    }

	}



package exercicioMetodos;

import java.util.Scanner;

public class atividade01 {
	String nome;
	String endereço;
	String cidade;
	String cpf;
	int idade;
	
	void imprimirInfo() {
		System.out.println("Cliente : " + nome);
		System.out.println("Endereço cliente : " + endereço);
		System.out.println("Nome Cidade : " + cidade);
		System.out.println("Seu CPF : " + cpf);
		System.out.println("Sua Idade : " + idade);
		
	}
	void alterandoNome(){
		Scanner leia = new Scanner(System.in);
		System.out.printf("alterando o nome : " );
		nome=leia.next();
	}
		
	}

package exercicioMetodos;

public class TesteAtividade01 {
     
		public static void main(String[] args) {
			atividade01 cliente = new atividade01(); 
			cliente.nome = "Daniel " ;
			cliente.endereço = "Guaianases";
			cliente.cidade = "São Paulo";
			cliente.cpf = "12345678910";
			cliente.idade = 25;
			
			cliente.imprimirInfo();
			cliente.alterandoNome();
			cliente.imprimirInfo();
			
			
			
		}
	
}

	



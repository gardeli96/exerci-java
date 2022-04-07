package Exercicio02;

public class Avião {
	String marca;
    String modelo;
    int ano;
    int velocidade;

    void imprimir() {
        System.out.println("Modelo: "+modelo);
        System.out.println("Avião: "+marca);
        System.out.println("Ano: "+ano);
    }

    void decolar(int aceleracao) {
        velocidade+=aceleracao;
    }
    void diminuirVel(int reduzir) {
        velocidade = velocidade-reduzir;
    }
}

package application;

import java.util.Scanner;

public class AfVetoresAlunos {

	 public static void main(String [] args) {

	        Scanner ler = new Scanner(System.in);

	        int Soma = 0; //começar com 0 
	        int Q[] = {35,4,22,20,36,30}; //informaçoes dentro de cada vetor
	        int n= Q.length; //tamanho do meu vetor

	        for (int C=0;C<n;C++) {  //a cada volta no for adiciona mais 1 C++ até chegar no fim do vetor

	            Soma=Soma+Q[C];
	        }

	        System.out.println("A média de alunos por sala é de: "+(int)(Soma/n)+".\n\n");  //displayar media de alunos por sala.


	        if(Q[0] >= 24) {
	            System.out.printf("A Sala 1 está acima da media com "+Q[0]+" alunos.\n\n");   //daqui pra baixo vai displayar se for true
	        }
	        if(Q[1] >= 24){
	            System.out.printf("A Sala 2 está acima da media com "+Q[1]+" alunos.\n\n");
	        }
	        if(Q[2] >= 24){
	            System.out.printf("A Sala 3 está acima da media com "+Q[2]+" alunos.\n\n");
	        }
	        if(Q[3] >= 24){
	            System.out.printf("A Sala 4 está acima da media com "+Q[3]+" alunos.\n\n");
	        }
	        if(Q[4] >= 24){
	            System.out.printf("A Sala 5 está acima da media com "+Q[4]+" alunos.\n\n");
	        }
	        if(Q[5] >= 24){
	            System.out.printf("A Sala 6 está acima da media com "+Q[5]+" alunos.\n\n");
	        }


	    }
}

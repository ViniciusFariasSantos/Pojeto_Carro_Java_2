package com.br.Carro.GFT;

import java.util.*;



public class Carro {
Scanner sr = new Scanner(System.in); 

	

	

	

	String cor ="Azul";

	String marca;

	String modelo;

	String placa;

	float km;

	boolean isLigado;

	int litrosCombustiveis = 100;

	int Velocidade = 20;

	double pre�o;





	

	// M�todos declarados 

	

	void ligar() {

		isLigado = true;

		System.out.println("O Carro esta ligado e andando a  " +  Velocidade +" km/h");

	}



	

	

	

	void acelerar(int quantidade ) {

		

		if(isLigado  == true) {

		Velocidade = Velocidade + quantidade;

		litrosCombustiveis = litrosCombustiveis -1;

		System.out.println("voc� acelerou, seu veiculos est�  a  " + Velocidade + "km/h");

 }else{

	 System.out.println("O carro est� Desligado voc� n�o pode acelerar.");

 				

 					

 				}

		}



	

	

	void frear (int quantidade ) {	

		

            if ( isLigado == true  && Velocidade != 0)

            {

                Velocidade -= quantidade;



            System.out.println("Voc� freou, seu veiculo est� a  " + Velocidade + " km/h ");

            }

            else

            {



               System.out.println("O Carro esta desligado");

            

            }



		

		

	}

public void abastecer(int qtdLitros) {

	  

	  if(litrosCombustiveis < 100 ) {

		  if( isLigado == false) {

		

			  litrosCombustiveis =  litrosCombustiveis + qtdLitros ;



			  if(litrosCombustiveis > 100) {

				  int x = litrosCombustiveis - 100;

				  litrosCombustiveis = litrosCombustiveis -x;

		

				  System.out.println("seu limite de abastecer excedeu, limitamos  at� "+ litrosCombustiveis +"  litros  para evitar acidente.");

				 

				  

			  }  

				

			  System.out.println( "seu tanque est�  " + litrosCombustiveis +  "  litros");

			 	}else {

			 		

			 		 System.out.println("Seu carro esta em movimento, voc� n�o pode abastecer");

			 		

			 		

			 	}

	  	

	  }

		



}

	   

				

	  

	

	

	void desligar() {

		 



           if (Velocidade == 0) {

        	   	isLigado = false;

              System.out.println("Seu carro est� desligado");



           }

           else {

               System.out.println("Voc� precisa Frear o carro, para poder desligar  ");

           }

       

  }

	void pintar () {

		System.out.println("Sua cor atual �  " + cor );

		System.out.println("Escolhe uma cor ");

		cor = sr.next();

		System.out.println("Sua nova cor � " + cor );

	


	}
	
}

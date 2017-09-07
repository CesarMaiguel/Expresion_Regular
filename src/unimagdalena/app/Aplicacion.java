package unimagdalena.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		
		ArrayList <String> ArrayExpresionRegular = new ArrayList<String>();
		ArrayExpresionRegular.add(0,"L"); 
		ArrayExpresionRegular.add(1,"DL");
		
		int potenciaN=0, simboloPivote=0, recorrerSimbolos=0; 
		
		Scanner numero= new Scanner(System.in);
		System.out.print("DIGITE EL VALOR DE LA POTENCIA: ");
		potenciaN = numero.nextInt();
		
		for(int inicio=0; inicio < potenciaN; inicio++){
			int DimensionDelVector = ArrayExpresionRegular.size();
			for(int inicio2=0; inicio2 < DimensionDelVector; inicio2++){
				ArrayExpresionRegular.add(ArrayExpresionRegular.get(recorrerSimbolos)+ArrayExpresionRegular.get(simboloPivote)); 
				simboloPivote=simboloPivote+1; 
				if(simboloPivote > 1){
					simboloPivote = 0;
					recorrerSimbolos=recorrerSimbolos+1; 
				}
			}	
		}
		
		if(ArrayExpresionRegular.size()-2 == 0){
			System.out.println("POTENCIA 0: L");
		}else{
			System.out.print("L, ");
			for(int i = 0; i < ArrayExpresionRegular.size() - 2; i++){
				System.out.print("L"+ArrayExpresionRegular.get(i)+ ", "); 
			}
					
	}
  }
}
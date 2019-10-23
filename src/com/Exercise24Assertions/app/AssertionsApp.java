package com.Exercise24Assertions.app;
import java.util.Scanner;

public class AssertionsApp 
{

	public static void main(String[] args) 
	{
		//variable declaration
		int edad=0;
		
		Scanner input= new Scanner(System.in);
		System.out.println("¿Eres mayor de edad? Introduce tu edad: ");
		edad=input.nextInt();		
	}
	
	public static String isMayorEdad(int edad)
	{
		String cad="";
		assert edad>0: "Edad no valida el metodo solo acepta valores positivos";
		
		if (edad<18)
		{
			cad="Menor de edad!";
		}
		
		if (edad>18)
		{
			cad="Mayor de edad!";
		}
		return cad;
		
	}

}

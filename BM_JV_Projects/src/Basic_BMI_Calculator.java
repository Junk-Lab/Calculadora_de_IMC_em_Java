/**
 **************   Programa de cálculo de índice de massa corporal usando Java.   **************  

  Idealizado para fazer um cálculo básico de IMC, palavras-chaves usadas "double", "Scanner input", 
  "Scanner out print", "String" , "if", "else if", "else" e "close".
 */
import java.util.Scanner;

public class Basic_BMI_Calculator {

    public static void main(String[] args) {
    	
//Interação do algoritmo com input
    	
        double peso, altura;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Olá, você está no aplicativo de cálculo de IMC (Índice de massa corporal) \n");

        System.out.print("Digite seu peso em quilogramas 'KG' ex: 00,00 : \n");
        peso = input.nextDouble();

        System.out.print("Digite sua altura em metros 'M' ex: 0,00 : \n");
        altura = input.nextDouble();

        double imc = peso / (altura * altura);
        
//Regra de negócio
        
        String classification = "";
        if (imc < 16) {
            classification = "Muito abaixo do peso";
        } else if (imc < 18.5) {
            classification = "Abaixo do peso";
        } else if (imc < 24.99) {
            classification = "Regular ";
        } else if (imc < 29.99) {
            classification = "Sobrepeso";
        } else if (imc < 34.99) {
            classification = "Obesidade grau I";
        } else if (imc < 39.99) {
            classification = "Obesidade grau II";
        } else {
            classification = "Obesidade grau III";
        }

//Saida de dados
        
        System.out.println("Peso digitado: "+ peso + "Kg \n" + "Altura digitada: " + altura + "M \n");
        
        System.out.println("Seu IMC é: " + imc + "\n");
        
        System.out.println("Classificação do IMC: " + classification + "\n");
        
        System.out.println("Operação finalizada, Obrigado!");
        
        input.close();

//Fim
    }
}
/*
 *********************************** Projeto de apresentação **********************************                
  Autor: Richard Torres (JunkLab)
  Data: 12 - 09 - 2023
  Java SE 1.8
  Java Versão - 20.0.02 (AMD64)
 **********************************************************************************************
 */








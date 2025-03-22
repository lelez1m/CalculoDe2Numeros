
import java.util.Scanner;

public class Soma2Numeros2{
public static void main(String[] args){
Scanner scn = new Scanner(System.in);
int num1 = 0;
int num2 = 0;
int resultado = 0;
System.out.println("Soma de 2 numeros");
System.out.println("Digite o primeiro numero");
num1 = scn.nextInt();
System.out.println("Digite o segundo valor");
num2 = scn.nextInt();
resultado = num1 + num2;
System.out.println("O resultado eh: " + resultado);
}
}

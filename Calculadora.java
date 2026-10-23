import java.util.Scanner;

public class Calculadora { 
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int opocion=0;
        double num1, num2;
                do{
        System.out.println();            
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                """);
                    System.out.print("ingresa tu opción: ");
                    opocion= sc.nextInt();
                    switch (opocion) {
                        case 1:
                            System.out.print("Ingresa el primer número");
                            num1= sc.nextDouble();
                            System.out.print("Ingresa el segundo número: ");
                            num2= sc.nextDouble();
                            System.out.printf("La suma de los números es: %.2f", num1+num2);
                            break;


                        case 2:
                            System.out.print("Ingresa el primer número");
                            num1= sc.nextDouble();
                            System.out.print("Ingresa el segundo número: ");
                            num2= sc.nextDouble();
                            System.out.printf("La resta de los números es: %.2f", num1-num2); 
                            break;

                        
                        case 3:
                            System.out.print("Ingresa el primer número");
                            num1= sc.nextDouble();
                            System.out.print("Ingresa el segundo número: ");
                            num2= sc.nextDouble();
                            System.out.printf("La multiplicación de los números es: %.2f", num1*num2);
                            break;

                        case 4:
                            System.out.print("Ingresa el primer número");
                            num1= sc.nextDouble();
                            System.out.print("Ingresa el segundo número: ");
                            num2= sc.nextDouble();
                            System.out.printf("La división de los números es: %.2f", num1/num2);
                            break;
                        default:
                            System.out.println("Opción inválida. Intenta de nuevo.");
                            break;
  

                    }
                        if(opocion==5){
                            System.out.println("Gracias por usar la calculadora");
                        }    
                } while(opocion!=5);
    }
    }
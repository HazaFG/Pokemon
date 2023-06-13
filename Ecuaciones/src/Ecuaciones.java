import java.util.Scanner;

public class Ecuaciones {
	
	static Scanner scanner = new Scanner(System.in);
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione el grado de la ecuación:");
        System.out.println("1. Grado 2");
        System.out.println("2. Grado 3");
        System.out.println("3. Grado n");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
            	grado2();
                break;
            case 2:
            	grado3();
                break;
            case 3:
            	gradoX();
                break;
        }
    }
	
    public static void grado2() {
        System.out.println("Ingresa la ecuación en formato ax^2 + bx + c");

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        String ecuacion = a + "x^2 + " + b + "x + " + c + " = 0";
        System.out.println("Ecuación capturada: " + ecuacion);
    }

    public static void grado3() {
    	System.out.println("Ingresa la ecuación en formato ax^3 + bx^2 + cx + d");

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        System.out.print("Ingrese el valor de d: ");
        double d = scanner.nextDouble();

        String ecuacion = a + "x^3 + " + b + "x^2 + " + c + "x + " + d + " = 0";
        System.out.println("Ecuación capturada: " + ecuacion);
    }

    public static void gradoX() {
        System.out.println("Captura de ecuación de grado general");
        System.out.print("Ingrese el grado de la ecuación: ");
        int grado = scanner.nextInt();

        String ecuacion = "";

        for (int i = grado; i >= 0; i--) {
            System.out.print("Ingrese el coeficiente de x^" + i + ": ");
            double coeficiente = scanner.nextDouble();
            ecuacion += coeficiente + "x^" + i + " + ";
        }

//        ecuacion = ecuacion.substring(0, ecuacion.length() - 3); 
        ecuacion += " = 0";
        System.out.println("Ecuación capturada: " + ecuacion);
    }
}
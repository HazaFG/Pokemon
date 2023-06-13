import java.util.function.Function;

/*import java.text.DecimalFormat;

public class MetodoDeFalsaPosicion {
    
    public static void main(String[] args) {
        double a = 1.0; // Extremo izquierdo del intervalo
        double b = 1.5; // Extremo derecho del intervalo
        double tolerancia = 0.001; // Tolerancia para la convergencia
        int iteracionesMax = 100; // Número máximo de iteraciones
        
        DecimalFormat df = new DecimalFormat("0.00000000");
        
        System.out.println("Iteración\t  a\t\t\t  b\t\t\t  xr\t\t\t  f(a)\t\t\t  f(b)\t\t\t  f(xr)\t\t\t  f(a)*f(xr)\t\t  Error");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        
        // Iteraciones del método de falsa posición
        for (int i = 1; i <= iteracionesMax; i++) {
            double fa = funcion(a); // Valor de la función en a
            double fb = funcion(b); // Valor de la función en b
            
            // Cálculo del punto xr usando el método de falsa posición
            double xr = (a * fb - b * fa) / (fb - fa);
            double fxr = funcion(xr); // Valor de la función en xr
            
            // Cálculo de f(a) * f(xr)
            double fa_fxr = fa * fxr;
            
            // Cálculo del error
            double error = Math.abs((xr - a) / xr);
            
            // Imprimir los resultados de cada iteración
            System.out.println(i + "\t\t" + df.format(a) + "\t\t\t" + df.format(b) + "\t\t\t" + df.format(xr) +
                    "\t\t\t" + df.format(fa) + "\t\t\t" + df.format(fb) + "\t\t\t" + df.format(fxr) +
                    "\t\t\t" + df.format(fa_fxr) + "\t\t\t" + df.format(error));
            
            // Verificar la condición de convergencia
            if (Math.abs(fxr) < tolerancia) {
                System.out.println("La raíz aproximada es: " + xr);
                break;
            }
            
            // Actualizar los extremos del intervalo
            if (fa_fxr < 0) {
                b = xr;
            } else {
                a = xr;
            }
        }
    }
    
    // Función f(x) de ejemplo: f(x) = x^3 - 3x + 1
    public static double funcion(double x) {
        return Math.pow(x, 3) + (4 * Math.pow(x, 2)) - 10;
    }*/
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class NewtonRaphson {
    public static void main(String[] args) {
        double x0 = 1.5; // Valor inicial de x
        double tolerance = 0.001; // Tolerancia para considerar la aproximación aceptable

        // Definir la función y su derivada
        Function<Double, Double> f = x -> x * x * x + 4 * x * x - 10;
        Function<Double, Double> df = x -> 3 * x * x + 8 * x;

        List<Step> steps = new ArrayList<>();
        double x = x0;
        double error = Double.MAX_VALUE;
        int iteration = 1;

        while (error >= tolerance) {
            double fx = f.apply(x);
            double fp = df.apply(x);
            double deltaX = fx / fp;
            double xNext = x - deltaX;
            error = Math.abs(deltaX);
            steps.add(new Step(iteration, x, fx, fp, error));
            x = xNext;
            iteration++;
        }

        System.out.println("Tabla de iteraciones:");
        System.out.println(" Iteración      x         f(x)      f'(x)      Error");
        for (Step step : steps) {
            System.out.printf("%10d %10.8f %10.8f %10.8f %10.8f\n", step.iteration, step.x, step.fx, step.fp, step.error);
        }

        System.out.println("La raíz aproximada es: " + x);
    }

    // Representa una iteración en el método de Newton-Raphson
    private static class Step {
        private final int iteration;
        private final double x;
        private final double fx;
        private final double fp;
        private final double error;

        public Step(int iteration, double x, double fx, double fp, double error) {
            this.iteration = iteration;
            this.x = x;
            this.fx = fx;
            this.fp = fp;
            this.error = error;
        }
    }
}


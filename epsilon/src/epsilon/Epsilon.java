package epsilon;
public class Epsilon 
{
 public static void main(String[] args) 
 {
  double epsilon = 1;
  while(epsilon + 1 > 1)
  {
   epsilon = epsilon/2;
  }
  epsilon = epsilon *2;
//  System.out.println(epsilon);
 
  /*System.out.println("Ecuacion 1");
  for (int x = -3; x <= 3; x++) {
	    int resultado = 2 * (int)Math.pow(x, 3) - 5 * (int)Math.pow(x, 2) - 9 * x + 18;
	    System.out.println(resultado);
  }
  System.out.println("Ecuacion 2");
  for (int x = -3; x <= 3; x++) {
	    int resultado = (int) Math.pow(x, 3) - 4 * (int) Math.pow(x, 2) - 3 * x - 10;
	    System.out.println(resultado);
	}
  System.out.println("Ecuacion 3");
  for (int x = -3; x <= 3; x++) {	  
	    int resultado = 2 * (int) Math.pow(x, 3) - 5 * (int) Math.pow(x, 2) - 3 * x;
	    System.out.println(resultado);
  		}
  System.out.println("Ecuacion 4");
  for (int x = -3; x <= 3; x++) {
	    int resultado = (int) Math.pow(x, 3) - 6 * (int) Math.pow(x, 2) + 3 * x + 10;
  		System.out.println(resultado);
  		}
  System.out.println("Ecuacion 5");
  for (int x = -3; x <= 3; x++) {
	    int resultado = (int) Math.pow(x, 2) - 9;
	    System.out.println(resultado);
  		}
  System.out.println("Ecuacion 6");
  for (int x = -3; x <= 3; x++) {
	    int resultado = (int) Math.pow(x, 2) + 7;
	    System.out.println(resultado);
  		}
  System.out.println("Ecuacion 7");
  for (int x = -3; x <= 3; x++) {
	    int resultado = (int)Math.pow(x, 2) + 6 * x + 5;
	    System.out.println(resultado);
  		}
  System.out.println("Ecuacion 8");
  for (int x = -3; x <= 3; x++) {
	    int resultado = x*x + 9*x - 20;
	    System.out.println(resultado);
	    }
  System.out.println("Ecuacion 9");
  for(int x = -3; x <= 3; x++) {
	    int resultado = x*x - 3*x + 4;
	    System.out.println(resultado);
	    }
  System.out.println("Ecuacion 10");
  for (int x = -3; x <= 3; x++) {
	   int resultado = 9*(int)Math.pow(x,2) - 6*x + 1;
	   System.out.println(resultado);
	   }¨*/
 	double a=0,fa=0,
 	b=2,fb=0,
 	m=0,fm=0,
 	i=0,cont=0,fafm=0,mAnterior=0, Error=1;
 	
  do{
	  System.out.println("Operacion: "+(cont));
	  System.out.println("a: "+a);
	  System.out.println("b: "+b);
	 fa = (Math.pow(a, 4))+(3 *( Math.pow(a ,3))) -2 ;
	 System.out.println("fa: "+fa);
	 fb = (Math.pow(b, 4))+(3 *( Math.pow(b ,3))) -2 ;
	 System.out.println("fb: "+fb);
	 mAnterior = m;
	 m = (a+b) /2;
	 System.out.println("m: "+m);
	 fm = (Math.pow(m, 4))+(3 * Math.pow(m ,3)) -2 ;
	 System.out.println("fm: "+fm);
	 fafm = fa*fm;
	 System.out.println("fa*fm: "+fafm);
	 if (fafm > 0) {
		 a = m;
	 }else {
		 b = m;
	 }
	 if (cont >=1 ) {
		 Error = Math.abs((m - mAnterior) /m);
		 System.out.println("Error: "+Error);
	 }
	 cont++;
	 if (Error <= 0.001) {
		 i++;
	 }
	 if (Error >= -0.001) {
		 i++;
	 }
	 System.out.println();
  }while(Error > 0.001);
 
 }
}
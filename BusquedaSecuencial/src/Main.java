
public class Main {

	public static void main(String[] args) {
		int [] arreglo = {1,2,3,4,5};
		
		System.out.println(busquedaSecuencial(arreglo,1));
		
	}
	
	
	public static  int busquedaSecuencial(int []arreglo,int dato){
		 int posicion = -1;
		  for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
		      if(arreglo[i] == dato){//comparamos el elemento en el arreglo con el buscado
		    posicion = i;//Si es verdadero guardamos la posicion
		    break;//Para el ciclo
		   }
		 }
		 return posicion;
		}

}



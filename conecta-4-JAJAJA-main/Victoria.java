
public class Victoria {
	
/*
    public int victoria(int c, int f){
        if (!columnaValida(c))
            return -1;
        if (!filaValida(f))
            return -1;
        
        //comprobamos si en la columna hay 4 en linea
        int fIni=f+1;
        int enLinea=1;
        while(filaValida(fIni)&&(tablero[fIni][c]==aBuscar))
        {
            enLinea++;
            fIni++;
        }
        fIni=f-1;
        while(filaValida(fIni)&&(tablero[fIni][c]==aBuscar))
        {
            enLinea++;
            fIni--;
        }
        
        
        
        if(enLinea>=4)	
            return 1;
       
        //comprobamos que en la fila hay 4 en linea
        int cIni=c+1;
        enLinea=1;
        
        while(columnaValida(cIni)&&(tablero[f][cIni]==aBuscar))
        {
            enLinea++;
            cIni++;
        }
        cIni=c-1;
        while(columnaValida(cIni)&&(tablero[f][cIni]==aBuscar))
        {
            enLinea++;
            cIni--;
        }
        
         if(enLinea>=4)	
            return 1;
       
        //comprobamos que en diagonal hay 4 en linea
        cIni=c+1;
        fIni=f+1;
        enLinea=1;
        while(filaValida(fIni)&&columnaValida(cIni)&&(tablero[fIni][cIni]==aBuscar))
        {
            enLinea++;
            cIni++;
            fIni++;
        }
        fIni=f-1;
        cIni=c-1;
        while(filaValida(fIni)&&columnaValida(cIni)&&(tablero[fIni][cIni]==aBuscar))
        {
            enLinea++;
            cIni--;
            fIni--;
        }
       
        if(enLinea>=4)	
            return 1;
       
        //comprobamos que en diagonal hay 4 en linea
        cIni=c+1;
        fIni=f-1;
        enLinea=1;
        while(filaValida(fIni)&&columnaValida(cIni)&&(tablero[fIni][cIni]==aBuscar))
        {
            enLinea++;
            cIni++;
            fIni--;
        }
        fIni=f+1;
        cIni=c-1;
        while(filaValida(fIni)&&columnaValida(cIni)&&(tablero[fIni][cIni]==aBuscar))
        {
            enLinea++;
            cIni--;
            fIni++;
        }
        
        if(enLinea>=4)	
            return 1;
            
        return 0;
    }
    
    
    public int hayEspacio(int c){
        if (!columnaValida(c))
            return -1;
        else
        {
            int f=0;
            while(filaValida(f)&&(tablero[f][c]==Casilla.LIBRE))
                 f++;
            if(filaValida(f-1))
                return (f-1);
            else
                return -1;
        }
    }
    
    
    private boolean filaValida(int f) {
        return 0 <= f && f < numFil;
    }

    
    private boolean columnaValida(int c) {
        return 0 <= c && c < numCol;
    }
  
    
    public boolean estaLleno()
    {
    	boolean estaLleno=true;
    	
    	for(int i=0; i<getNumColumnas(); i++)
    	{
    		if(hayEspacio(i)!=-1)
    		{
    			estaLleno=false;
    		}
    	}
    	
    	return estaLleno;
    		
    	
    }
    
    */

}

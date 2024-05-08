/*
 * Elaboro: Fernando Tovar Herrera
 * Tema:  estructura algorítmica de decision multiple
 *         Enunciado: Diseño de menu principal.
 */
package sueño_05;
import   javax.swing.JOptionPane;  // Activa entrada/salida por caja
public class Sueño_05 {
    public static void main(String[] args) {
    Integer opcion;
    String cadena;

    do  //  ciclo que ejecuta muchas veces el metodo
    {
        Mostrar_menu();
         do
        {
            cadena = JOptionPane.showInputDialog (null, "MENU --> Opcion ( 1…4 ): ");	
            opcion = Integer.parseInt (cadena);
            if ( ! ( opcion >=1 && opcion <= 4 ) )
                JOptionPane.showMessageDialog (null, "** Valor de a fuera de Rango  **" ); 	
        }
        while ( ! ( opcion >= 1 && opcion <= 4 ) );
        // Proceso-salida
        switch( opcion )
        {
           case 1 :
    	       Factorial();
               break;
           case 2 :
    	       Exponencial();
               break;	
           case 3 :
    	       Tablas(); 
               break; 
          case 4 :
    	       Finalizar();
               break;   	   
        }   
    }   //  fin del ciclo para el metodo
    while ( ( opcion != 4 ) );  
 }  //  Fin del método principal

   //  -----   Metodo:  Menu    -----
   private static void Mostrar_menu()
   {
        String cadena;
        Integer opcion;
        // Encabezamiento:   
        JOptionPane.showMessageDialog (null, "Institucion universitaria EAM  " ) ;
        // System.out.println("  Institucion universitaria EAM \n");
        //  Listado de opciones
        System.out.println(">>> MENÚ DE OPCIONES <<<");
        System.out.println("  1  Factorial");
        System.out.println("  2  Funcion exponencial");    
        System.out.println("  3  Tablas de multiplicar");   
        System.out.println("  4  Terminar");     
   }
      
       //  -----   Metodo:  Factorial    -----
       private static void Factorial()
      {
      String cadena; 
      int n, pro, k; 
       
       do
       {
            cadena = JOptionPane.showInputDialog (null, "FACTORIAL --> Entero ( 2<n<=8): ");	
            n = Integer.parseInt (cadena);
            if ( ! ( n>2 && n<=8 ) )
                JOptionPane.showMessageDialog (null, "** Valor de a fuera de Rango  **" ); 	
       }
       while ( ! ( n>2 && n<=8 ) );
  
        pro = 1;
        for ( k=1; k<=5; k++ )
        {
            pro = pro * k;
            System.out.println ( "  " + k + "  " + pro );
            JOptionPane.showMessageDialog ( null, "  " + k + "  " + pro);
        }
         }

      //  -----   Metodo:  Funcion exponencial   -----
        private static void Exponencial()
        {
              String cadena;
              Integer n, k, fa;   
              double x, expo;        
 
             // Entrada de datos en una caja grafica    
            do
	     {
	        cadena = JOptionPane.showInputDialog (null, "EXPONENCIAL --> Total de terminos[2...12] : ");	
	        n = Integer.parseInt (cadena);
	        if ( !( n>=2 && n<=12 ) )
	        {
	           JOptionPane.showMessageDialog (null, "** Dato Equivocado **" ); 	
	        }
	     }
             while ( !( n>=2 && n <=12 ) );
         
             do
	     {
	        cadena = JOptionPane.showInputDialog (null, "Valor de X [-99.99 , 99.99] : ");	
	        x = Double.parseDouble (cadena);
	        if ( !( x>=-99 && x<=99.99 ) )
	        {
	           JOptionPane.showMessageDialog (null, "** Dato Equivocado **" ); 	
	        }
	     }
             while ( !( x>=-99.99 && x<=99.99 ) );  
             // Proceso
             fa = 1;
             expo = 1;
             for (k=1; k<=n; k++)
             {
                 fa = fa * k;
                 expo = expo + Math.pow(x,k) / fa;	
             }
             JOptionPane.showMessageDialog ( null, String.format("X = " + x + "   Exp(x)= %12.6f" , expo) );
        } 

         //  -----    Metodo:  Tablas de multiplicar  ------
            private static void Tablas()
          {
           String cadena;
           Integer n, j, k, pro;
           // Entrada de datos en una caja grafica    
        do
        {
            cadena = JOptionPane.showInputDialog (null, "TABLAS --> Total de tablas [2..9] : ");	
            n = Integer.parseInt (cadena);
            if ( !( n>=2 && n<=12 ) )
            {
               JOptionPane.showMessageDialog (null, "** Dato Equivocado **" ); 	
            }
        }
        while ( !( n>=2 && n <=9 ) );
        // Proceso
        for ( j=2; j<=n; j++ )
        {  
            System.out.println(  "La tabla del: " + j );     
            for ( k=1; k<=5; k++ )
            {
               pro = j * k;  
               System.out.println(  j + " X " + k + " = " + pro);     
            }
            System.out.println(  "     " );       
        }
}
     
        //  -----   Metodo:  Final  -----
            private static void Finalizar()
          {
            // Mensaje final:
            JOptionPane.showMessageDialog ( null, "  FIN   M E N U ");
          }

}  //  Fin de la clase

 

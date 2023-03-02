package franciscopicadoexamen1;

import java.util.Scanner;

public class ClsVentas {
   
    static int [] cedula = new int [9];
    static String [] nombre = new String [0];
    static String [] localidad = new String [0];
    static int [] cantidadentrada = new int [9];
    static double [] subtotal = new double [9];
    static double [] total = new double [9];
    static double [] Impuesto = new double [0];
 
    static double[] costo = new double [9];
    
    static int indice= 0;



    public ClsVentas() {
    }

   public static void Inicializar() {
       for (int i = 0; i < nombre.length; i++) {
           cedula[i] =0;
           nombre[i] ="" ;
           localidad[i] ="" ;
           cantidadentrada[i] =0;
           costo[i] =0;
           subtotal= costo;
           Impuesto[i]= 1.13;
       }
       System.out.println("Programa reiniciado de 0");
   }
   
   public static void Mostrar(){
       for (int i = 0; i < indice; i++) {
           System.out.println("Cliente: " + nombre [i] + " Cedula: " + cedula [i] + " Localidad: " + localidad [i] + " Cantidad de entradas: " + cantidadentrada [i] + " Costo: " + costo[i]);
           
       }
   }
    
   public static void DigitarDatosCliente (){
   char continuar = 'n';
   Scanner leer = new Scanner(System.in);
   if (indice > 1){
       System.out.println("Cupos agotados");
       continuar= 'n';
   } else {
       
       do {
           System.out.println("Digite la cedula: ");
           cedula[indice] = leer.nextInt();
           System.out.println("Nombre y Apellidos: ");
           nombre[indice] = leer.next();
           System.out.println("Localidad del Estadio: ");
           localidad[indice] = leer.next();
           System.out.println("Digite el precio de la entrada");
           costo[indice] = leer.nextFloat();
           System.out.println("Cantidad de Entradas a Comprar: ");
           cantidadentrada[indice] = leer.nextInt();
           indice++;
           System.out.println("Quisiera realizar otra compra de entrada?");
           continuar = leer.next().toLowerCase().charAt(0);
           
       } while (continuar!='n');
   } 
    
}
}

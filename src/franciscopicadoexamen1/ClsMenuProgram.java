package franciscopicadoexamen1;

import java.util.Scanner;

public class ClsMenuProgram {
    
    public byte opcion;
    public Scanner leer = new Scanner(System.in);
    public ClsMenuProgram (){
    opcion = 10;
    }
    
    public void menupr (){
    int total = 0;
        do {
            System.out.println("1- Inicializar");
            System.out.println("2- Venta de Entrada");
            System.out.println("3- Consultar Total de Ventas");
            System.out.println("4- Salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextByte();
            switch (opcion) {
                case 1: ClsVentas.Inicializar();
                    break;
                case 2: ClsVentas.DigitarDatosCliente();
                    break;
                case 3: ClsVentas.Mostrar();
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el programa!");
                    break;
                
                default:
                System.out.println("Valor Invalido");
                
            }
            
        } while (opcion!=4);
    }
    
}
    


package Reloj;

import java.io.File;
import static java.lang.System.out;
import java.util.Scanner;
class LoopDo2 {
    public static void main(String args[] ) {
        File archivo = new File("d:\\miArchivo.txt" ) ;
        Scanner miScanner = new Scanner (System.in) ;
        char replica;
        do {
            out. print("¿Borrar archivo? (s/ n) " ) ;
        replica = miScanner. findWithinHorizon( "." , 0) . charAt( 0) ; }
        while (replica != 's' && replica != 'n' && replica != 'S' && replica != 'N' ) ;
        if ( replica == 's' || replica == 'S'  ) {
            out. println( "De acuerdo, borrando archivo. . . ") ;
            archivo. delete() ; }
        else {
            out. println( "De acuerdo, confirmado no borrar. ") ;
            String path = archivo.getPath();
            Long tam = archivo.getTotalSpace();
            out.print("La ubicacion del archivo es: " + path);
            out.println("El tamaño del archivo es: " + tam/1024);
        }
    }
}
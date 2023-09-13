package prueba;
import java.io.File;
public class File1Mostrando {
    public static void main(String[ ] args){
        System.out.println("Ficheros en el directorio del proyecto: ") ;
        File fi=new File(".");
        String[] archivos = fi.list();
        for (int i=0;i<archivos.length;i++) {
            System.out.println(archivos[i]);
        }
    }
}
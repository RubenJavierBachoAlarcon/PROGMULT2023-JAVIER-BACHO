package prueba;
import java.io.File;
import java.io.IOException;
public class File2Creando {
    public static void main(String[ ] args) throws IOException{
        System.out.println("Ficheros en el directorio del proyecto: ") ;
        File f1 = new File(".\\directorio");
        File f2 = new File(".\\directorio\\archivo1.txt");
        File f3 = new File(".\\directorio\\archivo2.txt");
        System.out.println(f1.mkdir());
        f2.createNewFile();
        f3.createNewFile();
    }
}
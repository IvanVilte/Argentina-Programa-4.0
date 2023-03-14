import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        String cad = "Maria,Ivan,Carlos,Abel,Graciela,Felipe,Catrina,China,Tom,Mateo";
        //Path path = Paths.get("src\\Clase4\\names.txt");  si no sirve el otro path probar con este. Este se probó en el IDE IntelliJ
        Path path = Paths.get("names.txt");

        Files.writeString(path, cad);

        String [] names;
        for (String line: Files.readAllLines(path)) {
            names = line.split(",");
            for(String name : names){
                System.out.println(name);
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFichajes {

    public static void leerFichajes() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("horas.txt"));

            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error al leer el fichero");
        }
    }
}
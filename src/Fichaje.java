import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fichaje {

    public static void fichar(String username) {

        try {
            FileWriter fw = new FileWriter("horas.txt", true); // true = NO sobreescribe

            LocalDateTime ahora = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");

            String fechaHora = ahora.format(formato);

            fw.write(username + " - " + fechaHora + "\n");

            fw.close();

            System.out.println("Fichaje realizado correctamente");

        } catch (IOException e) {
            System.out.println("Error al guardar fichaje");
        }
    }
}
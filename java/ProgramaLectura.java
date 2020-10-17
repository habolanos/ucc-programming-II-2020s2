import java.io.*;

public class ProgramaLectura {
  public static void main(String[] args) {
    String entrada = null;
    int numero = 0;

    System.out.println("+----------------------------------+");
    System.out.println("|       Programa Lectura           |");
    System.out.println("+----------------------------------+");

    try {
      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
      entrada = buffer.readLine();
      numero = Integer.parseInt(entrada);

      System.out.println("El numero Digitado es: "+numero);
    } catch (NumberFormatException ex) {
      System.out.println("El valor digitado no es un numero !");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

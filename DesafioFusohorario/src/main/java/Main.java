import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int horasaida = leitor.nextInt();
        int tempoviagem = leitor.nextInt();
        int fuso = leitor.nextInt();
        int hora = horasaida + tempoviagem + fuso;
        if (hora >= 24) hora -= 24;
        else if (hora < 0) hora += 24;
        System.out.println(hora);
    }

}
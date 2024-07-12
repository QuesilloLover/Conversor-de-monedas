package com.aluracursos.ChallengeConversorMoneda.Principal;
import com.aluracursos.ChallengeConversorMoneda.models.ConversorApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConversorApp conversion = new ConversorApp();
        String menu = """
                     *********************************************
                     Sea bienvenido/a al conversor de moneda :3
                     
                     1) Dolar ----> Peso argentino
                     2) Peso argentino ----> Dolar
                     3) Dolar ----> Real brasileño
                     4) Real brasileño ----> Dolar
                     5) Dolar ----> Córdobas
                     6) Córdobas ----> Dolar
                     7) Salir
                     *********************************************
                     """;

        int opcion = 0;
        while(opcion != 7){

            System.out.println(menu);
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion){
                case 1:
                    conversion.convertirMoneda("USD","ARS");
                    break;
                case 2:
                    conversion.convertirMoneda("ARS","USD");
                    break;
                case 3:
                    conversion.convertirMoneda("USD","BRL");
                    break;
                case 4:
                    conversion.convertirMoneda("BRL","USD");
                    break;
                case 5:
                    conversion.convertirMoneda("USD","NIO");
                    break;
                case 6:
                    conversion.convertirMoneda("NIO","USD");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    opcion = 7;
                    break;
            }
        }
    }
}

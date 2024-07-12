package com.aluracursos.ChallengeConversorMoneda.models;

import java.util.Scanner;

public class ConversorApp {
    public void convertirMoneda(String fromRate, String toRate) {
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        Scanner lectura = new Scanner(System.in);
        Moneda conversion = consultaMoneda.buscarMoneda(fromRate, toRate);

        if (conversion == null) {
            System.out.println("No se pudo obtener la tasa de conversión");
            return;
        }

        System.out.print("Ingrese el monto a convertir: ");
        try {
            double monto = Double.parseDouble(lectura.nextLine());
            double montoConvertido = monto * conversion.conversion_rate();

            String resultado = String.format("El valor de %.2f %s corresponde a %.2f %s", monto, fromRate, montoConvertido, toRate);
            System.out.println(resultado);
        } catch (NumberFormatException e) {
            System.out.println("Monto ingresado no es válido.");
        }
    }
}

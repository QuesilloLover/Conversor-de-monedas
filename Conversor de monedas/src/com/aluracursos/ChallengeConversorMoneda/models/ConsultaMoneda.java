package com.aluracursos.ChallengeConversorMoneda.models;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    private String APIKEY = "1536e965dce13db685b75a34";
    public Moneda buscarMoneda(String fromRate, String toRate){
        String direccion = "https://v6.exchangerate-api.com/v6/" + APIKEY + "/pair/" + fromRate + "/" + toRate;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

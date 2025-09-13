package com.guilhermearcora.findCep;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        try {

            Scanner scanner = new Scanner(System.in);
            HttpClient client = HttpClient.newHttpClient();

            System.out.println("Insira um cep");
            String cep = scanner.nextLine();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/"))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

        }catch (Exception e){
            System.out.println("Algo deu errado: " + e.getMessage());
        }

    }

}

package br.com.screenMatch;

import br.com.screenMatch.modelos.TituloOMDb;
import br.com.screenMatch.modelos.Titulos;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainComBusca {
    static void main() throws IOException, InterruptedException {

        Scanner pesquisa = new Scanner(System.in);
        System.out.println("Digite o nome do Filme: ");
        String busca = pesquisa.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=e1cbb254";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        //Titulos meuTitulo = gson.fromJson(response.body(), Titulos.class);
        TituloOMDb meuTituloOMDb = gson.fromJson(response.body(), TituloOMDb.class);
        System.out.println(meuTituloOMDb);
        Titulos meuTitulo = new Titulos(meuTituloOMDb);
    }
}

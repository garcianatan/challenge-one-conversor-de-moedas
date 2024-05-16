import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public record ConversorDeMoeda(String moedaEntrada, String moedaSaida, double valor) {
    public double converter() {

        String chaveApi = "4b6b54c32f981ea1f60f70b7";
        String endereco = "https://v6.exchangerate-api.com/v6/" + chaveApi + "/pair/" + moedaEntrada + "/" + moedaSaida +"/" + valor;

        HttpClient client = HttpClient.newHttpClient() ;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response;
        {
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }

            JsonParser jp = new JsonParser();
            JsonObject jsonobj = jp.parse(response.body()).getAsJsonObject();

            return jsonobj.get("conversion_result").getAsDouble();
        }
    }
}

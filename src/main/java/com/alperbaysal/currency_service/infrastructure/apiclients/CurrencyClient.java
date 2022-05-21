package com.alperbaysal.currency_service.infrastructure.apiclients;

import com.alperbaysal.currency_service.domain.entities.GetCurrencyRatesServiceResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

@Component
@Scope(value = "singleton")
public final class CurrencyClient{

   private final HttpClient client = HttpClient.newHttpClient();

    public GetCurrencyRatesServiceResponse GetCurrency() throws IOException, InterruptedException {


        var uri = "https://evds2.tcmb.gov.tr/service/evds/series=TP.DK.USD.A-TP.DK.EUR.A&startDate=18-05-2022&endDate=19-05-2022&type=json&key=KpE5nBBk8X";

        HttpRequest request = HttpRequest.newBuilder()
                .header("Accept", "application/json")
                .uri(URI.create(uri))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        try {
            Map<String, GetCurrencyRatesServiceResponse> result =
                    new ObjectMapper().readValue(response.body(), HashMap.class);
            return (GetCurrencyRatesServiceResponse) result;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

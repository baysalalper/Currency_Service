package com.alperbaysal.currency_service.Application.ApiClients;

import com.alperbaysal.currency_service.Infrastructure.ApiClients.IEvdsClient;
import com.alperbaysal.currency_service.Infrastructure.ApiClients.Models.GetCurrencyRatesServiceResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class EvdsClient implements IEvdsClient {

    HttpClient client = HttpClient.newHttpClient();

    @Override
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

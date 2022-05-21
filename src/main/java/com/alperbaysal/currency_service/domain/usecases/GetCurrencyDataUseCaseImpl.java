package com.alperbaysal.currency_service.domain.usecases;

import com.alperbaysal.currency_service.domain.entities.GetCurrencyRatesServiceResponse;
import com.alperbaysal.currency_service.infrastructure.apiclients.CurrencyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Component
@Scope(value = "singleton")
public class GetCurrencyDataUseCaseImpl{

    @Autowired
    private CurrencyClient _currencyClient;

    public GetCurrencyRatesServiceResponse.CurrencyItem getCurrentRates() throws ExecutionException, InterruptedException {
        final CompletableFuture<GetCurrencyRatesServiceResponse> response = CompletableFuture.supplyAsync(() -> {
            try {
                return _currencyClient.GetCurrency();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        var currencyItems = response.get().getItems();

        return currencyItems.get(1);
    }
}

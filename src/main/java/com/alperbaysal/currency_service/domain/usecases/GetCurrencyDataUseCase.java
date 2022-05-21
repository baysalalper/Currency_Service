package com.alperbaysal.currency_service.domain.usecases;

import com.alperbaysal.currency_service.domain.entities.GetCurrencyRatesServiceResponse;

import java.util.concurrent.ExecutionException;

public interface GetCurrencyDataUseCase {
    public GetCurrencyRatesServiceResponse.CurrencyItem getCurrentRates() throws ExecutionException, InterruptedException;
}

package com.alperbaysal.currency_service.Infrastructure.ApiClients;

import com.alperbaysal.currency_service.Infrastructure.ApiClients.Models.GetCurrencyRatesServiceResponse;

import java.io.IOException;

public interface IEvdsClient
{
    public GetCurrencyRatesServiceResponse GetCurrency() throws IOException, InterruptedException;
}

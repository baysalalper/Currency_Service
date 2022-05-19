package com.alperbaysal.currency_service.Infrastructure.ApiClients.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetCurrencyRatesServiceResponse {
    private List<CurrencyItem> Items;

    public List<CurrencyItem> getItems() {
        return Items;
    }
    public void setItems(List<CurrencyItem> i){
        this.Items = i;
    }

    private class CurrencyItem {
        @JsonProperty("TP_DK_USD_A")
        public String Usd;
        @JsonProperty("TP_DK_EUR_A")
        public String Eur;
    }
}



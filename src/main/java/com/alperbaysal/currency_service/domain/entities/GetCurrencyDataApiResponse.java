package com.alperbaysal.currency_service.domain.entities;

public class GetCurrencyDataApiResponse {
    double euroRate;

    public GetCurrencyDataApiResponse(double euroRate, double usdRate) {
        this.euroRate = euroRate;
        this.usdRate = usdRate;
    }

    double usdRate;

    public double getEuroRate() {
        return euroRate;
    }

    public void setEuroRate(double euroRate) {
        this.euroRate = euroRate;
    }

    public double getUsdRate() {
        return usdRate;
    }

    public void setUsdRate(double usdRate) {
        this.usdRate = usdRate;
    }
}

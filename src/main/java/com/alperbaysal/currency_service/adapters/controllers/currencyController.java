package com.alperbaysal.currency_service.adapters.controllers;

import com.alperbaysal.currency_service.domain.entities.GetCurrencyDataApiResponse;
import com.alperbaysal.currency_service.domain.usecases.GetCurrencyDataUseCaseImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api/currency")
public class currencyController {

    private final GetCurrencyDataUseCaseImpl getCurrencyUseCase;

    public currencyController(GetCurrencyDataUseCaseImpl getCurrencyUseCase) {
        this.getCurrencyUseCase = getCurrencyUseCase;
    }

    @GetMapping
    public GetCurrencyDataApiResponse getCurrency() throws ExecutionException, InterruptedException {
        var result = getCurrencyUseCase.getCurrentRates();

        return new GetCurrencyDataApiResponse(Double.parseDouble(result.Eur), Double.parseDouble(result.Usd));
    }
}

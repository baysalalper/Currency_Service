package com.alperbaysal.currency_service.Domain.Entities;

import javax.persistence.*;

@Entity
@Table(name = "CurrencyRequests")
public class CurrencyRequestRecord
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private CurrencyTypes Type;
    private double ConversionRateToLira;
}

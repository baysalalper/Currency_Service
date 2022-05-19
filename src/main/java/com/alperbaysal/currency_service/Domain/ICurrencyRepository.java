package com.alperbaysal.currency_service.Domain;

import com.alperbaysal.currency_service.Domain.Entities.CurrencyRequestRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICurrencyRepository extends CrudRepository<CurrencyRequestRecord, Long> {
}

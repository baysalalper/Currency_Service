package com.alperbaysal.currency_service.infrastructure.repositories;

import com.alperbaysal.currency_service.domain.entities.CurrencyRequestRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends CrudRepository<CurrencyRequestRecord, Long> {
}

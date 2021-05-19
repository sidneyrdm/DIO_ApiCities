package com.github.sidneyrdm.cities.api.repository;

import com.github.sidneyrdm.cities.api.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

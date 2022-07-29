package com.oneStopSolution.microservices.currencyconversionservice.controller;

import com.oneStopSolution.microservices.currencyconversionservice.bean.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//application name configured in application.properties
//@FeignClient(name = "currency-exchange", url = "localhost:8001")

//now, we want to automatically load balancing
@FeignClient(name="currency-exchange")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retrieveExchangeValue(@PathVariable String from,
                                                    @PathVariable String to);
}

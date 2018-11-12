package com.vagner.zipkin.contract;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;
import java.util.Arrays;
import java.util.Map;

@RestController
@RequestMapping("/financial")
public class ZippingFinancialController {
    @GetMapping(value = "/salaries/{ids}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<Integer, Long> getSalariesByIds(@NotEmpty(message = "Customer's function must be provided")
                                               @PathVariable("ids") Integer[] ids) {
        return ZipkinFinancialFacade.getCustomerSalariesByIds(Arrays.asList(ids));
    }
}

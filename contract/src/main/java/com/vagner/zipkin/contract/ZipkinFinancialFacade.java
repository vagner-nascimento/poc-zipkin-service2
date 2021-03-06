package com.vagner.zipkin.contract;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class ZipkinFinancialFacade {
    public static Map<Integer, Long> getCustomerSalariesByIds(List<Integer> ids) {
        return ids.stream()
                .distinct()
                .collect(Collectors.toMap(id -> id, id -> ThreadLocalRandom.current().nextLong(10000)));
    }
}

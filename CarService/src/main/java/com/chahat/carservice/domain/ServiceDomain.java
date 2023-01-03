package com.chahat.carservice.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ServiceDomain {
    private List<String> serviceCodes;
    private String service;
}

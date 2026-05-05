package com.cullenia_backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CompanySummary {

    @JsonProperty("reqSymbolBetaInfo")
    private SymbolBetaInfo betaInfo;

    @JsonProperty("reqLogo")
    private Logo logo;

    @JsonProperty("reqSymbolInfo")
    private SymbolInfo symbolInfo;
}
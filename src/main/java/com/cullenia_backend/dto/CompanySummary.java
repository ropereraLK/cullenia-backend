package com.cullenia_backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CompanySummary {

    @JsonProperty("reqSymbolBetaInfo")
    private ReqSymbolBetaInfo betaInfo;

    @JsonProperty("reqLogo")
    private ReqLogo logo;

    @JsonProperty("reqSymbolInfo")
    private ReqSymbolInfo symbolInfo;
}
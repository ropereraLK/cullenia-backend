package com.cullenia_backend.dto;

import lombok.Data;

@Data
public class ReqSymbolBetaInfo {
    private Integer securityId;
    private Double triASIBetaValue;
    private Double betaValueSPSL;
    private String triASIBetaPeriod;
    private Integer quarter;
}
package com.cullenia_backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ListedEntity {
    private int id;
    private String name;
    private String symbol;
    private String logoUrl;
    private Long lastTradedTime;
    private Double price;
    private Double turnover;

    @JsonProperty("sharevolume")
    private Long shareVolume;

    @JsonProperty("tradevolume")
    private Integer tradeVolume;

    private Double percentageChange;
    private Double change;



}

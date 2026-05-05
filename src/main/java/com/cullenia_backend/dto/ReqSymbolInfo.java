package com.cullenia_backend.dto;

import lombok.Data;

@Data
public class ReqSymbolInfo {

    private Integer id;
    private String symbol;
    private String name;
    private String issueDate;

    private Long quantityIssued;
    private Double parValue;
    private Double issuedPrice;

    private Double lastTradedPrice;

    private Double wtdHiPrice;
    private Double mtdHiPrice;
    private Double ytdHiPrice;
    private Double p12HiPrice;
    private Double allHiPrice;

    private Double allLowPrice;
    private Double wtdLowPrice;
    private Double mtdLowPrice;
    private Double ytdLowPrice;
    private Double p12LowPrice;

    private Long tdyShareVolume;
    private Long wdyShareVolume;
    private Long mtdShareVolume;
    private Long ytdShareVolume;
    private Long p12ShareVolume;

    private Integer tdyTradeVolume;
    private Integer wtdTradeVolume;
    private Integer mtdTradeVolume;
    private Integer ytdTradeVolume;
    private Integer p12TradeVolume;

    private Double tdyTurnover;
    private Double wtdTurnover;
    private Double mtdTurnover;
    private Double ytdTurnover;
    private Double p12Turnover;

    private Double previousClose;

    private Double foreignHoldings;
    private Double foreignPercentage;

    private String instrumentsDate;

    private Double hiTrade;
    private Double lowTrade;
    private Double closingPrice;

    private Double marketCap;
    private Double marketCapPercentage;

    private Double change;
    private Double changePercentage;

    private Long symbolIndexShareVolume;
    private String isin;
}
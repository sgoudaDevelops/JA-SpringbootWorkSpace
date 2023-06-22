package com.softtek.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("custom")
@ConfigurationProperties("cust.sour")
@Data
public class Customer {
private Integer cno;
private String customername;
private String caddrs;
}

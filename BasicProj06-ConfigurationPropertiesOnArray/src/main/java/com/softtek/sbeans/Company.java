package com.softtek.sbeans;

import org.springframework.beans.factory.annotation.Value;


import lombok.Data;
import lombok.Setter;
import lombok.ToString;

@Data
public class Company {
private String name;
private String addrss;
private Long pincode;
private Long contact;
@Value("${softtek.size}")
private Long size;
}

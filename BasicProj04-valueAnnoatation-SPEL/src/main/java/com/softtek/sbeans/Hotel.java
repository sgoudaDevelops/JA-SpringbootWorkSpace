package com.softtek.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hotel")
@Data
public class Hotel {
	@Value("12345")
	private Integer hotelId;
	@Value("${hotel.name}")
	private String hotelName;
	@Value("${hotel.addrs}")
	private String hotelAddrs;
	@Value("${hotel.contact}")
	private String contactno;
	@Value("${customer.name}")
	private String custname;
	@Value("#{menup.idlyprice+menup.dosaprice}") // Using the SPEL
//	@Value("12334")
	private Float billamount;
	@Value("${os.name}") // os.name is fixed system property keyprivate
	private String osName;
	@Value("${user.name}")
	private String windowUser;

}

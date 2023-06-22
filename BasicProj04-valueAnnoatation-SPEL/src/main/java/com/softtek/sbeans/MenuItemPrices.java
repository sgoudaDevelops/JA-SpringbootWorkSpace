package com.softtek.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menup")
@Data
@Lazy(true)
public class MenuItemPrices {
	@Value("${menu.dosarate}")
	private Float dosaprice;
	@Value("${menu.idlyrate}")
	private Float idlyprice;
	@Value("${menu.poharate}")
	private Float pohaprice;
	@Value("${menu.vprate}")
	private Float vadaprice;

}

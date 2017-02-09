package com.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
	
	@GetMapping(value="/")
	public String getInventory(){
		return "Inventory";
	}
}

package com.info.client;

import com.info.beans.DallasStore;
import com.info.beans.Pizza;
import com.info.beans.PizzaStore;
import com.info.beans.TexasStore;
import com.info.cmd.DallasOven;
import com.info.cmd.DallasOvenCmdOff;
import com.info.cmd.DallasOvenCmdOn;
import com.info.cmd.RemoteControl;
import com.info.cmd.TexasOven;
import com.info.cmd.TexasOvenCmdOff;
import com.info.cmd.TexasOvenCmdOn;

public class OrderPizza {

	public static void main(String[] args) {
		
		PizzaStore dallas = new DallasStore();
		PizzaStore texas = new TexasStore();
		
		
		Pizza cheese = dallas.orderPizza("Cheese");
		
		Pizza veggiePizza = texas.orderPizza("veggies");
		
		System.out.println();
		System.out.println("Command pattern to switch off/on the oven ");
		//Command pattern to switch off/on the oven 
		RemoteControl control = new RemoteControl();
		DallasOven dallasOven = new DallasOven();
		TexasOven texasOven = new TexasOven();
		
		control.setCommand(new DallasOvenCmdOff(dallasOven));
		control.pressButton();
		
		control.setCommand(new DallasOvenCmdOn(dallasOven));
		control.pressButton();
		

		control.setCommand(new TexasOvenCmdOff(texasOven));
		control.pressButton();
		
		control.setCommand(new TexasOvenCmdOn(texasOven));
		control.pressButton();
		
		
	}
	
	
}

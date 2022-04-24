package com.design.behavioral.command;


import java.util.ArrayList;
import java.util.List;

//Client
public class CommandDemo {

	public static void main(String args[]) {

		Switch lightSwitch = new Switch();
		Light light = new Light();
		Light bedroomLight = new Light();
		Light kitchenLight = new Light();

		/*Command onCommand = new OnCommand(light);
		lightSwitch.storeAndExecute(onCommand); */

		System.out.println("<-----------Toggle Light---------------------->");
		Command toggleCommand = new ToggleCommand(bedroomLight);
		lightSwitch.storeAndExecute(toggleCommand);
		/*lightSwitch.storeAndExecute(toggleCommand);
		lightSwitch.storeAndExecute(toggleCommand);
		lightSwitch.storeAndExecute(toggleCommand);*/

		System.out.println("<------------All Lights--------------------->");
		List<Light> lights = new ArrayList<>();

		lights.add(bedroomLight);
		lights.add(kitchenLight);

		Command allLightCommand = new AllLightCommand(lights);
		lightSwitch.storeAndExecute(allLightCommand);
		lightSwitch.storeAndExecute(allLightCommand);
	}
}

/****** All Light command check if the Light is ON and then only perform Off operation
 * Try above code by uncommenting the commented lines ****/
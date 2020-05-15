package com.design.behavioral.command;

import java.util.List;

public class AllLightCommand implements Command {

    List<Light> lights;

    public AllLightCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light:lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}

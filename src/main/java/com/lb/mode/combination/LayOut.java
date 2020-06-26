package com.lb.mode.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuboyupi
 * @Date 2020-06-26
 * @Description
 */
public abstract class LayOut implements Component {

    private List<Component> componentList = new ArrayList<>();

    private String name;

    public LayOut(String name) {
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println(name);
        if(componentList != null && componentList.size()>0) {
            for(Component component : componentList) {
                component.render();
            }
        }
    }

    public LayOut addComponent(Component component) {
        this.componentList.add(component);
        return this;
    }

}

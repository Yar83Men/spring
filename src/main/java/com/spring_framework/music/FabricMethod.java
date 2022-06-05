package com.spring_framework.music;

import org.springframework.stereotype.Component;

@Component("fabricBean")
public class FabricMethod implements Music {
    private static final FabricMethod fabricMethod = new FabricMethod();
    private FabricMethod() {
    }

    public static FabricMethod getFabricMethod() {
        if (fabricMethod != null) {
            return fabricMethod;
        }
        return new FabricMethod();
    }

    @Override
    public String getSong() {
        return "Fabric method";
    }

    @Override
    public String toString() {
        return "FabricMethod";
    }
}

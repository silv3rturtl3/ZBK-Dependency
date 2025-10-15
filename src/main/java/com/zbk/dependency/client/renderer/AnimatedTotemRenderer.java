package com.zbk.dependency.client.renderer;

import com.zbk.dependency.items.AnimatedTotemItem;
import com.zbk.dependency.client.model.AnimatedTotemModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class AnimatedTotemRenderer extends GeoItemRenderer<AnimatedTotemItem> {
    public AnimatedTotemRenderer() {
        super(new AnimatedTotemModel());
    }
}

package com.zbk.dependency.client.model;

import com.zbk.dependency.items.AnimatedTotemItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AnimatedTotemModel extends GeoModel<AnimatedTotemItem> {
    @Override
    public ResourceLocation getModelResource(AnimatedTotemItem object) {
        return new ResourceLocation("zbk_dependency", "geo/animated_totem.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AnimatedTotemItem object) {
        return new ResourceLocation("zbk_dependency", "textures/item/animated_totem.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AnimatedTotemItem animatable) {
        return new ResourceLocation("zbk_dependency", "animations/animated_totem.animation.json");
    }
}

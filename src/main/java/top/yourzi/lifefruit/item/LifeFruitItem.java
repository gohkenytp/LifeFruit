package top.yourzi.lifefruit.item;


import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class LifeFruitItem extends Item {
    public LifeFruitItem(Properties properties) {
        super(properties.food(new FoodProperties.Builder()
                .nutrition(10)
                .saturationMod(0.75f)
                .alwaysEat()
                .build()));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> pTooltipComponents, TooltipFlag flagIn) {

        pTooltipComponents.add(Component.translatable("tooltip.lifefruit.when_eat"));
        pTooltipComponents.add(Component.translatable("tooltip.lifefruit.life_fruit"));

        super.appendHoverText(stack,worldIn, pTooltipComponents, flagIn);
    }

}

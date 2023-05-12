package com.mowmaster.mbim.MBIMConfigs;

import com.mowmaster.mbim.mbim;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import org.apache.commons.lang3.tuple.Pair;

public class MBIMConfig
{
    public static class Common {

        public final ForgeConfigSpec.IntValue nodeGrowthChance;


        Common(ForgeConfigSpec.Builder builder) {
            builder.comment("Crystals").push("Crystal");

            nodeGrowthChance = builder
                    .comment("Crystal Node Growth Chance (1/X)")
                    .defineInRange("maxChance", 5, 0, Integer.MAX_VALUE);
            builder.pop();
        }
    }

    public static final ForgeConfigSpec commonSpec;
    public static final Common COMMON;

    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        commonSpec = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    @SubscribeEvent
    public static void onLoad(final ModConfigEvent.Loading configEvent) {
        mbim.LOGGER.debug("Loaded MBIM config file {}", configEvent.getConfig().getFileName());
    }

    @SubscribeEvent
    public static void onFileChange(final ModConfigEvent.Reloading configEvent) {
        mbim.LOGGER.debug("MBIM config just got changed on the file system!");
    }
}

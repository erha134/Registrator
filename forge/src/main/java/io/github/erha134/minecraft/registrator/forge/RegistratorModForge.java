package io.github.erha134.minecraft.registrator.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.erha134.minecraft.registrator.RegistratorMod;
import io.github.erha134.minecraft.registrator.client.RegistratorModClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RegistratorMod.MOD_ID)
public final class RegistratorModForge {
    public RegistratorModForge(Dist dist) {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(RegistratorMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        RegistratorMod.init();

        if (dist.isClient()) {
            RegistratorModClient.initClient();
        }
    }
}

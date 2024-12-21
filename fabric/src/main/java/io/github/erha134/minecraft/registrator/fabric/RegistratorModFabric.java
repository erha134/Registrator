package io.github.erha134.minecraft.registrator.fabric;

import io.github.erha134.minecraft.registrator.RegistratorMod;
import net.fabricmc.api.ModInitializer;

public final class RegistratorModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        RegistratorMod.init();
    }
}

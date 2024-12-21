package io.github.erha134.minecraft.registrator.fabric.client;

import io.github.erha134.minecraft.registrator.client.RegistratorModClient;
import net.fabricmc.api.ClientModInitializer;

public final class RegistratorModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RegistratorModClient.initClient();
    }
}

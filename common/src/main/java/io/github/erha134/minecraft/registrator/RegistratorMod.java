package io.github.erha134.minecraft.registrator;

import dev.architectury.platform.Platform;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class RegistratorMod {
    public static final String MOD_ID = "registrator";
    public static final String MOD_NAME = "Registrator Mod";
    public static final String MOD_VERSION = Platform.getMod(MOD_ID).getVersion();
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
    }
}

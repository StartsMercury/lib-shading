package com.github.startsmercury.libshading.entrypoint;

import static com.github.startsmercury.libshading.LibShading.CLIENT_LOGGER;

import net.fabricmc.api.ClientModInitializer;

public final class LibShadingClientMod implements ClientModInitializer {
	private static LibShadingClientMod instance;

	public static LibShadingClientMod getInstance() {
		if (instance == null) {
			throw new IllegalStateException("Accessed LibShadingClientMod too early");
		}

		return instance;
	}

	public LibShadingClientMod() {
		CLIENT_LOGGER.debug("Constructing mod initializer...");
		CLIENT_LOGGER.debug("Mod initializer constructed.");
	}

	@Override
	public void onInitializeClient() {
		CLIENT_LOGGER.debug("Initializing mod...");

		instance = this;

		CLIENT_LOGGER.info("Mod initialized.");
	}
}

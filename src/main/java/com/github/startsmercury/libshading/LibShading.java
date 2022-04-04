package com.github.startsmercury.libshading;

import static net.fabricmc.api.EnvType.CLIENT;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.Environment;

public final class LibShading {
	public static final String MODID = "lib-shading";

	@Environment(CLIENT)
	public static final String CLIENT_MODID = "lib-shading+client";

	@Environment(CLIENT)
	public static final Logger CLIENT_LOGGER = LoggerFactory.getLogger(CLIENT_MODID);
}

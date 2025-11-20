package com.redfox.helloworldmod;

import com.redfox.helloworldmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldMod implements ModInitializer {
	public static final String MOD_ID = "hello-world-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
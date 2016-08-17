
package com.rayzr522.quake;

import com.rayzr522.bglib.commands.CommandBuilder;
import com.rayzr522.bglib.commands.preset.PresetCommands;
import com.rayzr522.bglib.minigame.Minigame;
import com.rayzr522.bglib.minigame.MinigameConfig;
import com.rayzr522.bglib.plugin.MinigamePlugin;

public class Quake extends MinigamePlugin {

	private MinigameConfig	config;
	public static Quake		instance;

	@Override
	public void onPluginLoad() {

		instance = this;

		minigame = Minigame.builder(this, config).add(new BTest()).build();

		commandHandler.autoSetup();

	}

	@Override
	public void onPluginUnload() {
	}

	@Override
	public void registerCommands() {

		CommandBuilder.create(commandHandler).addList(PresetCommands.Setup.All).addList(PresetCommands.Game.All).build();

	}

}

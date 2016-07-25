
package com.rayzr522.quake;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerDropItemEvent;

import com.rayzr522.bglib.building.BEvent;

public class BTest extends BEvent {

	public BTest() {
		super(PlayerDropItemEvent.class);
	}

	@Override
	public void call(Event event) {
		if (!isEventClass(event)) { return; }

		PlayerDropItemEvent e = (PlayerDropItemEvent) event;
		
		if (e.getItemDrop().getItemStack().getType() == Material.SULPHUR) {
			
			Item item = e.getItemDrop();
			
			item.getWorld().createExplosion(item.getLocation(), 10f, false);
			
		}

	}

}

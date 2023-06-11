package spam.in.chat;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ExampleMod implements ModInitializer {

	// an instance of our new item
	public static final Item CUSTOM_ITEM =
			Registry.register(Registries.ITEM, new Identifier("spam", "spam"),
					new Item(new FabricItemSettings().maxCount(127)));
	@Override
	public void onInitialize() {
	}
}
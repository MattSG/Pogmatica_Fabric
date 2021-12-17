package net.fabricmc.pogmatica.common;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.pogmatica.item.ModGroups;

public class Utils {
    public static FabricItemSettings GetDefaultSettings() {
        return new FabricItemSettings().group(ModGroups.DEFAULT);
    }
}

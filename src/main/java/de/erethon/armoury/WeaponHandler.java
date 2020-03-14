package de.erethon.armoury;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class WeaponHandler {
    public WeaponType getWeaponType(Player p) {
        ItemStack weapon = p.getInventory().getItemInMainHand();
        if (weapon.getType() == Material.BOW) {
            return WeaponType.ARROW;
        }
        if (!(weapon.getItemMeta() == null) && weapon.getItemMeta().hasLore()) {
            String lore = weapon.getItemMeta().getLore().get(0);
            if (lore.contains("Dolch")) {
                return WeaponType.DAGGER;
            }
            if (lore.contains("Rapier")) {
                return WeaponType.RAPIER;
            }
            if (lore.contains("Katana")) {
                return WeaponType.KATANA;
            }
            if (lore.contains("Ritterschwert")) {
                return WeaponType.KNIGHT;
            }
            if (lore.contains("Langschwert")) {
                return WeaponType.LONG;
            }
            if (lore.contains("Streitaxt")) {
                return WeaponType.AXE;
            } else {
                return WeaponType.INVALID;
            }
        } else {
            return WeaponType.INVALID;
        }
    }
}

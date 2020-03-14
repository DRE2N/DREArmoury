package de.erethon.armoury;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public class ArmorHandler {
    public ArmorType getArmorType(Player p, EquipmentSlot slot) {
        ItemStack helmet = p.getInventory().getHelmet();
        ItemStack chest = p.getInventory().getChestplate();
        ItemStack leg = p.getInventory().getLeggings();
        ItemStack boot = p.getInventory().getBoots();
        switch (slot) {
            case HEAD:
                if (helmet != null) {
                    if (!(helmet.getItemMeta() == null) && helmet.getItemMeta().hasLore()) {
                        String lore = helmet.getItemMeta().getLore().get(0);
                        if ((helmet.getType() == Material.LEATHER_HELMET) && !(lore.contains("Leinenrüstung"))) { // GEHT NICHT
                            return ArmorType.LEATHER;
                        }
                        if (lore.contains("Leinenrüstung")){
                            return ArmorType.LINEN;
                        }
                        if (lore.contains("Kettenrüstung")){
                            return ArmorType.CHAIN;
                        }
                        if (lore.contains("Schuppenrüstung")){
                            return ArmorType.SCALE;
                        }
                        if (lore.contains("Plattenrüstung")){
                            return ArmorType.PLATE;
                        }
                        else {
                            return ArmorType.INVALID;
                        }
                    }
                    else {
                        return ArmorType.INVALID;
                    }
                }
                else {
                    return ArmorType.INVALID;
                }
            case CHEST:
                if (chest != null) {
                    if (chest.getItemMeta().hasLore()) {
                        String lore = chest.getItemMeta().getLore().get(0);
                        if ((chest.getType() == Material.LEATHER_CHESTPLATE) && !(lore.contains("Leinenrüstung"))) {
                            return ArmorType.LEATHER;
                        }
                        if (lore.contains("Leinenrüstung")){
                            return ArmorType.LINEN;
                        }
                        if (lore.contains("Kettenrüstung")){
                            return ArmorType.CHAIN;
                        }
                        if (lore.contains("Schuppenrüstung")){
                            return ArmorType.SCALE;
                        }
                        if (lore.contains("Plattenrüstung")){
                            return ArmorType.PLATE;
                        }
                        else {
                            return ArmorType.INVALID;
                        }
                    }
                    else {
                        return ArmorType.INVALID;
                    }
                }
                else {
                    return ArmorType.INVALID;
                }
            case LEGS:
                if (leg != null) {
                    if (leg.getItemMeta().hasLore()) {
                        String lore = leg.getItemMeta().getLore().get(0);
                        if ((leg.getType() == Material.LEATHER_LEGGINGS) && !(lore.contains("Leinenrüstung"))) {
                            return ArmorType.LEATHER;
                        }
                        if (lore.contains("Leinenrüstung")){
                            return ArmorType.LINEN;
                        }
                        if (lore.contains("Kettenrüstung")){
                            return ArmorType.CHAIN;
                        }
                        if (lore.contains("Schuppenrüstung")){
                            return ArmorType.SCALE;
                        }
                        if (lore.contains("Plattenrüstung")){
                            return ArmorType.PLATE;
                        }
                        else {
                            return ArmorType.INVALID;
                        }
                    }
                    else {
                        return ArmorType.INVALID;
                    }
                }
                else {
                    return ArmorType.INVALID;
                }
            case FEET:
                if (boot != null) {
                    if (boot.getItemMeta().hasLore()) {
                        String lore = boot.getItemMeta().getLore().get(0);
                        if ((boot.getType() == Material.LEATHER_BOOTS) && !(lore.contains("Leinenrüstung"))) {
                            return ArmorType.LEATHER;
                        }
                        if (lore.contains("Leinenrüstung")){
                            return ArmorType.LINEN;
                        }
                        if (lore.contains("Kettenrüstung")){
                            return ArmorType.CHAIN;
                        }
                        if (lore.contains("Schuppenrüstung")){
                            return ArmorType.SCALE;
                        }
                        if (lore.contains("Plattenrüstung")){
                            return ArmorType.PLATE;
                        }
                        else {
                            return ArmorType.INVALID;
                        }
                    }
                    else {
                        return ArmorType.INVALID;
                    }
                }
                else {
                    return ArmorType.INVALID;
                }
            default:
                return ArmorType.INVALID;
        }

    }
}

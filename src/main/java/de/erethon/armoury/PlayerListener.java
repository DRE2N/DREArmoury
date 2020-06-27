package de.erethon.armoury;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.EquipmentSlot;

public class PlayerListener implements Listener {
    ArmorHandler armorHandler = new ArmorHandler();
    WeaponHandler weaponHandler = new WeaponHandler();
    DamageCalculation dmgcalc = new DamageCalculation();

    @EventHandler
    public void pvpHandler(EntityDamageByEntityEvent event) {
        final Entity damager = event.getDamager();
        final Entity damaged = event.getEntity();
        double dmg = event.getDamage();
        double armorreduction;
        double finaldmg;
        Player pDmg = null;
        Player pVict;
        if ((damager instanceof Player || damager instanceof Projectile) && (damaged instanceof Player)) {
            pVict = (Player) damaged;
            if (event.getCause() == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION) {
                return;
            }

            if ((event.getCause() == EntityDamageEvent.DamageCause.PROJECTILE)) {
                    Projectile projectile = (Projectile)event.getDamager();
                    if (projectile.getShooter() instanceof Player) {
                        pDmg = (Player) projectile.getShooter();
                }
            }
            else {
                pDmg = (Player) damager;
            }

            if (pDmg != null) {
                WeaponType weapon = weaponHandler.getWeaponType(pDmg);
                ArmorType armorHead = armorHandler.getArmorType(pVict, EquipmentSlot.HEAD);
                ArmorType armorChest = armorHandler.getArmorType(pVict, EquipmentSlot.CHEST);
                ArmorType armorLegs = armorHandler.getArmorType(pVict, EquipmentSlot.LEGS);
                ArmorType armorFeet = armorHandler.getArmorType(pVict, EquipmentSlot.FEET);

                armorreduction = dmgcalc.calcDmg(weapon, armorHead) * dmgcalc.calcDmg(weapon, armorChest) * dmgcalc.calcDmg(weapon, armorLegs) *  dmgcalc.calcDmg(weapon, armorFeet);
                finaldmg = dmg * armorreduction;
                event.setDamage(finaldmg);

            }
        }
    }

}

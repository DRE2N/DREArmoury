package de.erethon.armoury.config;

import de.erethon.armoury.DREArmoury;
import org.bukkit.configuration.file.FileConfiguration;

import java.lang.reflect.Field;

import static org.bukkit.Bukkit.getLogger;

public class Config {

    // Lederrüstung
    public float leatherDagger;
    public float leatherRapier;
    public float leatherKatana;
    public float leatherKnight;
    public float leatherLong;
    public float leatherAxe;
    public float leatherArrow;

    // Leinenrüstung
    public float linenDagger;
    public float linenRapier;
    public float linenKatana;
    public float linenKnight;
    public float linenLong;
    public float linenAxe;
    public float linenArrow;

    // Kettenrüstung
    public float chainDagger;
    public float chainRapier;
    public float chainKatana;
    public float chainKnight;
    public float chainLong;
    public float chainAxe;
    public float chainArrow;

    // Schuppenrüstung
    public float scaleDagger;
    public float scaleRapier;
    public float scaleKatana;
    public float scaleKnight;
    public float scaleLong;
    public float scaleAxe;
    public float scaleArrow;

    // Plattenrüstung
    public float plateDagger;
    public float plateRapier;
    public float plateKatana;
    public float plateKnight;
    public float plateLong;
    public float plateAxe;
    public float plateArrow;

    public boolean debugMode;




    public void loadConfig(DREArmoury plugin) {
        FileConfiguration cfg = plugin.getConfig();
        leatherDagger = (float) cfg.getDouble("armor.leather.dagger");
        leatherRapier = (float) cfg.getDouble("armor.leather.rapier");
        leatherKatana = (float) cfg.getDouble("armor.leather.katana");
        leatherKnight = (float) cfg.getDouble("armor.leather.knight");
        leatherLong = (float) cfg.getDouble("armor.leather.long");
        leatherAxe = (float) cfg.getDouble("armor.leather.axe");
        leatherArrow = (float) cfg.getDouble("armor.leather.arrow");

        linenDagger = (float) cfg.getDouble("armor.linen.dagger");
        linenRapier = (float) cfg.getDouble("armor.linen.rapier");
        linenKatana = (float) cfg.getDouble("armor.linen.katana");
        linenKnight = (float) cfg.getDouble("armor.linen.knight");
        linenLong = (float) cfg.getDouble("armor.linen.long");
        linenAxe = (float) cfg.getDouble("armor.linen.axe");
        linenArrow = (float) cfg.getDouble("armor.linen.arrow");

        chainDagger = (float) cfg.getDouble("armor.chain.dagger");
        chainRapier = (float) cfg.getDouble("armor.chain.rapier");
        chainKatana = (float) cfg.getDouble("armor.chain.katana");
        chainKnight = (float) cfg.getDouble("armor.chain.knight");
        chainLong = (float) cfg.getDouble("armor.chain.long");
        chainAxe = (float) cfg.getDouble("armor.chain.axe");
        chainArrow = (float) cfg.getDouble("armor.chain.arrow");

        scaleDagger = (float) cfg.getDouble("armor.scale.dagger");
        scaleRapier = (float) cfg.getDouble("armor.scale.rapier");
        scaleKatana = (float) cfg.getDouble("armor.scale.katana");
        scaleKnight = (float) cfg.getDouble("armor.scale.knight");
        scaleLong = (float) cfg.getDouble("armor.scale.long");
        scaleAxe = (float) cfg.getDouble("armor.scale.axe");
        scaleArrow = (float) cfg.getDouble("armor.scale.arrow");

        plateDagger = (float) cfg.getDouble("armor.plate.dagger");
        plateRapier = (float) cfg.getDouble("armor.plate.rapier");
        plateKatana = (float) cfg.getDouble("armor.plate.katana");
        plateKnight = (float) cfg.getDouble("armor.plate.knight");
        plateLong = (float) cfg.getDouble("armor.plate.long");
        plateAxe = (float) cfg.getDouble("armor.plate.axe");
        plateArrow = (float) cfg.getDouble("armor.plate.arrow");

        debugMode = cfg.getBoolean("debug");

    }

    public void save(DREArmoury plugin) {
        FileConfiguration cfg = plugin.getConfig();
        cfg.set("armor.leather.dagger", leatherDagger);
        cfg.set("armor.leather.rapier" , leatherRapier);
        cfg.set("armor.leather.katana", leatherKatana);
        cfg.set("armor.leather.knight", leatherKnight);
        cfg.set("armor.leather.long", leatherLong);
        cfg.set("armor.leather.axe", leatherAxe);
        cfg.set("armor.leather.arrow", leatherArrow);

        cfg.set("armor.linen.dagger", linenDagger);
        cfg.set("armor.linen.rapier", linenRapier);
        cfg.set("armor.linen.katana", linenKatana);
        cfg.set("armor.linen.knight", linenKnight);
        cfg.set("armor.linen.long", linenLong);
        cfg.set("armor.linen.axe", linenAxe);
        cfg.set("armor.linen.arrow", linenArrow);

        cfg.set("armor.chain.dagger", chainDagger);
        cfg.set("armor.chain.rapier", chainRapier);
        cfg.set("armor.chain.katana", chainKatana);
        cfg.set("armor.chain.knight", chainKnight);
        cfg.set("armor.chain.long", chainLong);
        cfg.set("armor.chain.axe", chainAxe);
        cfg.set("armor.chain.arrow", chainArrow);

        cfg.set("armor.scale.dagger", scaleDagger);
        cfg.set("armor.scale.rapier", scaleRapier);
        cfg.set("armor.scale.katana", scaleKatana);
        cfg.set("armor.scale.knight", scaleKnight);
        cfg.set("armor.scale.long", scaleLong);
        cfg.set("armor.scale.axe", scaleAxe);
        cfg.set("armor.scale.arrow", scaleArrow);

        cfg.set("armor.plate.dagger", plateDagger);
        cfg.set("armor.plate.rapier", plateRapier);
        cfg.set("armor.plate.katana", plateKatana);
        cfg.set("armor.plate.knight", plateKnight);
        cfg.set("armor.plate.long", plateLong);
        cfg.set("armor.plate.axe", plateAxe);
        cfg.set("armor.plate.arrow", plateArrow);

        plugin.saveConfig();
        getLogger().info("Saved changes to config");


    }

    public boolean isDebugMode() {return debugMode; }
    public float getLeatherDagger() {return leatherDagger; }
    public float getLeatherRapier() {return leatherRapier; }
    public float getLeatherKatana() {return leatherKatana; }
    public float getLeatherKnight() {return leatherKnight; }
    public float getLeatherLong() {  return leatherLong; }
    public float getLeatherAxe() {   return leatherAxe; }
    public float getLeatherArrow() { return leatherArrow; }

    public float getLinenDagger() {return linenDagger; }
    public float getLinenRapier() {return linenRapier; }
    public float getLinenKatana() {return linenKatana; }
    public float getLinenKnight() {return linenKnight; }
    public float getLinenLong() {  return linenLong; }
    public float getLinenAxe() {   return linenAxe; }
    public float getLinenArrow() { return linenArrow; }

    public float getChainDagger() {return chainDagger; }
    public float getChainRapier() {return chainRapier; }
    public float getChainKatana() {return chainKatana; }
    public float getChainKnight() {return chainKnight; }
    public float getChainLong() {  return chainLong; }
    public float getChainAxe() {   return chainAxe; }
    public float getChainArrow() { return chainArrow; }

    public float getScaleDagger() {return scaleDagger; }
    public float getScaleRapier() {return scaleRapier; }
    public float getScaleKatana() {return scaleKatana; }
    public float getScaleKnight() {return scaleKnight; }
    public float getScaleLong() {  return scaleLong; }
    public float getScaleAxe() {   return scaleAxe; }
    public float getScaleArrow() { return scaleArrow; }

    public float getPlateDagger() {return plateDagger; }
    public float getPlateRapier() {return plateRapier; }
    public float getPlateKatana() {return plateKatana; }
    public float getPlateKnight() {return plateKnight; }
    public float getPlateLong() {  return plateLong; }
    public float getPlateAxe() {   return plateAxe; }
    public float getPlateArrow() { return plateArrow; }

    public void setValue (String var, float value) throws NoSuchFieldException, IllegalAccessException {
        Field field = getClass().getDeclaredField(var);
        field.setFloat(this, value);
    }

    public float getValue (String var) throws NoSuchFieldException, IllegalAccessException {
        Field field = getClass().getDeclaredField(var);
        return field.getFloat(this);
    }
}

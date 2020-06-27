package de.erethon.armoury;

import de.erethon.armoury.config.Config;

public class DamageCalculation {
    public double calcDmg(WeaponType wpn, ArmorType arm) {
        DREArmoury main = DREArmoury.getInstance();
        Config cfg = main.getDREConfig();
        switch (arm) {
            case LEATHER:
                switch (wpn) {
                    case INVALID:
                        return 1;
                    case DAGGER:
                        return cfg.getLeatherDagger();
                    case RAPIER:
                        return cfg.getLeatherRapier();
                    case KATANA:
                        return cfg.getLeatherKatana();
                    case KNIGHT:
                        return cfg.getLeatherKnight();
                    case LONG:
                        return cfg.getLeatherLong();
                    case AXE:
                        return cfg.getLeatherAxe();
                    case ARROW:
                        return cfg.getLeatherArrow();
                }
            case LINEN:
                switch (wpn) {
                    case INVALID:
                        return 1;
                    case DAGGER:
                        return cfg.getLinenDagger();
                    case RAPIER:
                        return cfg.getLinenRapier();
                    case KATANA:
                        return cfg.getLinenKatana();
                    case KNIGHT:
                        return cfg.getLinenKnight();
                    case LONG:
                        return cfg.getLinenLong();
                    case AXE:
                        return cfg.getLinenAxe();
                    case ARROW:
                        return cfg.getLinenArrow();
                }
            case CHAIN:
                switch (wpn) {
                    case INVALID:
                        return 1;
                    case DAGGER:
                        return cfg.getChainDagger();
                    case RAPIER:
                        return cfg.getChainRapier();
                    case KATANA:
                        return cfg.getChainKatana();
                    case KNIGHT:
                        return cfg.getChainKnight();
                    case LONG:
                        return cfg.getChainLong();
                    case AXE:
                        return cfg.getChainAxe();
                    case ARROW:
                        return cfg.getChainArrow();
                }
            case SCALE:
                switch (wpn) {
                    case INVALID:
                        return 1;
                    case DAGGER:
                        return cfg.getScaleDagger();
                    case RAPIER:
                        return cfg.getScaleRapier();
                    case KATANA:
                        return cfg.getScaleKatana();
                    case KNIGHT:
                        return cfg.getScaleKnight();
                    case LONG:
                        return cfg.getScaleLong();
                    case AXE:
                        return cfg.getScaleAxe();
                    case ARROW:
                        return cfg.getScaleArrow();
                }
            case PLATE:
                switch (wpn) {
                    case INVALID:
                        return 1;
                    case DAGGER:
                        return cfg.getPlateDagger();
                    case RAPIER:
                        return cfg.getPlateRapier();
                    case KATANA:
                        return cfg.getPlateKatana();
                    case KNIGHT:
                        return cfg.getPlateKnight();
                    case LONG:
                        return cfg.getPlateLong();
                    case AXE:
                        return cfg.getPlateAxe();
                    case ARROW:
                        return cfg.getPlateArrow();
                }
            case INVALID:
            default:
                return 1;
        }
    }
}

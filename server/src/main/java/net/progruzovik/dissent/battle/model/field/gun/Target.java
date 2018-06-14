package net.progruzovik.dissent.battle.model.field.gun;

import net.progruzovik.dissent.battle.model.util.Cell;
import org.springframework.lang.NonNull;

public final class Target {

    private final @NonNull Cell cell;
    private final double hittingChance;

    public Target(@NonNull Cell cell, double hittingChance) {
        this.cell = cell;
        this.hittingChance = hittingChance;
    }

    @NonNull
    public Cell getCell() {
        return cell;
    }

    public double getHittingChance() {
        return hittingChance;
    }
}

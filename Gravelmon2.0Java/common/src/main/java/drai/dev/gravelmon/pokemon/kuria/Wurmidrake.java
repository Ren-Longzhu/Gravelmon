package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Wurmidrake extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wurmidrake() {
        super("Wurmidrake",
                Type.BUG,Type.DRAGON,
                new Stats(47,
                        60,
                        46,
                        50,
                        46,
                        51),
                List.of(Ability.INTIMIDATE,Ability.OVERCOAT), Ability.WEAK_ARMOR,
                5, 56,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It silently feeds on leaves seemingly without end. Though small and weak, it somehow projects a rather menacing aura."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wurmidrake");

    }


}
package drai.dev.gravelmon.pokemon.mystis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Prismativern extends drai.dev.gravelmon.pokemon.Pokemon {
    public Prismativern() {
        super("Prismativern",
                Type.FAIRY,Type.DRAGON,
                new Stats(100,
                        90,
                        90,
                        150,
                        100,
                        140),
                List.of(Ability.PRISMATICPOWER), Ability.PRISMATICPOWER,
                176, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It clashed with Abyssalvern and disappeared over the horizon, where remnants of its power became the sky. In legends, it is said that during a great moment of crisis, it will wipe the world clean of impurity, beginning the genesis of a new world. The world's fate depends on its people; would they live on through the crisis, or would they perish within a supernova of light?"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAINBOWRUSH,1),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Prismativern");

    }


}
package drai.dev.gravelmon.pokemon.mastenia;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Fredoron extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fredoron() {
        super("Fredoron",
                Type.DRAGON, Type.ELECTRIC,
                new Stats(120,
                        90,
                        110,
                        140,
                        80,
                        60),
                List.of(Ability.ANALYTIC), Ability.HEAVY_METAL,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fredoron");

    }


}

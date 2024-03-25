package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Mohavi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mohavi() {
        super("Mohavi",
                Type.GRASS,Type.LIGHT,
                new Stats(53,
                        80,
                        72,
                        51,
                        54,
                        70),
                List.of(Ability.FLUORESCENCE), Ability.FLUORESCENCE,
                13, 473,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                103, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.GRASS),
                List.of(""),
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
           setLangFileName("Mohavi");

    }


}
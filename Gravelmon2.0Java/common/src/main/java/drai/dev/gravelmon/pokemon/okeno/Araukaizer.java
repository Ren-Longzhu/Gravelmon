package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Araukaizer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Araukaizer() {
        super("Araukaizer",
                Type.GRASS, Type.ICE,
                new Stats(84,
                        124,
                        94,
                        104,
                        90,
                        40),
                List.of(Ability.SNOW_WARNING), Ability.FIREPROOF,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("Bamboo ShotSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BAMBOOSHOT,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Araukaizer");

    }


}

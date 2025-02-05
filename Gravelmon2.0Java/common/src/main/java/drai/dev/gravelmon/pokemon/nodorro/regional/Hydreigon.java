package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Hydreigon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hydreigon(int dex) {
        super(dex, "Hydreigon",
                Type.DARK, Type.DRAGON,
                new Stats(92,
                        105,
                        90,
                        125,
                        90,
                        98),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Draco MeteorSTAB Dragon"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hydreigon");

    }


}

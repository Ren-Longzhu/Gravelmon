package drai.dev.gravelmon.pokemon.mongratis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Tsushimi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tsushimi() {
        super("Tsushimi",
                Type.DRAGON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Concept, design, sprites, and type by Princess-Phoenix Name assist credit to Tenrio This fakemon originates from Princess-Phoenix's 'Project Freemon' on DeviantArt. Evo line: Complete"),
                List.of(),
                List.of(                        ),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tsushimi");

    }


}

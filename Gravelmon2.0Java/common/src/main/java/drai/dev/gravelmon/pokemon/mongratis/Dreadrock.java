package drai.dev.gravelmon.pokemon.mongratis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Dreadrock extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dreadrock() {
        super("Dreadrock",
                Type.ROCK, Type.DRAGON,
                new Stats(65,
                        75,
                        90,
                        55,
                        60,
                        50),
                List.of(Ability.SOLID_ROCK), Ability.ROCK_HEAD,
                11, 1068,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Concept, Design, Name, Type, Species, Abilities, Height, Weight, Evolution Level, Dex Entry, and Base Stats by Smiley Fakemon. Front sprite TheGreatZeKro These designs/sprites are originally from the Fakemon Festival Pack. Evo line: Complete"),
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
           setLangFileName("Dreadrock");

    }


}

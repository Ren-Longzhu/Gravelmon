package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Younoes extends drai.dev.gravelmon.pokemon.Pokemon {
    public Younoes() {
        super("Younoes",
                Type.GHOST, Type.PSYCHIC,
                new Stats(80,
                        35,
                        55,
                        85,
                        80,
                        70),
                List.of(Ability.KEEN_EYE,Ability.FOREWARN), Ability.LEVITATE,
                16, 108,
                new Stats(0,0,0,2,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Younoes can pass through walls allowing them to sneak into homes and scare the people living there, though they have never been recorded harming anybody."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Younoes");

    }


}

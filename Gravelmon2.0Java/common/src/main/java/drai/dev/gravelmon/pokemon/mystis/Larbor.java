package drai.dev.gravelmon.pokemon.mystis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Larbor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Larbor() {
        super("Larbor",
                Type.GRASS, Type.BUG,
                new Stats(90,
                        50,
                        75,
                        85,
                        85,
                        40),
                List.of(Ability.OVERGROW), Ability.TRIAGE,
                0, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                149, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Larbor");

    }


}

package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Fountier extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fountier() {
        super("Fountier",
                Type.WATER,
                new Stats(54,
                        35,
                        57,
                        96,
                        82,
                        47),
                List.of(Ability.RAIN_DISH), Ability.DRIZZLE,
                11, 320,
                new Stats(0,0,0,2,0,0), 120,
                0.0,
                130, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of("Fountier are able to control their waterflow much easier than before; allowing it to focus harder on battling."),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fountier");

    }


}

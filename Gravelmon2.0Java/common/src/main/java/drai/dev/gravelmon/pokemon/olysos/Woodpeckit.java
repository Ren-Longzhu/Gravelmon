package drai.dev.gravelmon.pokemon.olysos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Woodpeckit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Woodpeckit() {
        super("Woodpeckit",
                Type.NORMAL, Type.FLYING,
                new Stats(35,
                        60,
                        40,
                        30,
                        30,
                        60),
                List.of(Ability.KEEN_EYE,Ability.RIVALRY), Ability.SNIPER,
                4, 22,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                50, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Their nests consist mainly of nutshells. These are stuffed then with soft leaves for a comfortable hatching place."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Woodpeckit");

    }


}

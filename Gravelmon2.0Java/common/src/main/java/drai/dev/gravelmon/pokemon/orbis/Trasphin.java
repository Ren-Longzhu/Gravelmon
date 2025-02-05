package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Trasphin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Trasphin() {
        super("Trasphin",
                Type.GHOST, Type.POISON,
                new Stats(60,
                        50,
                        55,
                        80,
                        80,
                        70),
                List.of(Ability.WEAK_ARMOR), Ability.WEAK_ARMOR,
                0, 0,
                new Stats(0,0,0,1,1,0), 130,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Years of ocean pollution have caused Trasphin to absorb toxins and oil into their bodies to adapt. They are full of sludge that they expel out of their bottle like noses."),
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
           setLangFileName("Trasphin");

    }


}

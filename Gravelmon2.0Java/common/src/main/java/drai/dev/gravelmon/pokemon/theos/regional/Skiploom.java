package drai.dev.gravelmon.pokemon.theos.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Skiploom extends drai.dev.gravelmon.pokemon.Pokemon {
    public Skiploom(int dex) {
        super(dex, "Skiploom",
                Type.GROUND, Type.GRASS,
                new Stats(80,
                        45,
                        50,
                        45,
                        65,
                        55),
                List.of(Ability.UNNERVE,Ability.HARVEST), Ability.DRY_SKIN,
                10, 4,
                new Stats(2,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Theosian Skiploom have hallow bodies filled with straw. They can often be seen jumping through the fields of farms."),
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
           setLangFileName("Skiploom");

    }


}

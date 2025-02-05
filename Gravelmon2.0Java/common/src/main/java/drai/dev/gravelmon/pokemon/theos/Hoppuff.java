package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Hoppuff extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hoppuff() {
        super("Hoppuff",
                Type.FAIRY,
                new Stats(75,
                        60,
                        55,
                        60,
                        55,
                        70),
                List.of(Ability.CUTE_CHARM,Ability.FRIEND_GUARD), Ability.CLOUD_NINE,
                6, 90,
                new Stats(2,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hoppuff can jump quiet high due to their springy legs. Don't be fooled by their cute appearance; Hoppuff can pack quite a punch with their ears."),
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
           setLangFileName("Hoppuff");

    }


}

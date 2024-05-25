package drai.dev.gravelmon.pokemon.pastelisland;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Nymfly extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nymfly() {
        super("Nymfly",
                Type.BUG,
                new Stats(35,
                        25,
                        35,
                        50,
                        35,
                        40),
                List.of(Ability.SHIELD_DUST), Ability.BERSERK,
                11, 28,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                44, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.DRAGON),
                List.of("Their thick scales are like metal, to protect their soft fragile bodies. By increasing their internal body temperature, they can shoot small flames like a dragon."),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nymfly");

    }


}

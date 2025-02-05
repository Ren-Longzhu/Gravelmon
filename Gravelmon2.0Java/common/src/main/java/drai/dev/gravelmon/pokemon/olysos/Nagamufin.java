package drai.dev.gravelmon.pokemon.olysos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Nagamufin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nagamufin() {
        super("Nagamufin",
                Type.GRASS, Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.TOXIC_DEBRIS,Ability.STICKY_HOLD), Ability.CUTE_CHARM,
                4, 72,
                new Stats(1,0,0,0,0,0), 235,
                0.0,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.AMORPHOUS),
                List.of("Legend has it that anyone who gazes directly into its eyes is instantly paralyzed. To avoid this, Nagamufin often keeps its eyes hidden, but it can use them to sense the emotions and intentions of others, allowing it to anticipate and playfully prank them."),
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
           setLangFileName("Nagamufin");

    }


}

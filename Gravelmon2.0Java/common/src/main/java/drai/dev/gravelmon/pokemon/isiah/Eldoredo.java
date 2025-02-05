package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Eldoredo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eldoredo() {
        super("Eldoredo",
                Type.ROCK, Type.STEEL,
                new Stats(92,
                        83,
                        100,
                        82,
                        128,
                        45),
                List.of(Ability.JACKPOT), Ability.JACKPOT,
                8, 165,
                new Stats(0,0,0,0,0,0),50,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Eldoredo");

    }


}

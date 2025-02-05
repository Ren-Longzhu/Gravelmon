package drai.dev.gravelmon.pokemon.mystis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Quetsun extends drai.dev.gravelmon.pokemon.Pokemon {
    public Quetsun() {
        super("Quetsun",
                Type.FLYING, Type.DRAGON,
                new Stats(100,
                        130,
                        70,
                        110,
                        70,
                        120),
                List.of(Ability.GALE_WINGS), Ability.PRIDEFULSTANCE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is said that when Quetsun flies overhead, the sun will emit colourful rays of light. When Quetsun flaps its wings, the wind it produces fills the earth with abundant greenery and sprouts of life."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_ENERGY,1),
                        new MoveLearnSetEntry(Move.JUNGLE_HEALING,1),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Quetsun");

    }


}

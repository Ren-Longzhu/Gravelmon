package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Nurturse extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nurturse() {
        super("Nurturse",
                Type.FAIRY,
                new Stats(140,
                        65,
                        60,
                        80,
                        80,
                        65),
                List.of(Ability.NATURAL_CURE,Ability.REGENERATOR,Ability.HEALER), Ability.HEALER,
                8, 165,
                new Stats(2,0,0,0,0,0), 0,
                0.25,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FAIRY),
                List.of("Nurturse will do everything in their power to help another Pokemon feel better and get well. With a special ability, they can give their life power to another Pokemon to save them."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nurturse");

    }


}

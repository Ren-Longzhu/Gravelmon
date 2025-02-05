package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Baldy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Baldy() {
        super("Baldy",
                Type.NORMAL,
                new Stats(110,
                        55,
                        40,
                        35,
                        55,
                        28),
                List.of(Ability.LIMBER), Ability.LIMBER,
                6, 76,
                new Stats(2,0,0,0,0,0), 150,
                0.5,
                113, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Baldy's skin are like rubber, giving them superb defenses. They use their round bodies to bounce around like balls. They are kept at pre-schools because of their extremely high tollerance to childish behaviour."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AFTER_YOU,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.BODY_SLAM,1),
                        new MoveLearnSetEntry(Move.BOUNCE,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Baldy");

    }


}

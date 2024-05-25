package drai.dev.gravelmon.pokemon.ultraspace;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Kabrookie extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kabrookie() {
        super("Kabrookie",
                Type.DARK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Kabrookie acts on stage, fighting and performing art. They start young to master their skills early."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TEETER_DANCE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,1),
                        new MoveLearnSetEntry(Move.AFTER_YOU,4),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,8),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,13),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,17),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,21),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,26),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,29),
                        new MoveLearnSetEntry(Move.DARK_PULSE,36)                        ),
                List.of(Label.ULTRASPACE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kabrookie");

    }


}

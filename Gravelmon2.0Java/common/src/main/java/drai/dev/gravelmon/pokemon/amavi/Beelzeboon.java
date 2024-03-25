package drai.dev.gravelmon.pokemon.amavi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

public class Beelzeboon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Beelzeboon() {
        super("Beelzeboon",
                Type.FIRE,Type.DARK,
                new Stats(75,
                        120,
                        70,
                        75,
                        60,
                        130),
                List.of(Ability.BLAZE), Ability.PRANKSTER,
                18, 726,
                new Stats(0,1,0,0,0,2), 45,
                0.5,
                235, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("Location: Groveridge (Starter)"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.TAUNT,9),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,20),
                        new MoveLearnSetEntry(Move.FAKE_OUT,27),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,32),
                        new MoveLearnSetEntry(Move.CRUNCH,42),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,48)                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Beelzeboon");

    }


}
package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Beastalk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Beastalk() {
        super("Beastalk",
                Type.GRASS,
                new Stats(70,
                        90,
                        55,
                        75,
                        55,
                        60),
                List.of(Ability.OVERGROW), Ability.HARVEST,
                8, 165,
                new Stats(0,1,0,1,0,0), 45,
                0.75,
                140, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("When it lost its signature scent, it was forced to move around more to find food, enhancing its predatorial instincts."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,3),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.SNAP_TRAP,10),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,11),
                        new MoveLearnSetEntry(Move.INGRAIN,15),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,17),
                        new MoveLearnSetEntry(Move.SEED_BOMB,21),
                        new MoveLearnSetEntry(Move.SLAM,25),
                        new MoveLearnSetEntry(Move.LEECH_SEED,28),
                        new MoveLearnSetEntry(Move.SYNTHESIS,30),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,31),
                        new MoveLearnSetEntry(Move.CRUNCH,34),
                        new MoveLearnSetEntry(Move.LEAF_STORM,40),
                        new MoveLearnSetEntry(Move.OUTRAGE,46),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm")                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Beastalk");

    }


}
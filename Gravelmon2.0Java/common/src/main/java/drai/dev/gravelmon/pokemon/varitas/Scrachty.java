package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Scrachty extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scrachty() {
        super("Scrachty",
                Type.FLYING,Type.GROUND,
                new Stats(65,
                        90,
                        115,
                        45,
                        115,
                        58),
                List.of(Ability.BIG_PECKS,Ability.OVERCOAT), Ability.WEAK_ARMOR,
                11, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("As long as the nest of mud and thorns around its lower half is in good shape, it struts around confidently and carefree. When it's not spending time maintaining its nest, it tends to the comb on its head instead."),
                List.of(),
                List.of( new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.POWER_TRIP,4),
                        new MoveLearnSetEntry(Move.MUDSLAP,8),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,12),
                        new MoveLearnSetEntry(Move.PLUCK,16),
                        new MoveLearnSetEntry(Move.TAUNT,20),
                        new MoveLearnSetEntry(Move.MAGNITUDE,24),
                        new MoveLearnSetEntry(Move.DRILL_PECK,28),
                        new MoveLearnSetEntry(Move.SWAGGER,32),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,36),
                        new MoveLearnSetEntry(Move.DEFOG,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"egg"),
                        new MoveLearnSetEntry(Move.ROOST,"egg"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.SPITE,"egg"),
                        new MoveLearnSetEntry(Move.TAILWIND,"egg")
                ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 39, 60, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Scrachty");
setCanFly(true);
    }


}

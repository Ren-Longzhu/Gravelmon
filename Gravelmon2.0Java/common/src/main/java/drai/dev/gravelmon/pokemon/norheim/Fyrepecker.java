package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Fyrepecker extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fyrepecker() {
        super("Fyrepecker",
                Type.FLYING,Type.FIRE,
                new Stats(65,
                        115,
                        65,
                        75,
                        65,
                        80),
                List.of(Ability.BIG_PECKS,Ability.SKILL_LINK,Ability.STEELWORKER), Ability.STEELWORKER,
                8, 165,
                new Stats(0,2,0,0,0,0), 25,
                0.5,
                163, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("- EmberSTAB Fire - Leer Normal - PluckSTAB Flying - Fury Attack Normal 12 Flurry PeckSTAB Flying 16 Flame BurstSTAB Fire 20 Screech Normal 26 Steel Wing Steel 30 Feather Dance Flying 34 Blaze ArrowSTAB Fire 38 Roost Flying 44 Drill PeckSTAB Flying 48 Smart Strike Steel 54 Swords Dance Normal 58 Drill Run Ground 64 Flare BlitzSTAB Fire"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FURY_ATTACK,1),
                        new MoveLearnSetEntry(Move.FLURRYPECK,12),
                        new MoveLearnSetEntry(Move.FLAME_BURST,16),
                        new MoveLearnSetEntry(Move.SCREECH,20),
                        new MoveLearnSetEntry(Move.STEEL_WING,26),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,30),
                        new MoveLearnSetEntry(Move.BLAZEARROW,34),
                        new MoveLearnSetEntry(Move.ROOST,38),
                        new MoveLearnSetEntry(Move.DRILL_PECK,44),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,48),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,54),
                        new MoveLearnSetEntry(Move.DRILL_RUN,58),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,64)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fyrepecker");

    }


}
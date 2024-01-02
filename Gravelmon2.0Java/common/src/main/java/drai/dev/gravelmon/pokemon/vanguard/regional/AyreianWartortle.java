package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class AyreianWartortle extends Pokemon {
    public AyreianWartortle(int dexNo) {
        super(dexNo,"AyreianWartortle",
                Type.FIGHTING, Type.STEEL,
                new Stats(59, 88, 90, 58, 45, 65),
                List.of(Ability.BULLETPROOF, Ability.SHELL_ARMOR), Ability.GUTS,
                10, 225,
                new Stats(0,0,2,0,0,0), 45,
                0.875,
                124, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER, EggGroup.DRAGON),
                List.of("It takes great care of its golden horns, symbol of its pride. The shinier those horns are, the more respect a Wartortle gets in its colony."),
                List.of(new EvolutionEntry("ayreianblastoise", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.METAL_CLAW, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 1),
                        new MoveLearnSetEntry(Move.KARATE_CHOP, 3),
                        new MoveLearnSetEntry(Move.IRON_BARB, 5),
                        new MoveLearnSetEntry(Move.WITHDRAW, 6),
                        new MoveLearnSetEntry(Move.ROLLOUT, 8),
                        new MoveLearnSetEntry(Move.RAPID_SPIN, 12),
                        new MoveLearnSetEntry(Move.FORCE_PALM, 16),
                        new MoveLearnSetEntry(Move.PROTECT, 21),
                        new MoveLearnSetEntry(Move.STORM_THROW, 25),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM, 30),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 35),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH, 42),
                        new MoveLearnSetEntry(Move.BODY_PRESS, 49),
                        new MoveLearnSetEntry(Move.IRON_TAIL, 56),

                        new MoveLearnSetEntry(Move.AQUA_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, "tutor"),
                        new MoveLearnSetEntry(Move.AVALANCHE, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_PRESS, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.CRUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.DARK_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DIVE, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE, "tutor"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.GYRO_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE, "tutor"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SURF, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH, "tutor")
                ),
                List.of(Label.GEN1,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 29, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Wartortle");
    }
}

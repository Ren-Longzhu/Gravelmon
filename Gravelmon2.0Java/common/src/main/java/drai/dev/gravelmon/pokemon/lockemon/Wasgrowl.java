package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Wasgrowl extends Pokemon {
    public Wasgrowl() {
        super("Wasgrowl",
                Type.WATER, Type.STEEL,
                new Stats(60,
                        95,
                        60,
                        50,
                        65,
                        90),
                List.of(Ability.HAUNTING, Ability.STRONG_JAW), Ability.POWER_WITHIN,
                17, 121,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                167, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(new EvolutionEntry("worcane", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))),
                List.of(
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.ASTONISH,7),
                        new MoveLearnSetEntry(Move.METAL_CLAW,10),
                        new MoveLearnSetEntry(Move.AQUA_JET,13),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,17),
                        new MoveLearnSetEntry(Move.DIVE,21),
                        new MoveLearnSetEntry(Move.IRON_HEAD,25),
                        new MoveLearnSetEntry(Move.ACROBATICS,29),
                        new MoveLearnSetEntry(Move.ENCORE,34),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,39),
                        new MoveLearnSetEntry(Move.MIST,44),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,50),
                        new MoveLearnSetEntry(Move.BOOMBURST,"egg"),
                        new MoveLearnSetEntry(Move.BOUNCE,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.TICKLE,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 25, 45, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setAvoidsLand(true);
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }
}

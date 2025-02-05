package drai.dev.gravelmon.pokemon.mongratis.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Cryogonal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cryogonal(int dex) {
        super(dex, "Cryogonal",
                Type.ICE,
                new Stats(80,
                        50,
                        50,
                        95,
                        135,
                        105),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                11, 1480,
                new Stats(0,0,0,0,2,0), 25,
                0.0,
                170, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("When its body temperature goes up, it turns into steam and vanishes. When its temperature lowers, it returns to ice."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BIND,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.SHARPEN,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,5),
                        new MoveLearnSetEntry(Move.HAZE,9),
                        new MoveLearnSetEntry(Move.MIST,9),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,13),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,17),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,21),
                        new MoveLearnSetEntry(Move.ICE_BEAM,25),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,29),
                        new MoveLearnSetEntry(Move.REFLECT,33),
                        new MoveLearnSetEntry(Move.SLASH,37),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,41),
                        new MoveLearnSetEntry(Move.RECOVER,45),
                        new MoveLearnSetEntry(Move.FREEZEDRY,49),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,50),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,53),
                        new MoveLearnSetEntry(Move.SHEER_COLD,57),
                        new MoveLearnSetEntry(Move.BIND,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,"tm")                        ),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cryogonal");

    }


}

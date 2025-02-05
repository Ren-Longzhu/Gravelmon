package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Maggotle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Maggotle() {
        super("Maggotle",
                Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SWARM,Ability.KEEN_EYE,Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                3, 165,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("rocurl", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"14")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,5),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,10),
                        new MoveLearnSetEntry(Move.BUG_BITE,15),
                        new MoveLearnSetEntry(Move.PINCH,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 17, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maggotle");

    }


}

package drai.dev.gravelmon.pokemon.crozoic;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Chainscraw extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chainscraw() {
        super("Chainscraw",
                Type.WATER, Type.STEEL,
                new Stats(70,
                        125,
                        100,
                        45,
                        80,
                        75),
                List.of(Ability.HYPER_CUTTER), Ability.STORM_DRAIN,
                18, 982,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of("The speed at which it can strike with its pincers is unmatched, able to shear a log in half in a blink. To keep the edges of its pincers sharp, it will claim a specific rock face as its personal whetstone."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PINCH,1),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,1),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,1),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,1),
                        new MoveLearnSetEntry(Move.XSCISSOR,1),
                        new MoveLearnSetEntry(Move.AQUA_CUTTER,1),
                        new MoveLearnSetEntry(Move.HARDPRESS,1),
                        new MoveLearnSetEntry(Move.VISE_GRIP,1),
                        new MoveLearnSetEntry(Move.GUILLOTINE,1),
                        new MoveLearnSetEntry(Move.METAL_SOUND,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chainscraw");

    }


}

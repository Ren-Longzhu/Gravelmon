package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Traffimite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Traffimite() {
        super("Traffimite",
                Type.ELECTRIC, Type.PSYCHIC,
                new Stats(25,
                        35,
                        70,
                        95,
                        55,
                        45),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 60,
                new Stats(0,0,0,1,0,0), 190,
                0.0,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("- Signal Beam Bug - PsybeamSTAB Psychic - Thunder ShockSTAB Electric"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PSYBEAM,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Traffimite");

    }


}

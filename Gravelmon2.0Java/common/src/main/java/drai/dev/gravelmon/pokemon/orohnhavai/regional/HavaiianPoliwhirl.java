package drai.dev.gravelmon.pokemon.orohnhavai.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class HavaiianPoliwhirl extends drai.dev.gravelmon.pokemon.Pokemon {
    public HavaiianPoliwhirl() {
        super("HavaiianPoliwhirl",
                Type.GHOST, Type.WATER,
                new Stats(50,
                        65,
                        65,
                        50,
                        65,
                        90),
                List.of(Ability.SWIFT_SWIM,Ability.CLEAR_BODY,Ability.INFILTRATOR), Ability.INFILTRATOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("On moonless nights, they swim actively on the lake's surface hoping to catch some food. There has been stories about late night swimmers in the lake that turn up missing."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Poliwhirl");

    }


}

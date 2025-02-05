package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Duelleon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Duelleon() {
        super("Duelleon",
                Type.FIGHTING, Type.STEEL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.DEFIANT), Ability.SHEER_FORCE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Duelleon was raised for battle and stood on the front lines during the great Ionian war. Its weapon and armor is one with its body. The cause of this is unknown but legends say that Duelleon evolved next to human elite soldiers during the time of war."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_TAIL,1)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Duelleon");

    }


}

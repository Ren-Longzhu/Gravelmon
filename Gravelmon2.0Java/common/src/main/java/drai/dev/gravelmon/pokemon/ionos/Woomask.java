package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Woomask extends drai.dev.gravelmon.pokemon.Pokemon {
    public Woomask() {
        super("Woomask",
                Type.GHOST,
                new Stats(40,
                        30,
                        75,
                        75,
                        75,
                        39),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Whenever a child gets lost in the wilderness, never to return, a Woomask may be found. If found, the finder must bring this mask Pokémon to the closest village. Then, the story has to be told to all children around so that they can bring this Pokémon through the land in the future to come."),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Woomask");

    }


}

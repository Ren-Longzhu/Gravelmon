package drai.dev.gravelmon.pokemon.olysos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Allnown extends drai.dev.gravelmon.pokemon.Pokemon {
    public Allnown() {
        super("Allnown",
                Type.PSYCHIC,
                new Stats(90,
                        70,
                        70,
                        150,
                        100,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                33, 1600,
                new Stats(0,0,0,2,1,0), 15,
                0.5,
                1250, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It appeared as the maker of the Unown and stores all their knowledge that they learn outside like an encyclopedia. It uses these to communicate with humans."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Allnown");

    }


}

package drai.dev.gravelmon.pokemon.terranov;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class VaalHazak extends drai.dev.gravelmon.pokemon.Pokemon {
    public VaalHazak() {
        super("VaalHazak",
                Type.GHOST, Type.POISON,
                new Stats(90,
                        90,
                        90,
                        130,
                        130,
                        70),
                List.of(Ability.PATHOGENIC), Ability.PATHOGENIC,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A grotesque Elder Dragon, that inhabits the deepest part of the Rotten Vale. It uses the fatal vapor of the vale in what appears to be a symbiotic relationship."),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Vaal Hazak");

    }


}

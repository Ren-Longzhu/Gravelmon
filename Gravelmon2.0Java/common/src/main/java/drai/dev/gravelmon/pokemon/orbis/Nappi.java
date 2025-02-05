package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Nappi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nappi() {
        super("Nappi",
                Type.BUG,
                new Stats(20,
                        10,
                        10,
                        20,
                        20,
                        30),
                List.of(Ability.RATTLED), Ability.RATTLED,
                1, 3,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                38, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Nappi spend their whole early lives living in fear of just about anything. They hide in dumpsters where they feed on old food scraps."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,8)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nappi");

    }


}

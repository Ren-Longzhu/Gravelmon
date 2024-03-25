package drai.dev.gravelmon.pokemon.ionos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Gormhyena extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gormhyena() {
        super("Gormhyena",
                Type.GROUND,Type.DARK,
                new Stats(101,
                        85,
                        96,
                        56,
                        80,
                        50),
                List.of(Ability.GLUTTONY,Ability.THICK_FAT), Ability.MOXIE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("This lazy Pokémon rather order food from its pre evolved form than to go on a hunt itself. Whenever Gormhyena is brought any food it never shares it with the rest of the pack. This always results in a fight."),
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
           setLangFileName("Gormhyena");

    }


}
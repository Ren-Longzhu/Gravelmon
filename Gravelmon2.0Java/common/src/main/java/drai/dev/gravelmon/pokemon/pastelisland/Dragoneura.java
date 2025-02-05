package drai.dev.gravelmon.pokemon.pastelisland;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Dragoneura extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dragoneura() {
        super("Dragoneura",
                Type.BUG, Type.DRAGON,
                new Stats(80,
                        78,
                        80,
                        90,
                        80,
                        86),
                List.of(Ability.SHIELD_DUST), Ability.BERSERK,
                26, 210,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                222, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.DRAGON),
                List.of("Dragoneura have a tough shell and powerful jaws, making them ferocious predators, on top of powerful wings means these Pokémon are a force to reckoned with."),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dragoneura");

    }


}

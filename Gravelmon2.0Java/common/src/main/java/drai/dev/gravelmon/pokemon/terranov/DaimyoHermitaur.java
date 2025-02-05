package drai.dev.gravelmon.pokemon.terranov;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class DaimyoHermitaur extends drai.dev.gravelmon.pokemon.Pokemon {
    public DaimyoHermitaur() {
        super("DaimyoHermitaur",
                Type.WATER, Type.GROUND,
                new Stats(85,
                        60,
                        120,
                        90,
                        75,
                        60),
                List.of(Ability.SHELL_ARMOR), Ability.SHELL_ARMOR,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It defends itself by protecting its face with with its huge hard claws, deflecting any move thrown at it. It utilizes the skull of other large creatures it finds buried as its shell, its favorite being Monoblos'."),
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
           setLangFileName("Daimyo Hermitaur");

    }


}

package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Quillit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Quillit() {
        super("Quillit",
                Type.NORMAL,
                new Stats(55,
                        48,
                        63,
                        25,
                        41,
                        38),
                List.of(Ability.RUN_AWAY,Ability.ROUGH_SKIN), Ability.SCRAPPY,
                3, 39,
                new Stats(0,0,1,0,0,0), 240,
                0.5,
                54, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Quillit are shy and timid. When they get startled, they will curl up into a ball and harden their quills to ward off predators."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Quillit");

    }


}

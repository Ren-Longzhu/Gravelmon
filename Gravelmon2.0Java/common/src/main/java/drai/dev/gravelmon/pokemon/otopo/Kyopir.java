package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Kyopir extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kyopir() {
        super("Kyopir",
                Type.DARK, Type.FAIRY,
                new Stats(80,
                        86,
                        63,
                        75,
                        67,
                        79),
                List.of(Ability.INNER_FOCUS,Ability.FOREWARN), Ability.UNDERLING,
                0, 0,
                new Stats(1,1,0,0,0,0), 0,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Crime syndicates utilise Kyopir to construct blockades and hinder police involvement. It is quite obstinate and will only fight if they are given something in return."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kyopir");

    }


}

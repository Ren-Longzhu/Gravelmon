package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mosstatic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mosstatic() {
        super("Mosstatic",
                Type.GRASS, Type.ELECTRIC,
                new Stats(80,
                        20,
                        20,
                        70,
                        222,
                        36),
                List.of(Ability.CHLOROPHYLL,Ability.STATIC,Ability.SIMPLE), Ability.SIMPLE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Crop Circle Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CROPCIRCLE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mosstatic");

    }


}

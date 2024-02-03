package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Novil extends drai.dev.gravelmon.pokemon.Pokemon {
    public Novil() {
        super("Novil",
                Type.GHOST,Type.DARK,
                new Stats(75,
                        30,
                        70,
                        30,
                        70,
                        35),
                List.of(Ability.CURSED_BODY), Ability.INTIMIDATE,
                8, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.0,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It is said that if you stare into its eye for long enough, you will have visions of unspeakable horrors from the past."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,7),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,13),
                        new MoveLearnSetEntry(Move.HYPNOSIS,17),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,22),
                        new MoveLearnSetEntry(Move.ASSURANCE,27),
                        new MoveLearnSetEntry(Move.DARK_PULSE,34),
                        new MoveLearnSetEntry(Move.MEMENTO,40)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Novil");

    }


}
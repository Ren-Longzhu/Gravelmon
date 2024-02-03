package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Kroach extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kroach() {
        super("Kroach",
                Type.BUG,Type.DARK,
                new Stats(42,
                        40,
                        46,
                        36,
                        56,
                        20),
                List.of(Ability.OVERCOAT,Ability.PICKPOCKET,Ability.RATTLED), Ability.RATTLED,
                8, 165,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                46, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Kroach are nasty bugs that infest and raid kitchens of unaware trainers, and sometimes restaurants. Their numbers flourish in dark places. Behind the cloak of night, they quickly amass and overrun any location they choose to colonize."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.ASSURANCE,6),
                        new MoveLearnSetEntry(Move.BUG_BITE,11),
                        new MoveLearnSetEntry(Move.BIDE,15)                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kroach");

    }


}
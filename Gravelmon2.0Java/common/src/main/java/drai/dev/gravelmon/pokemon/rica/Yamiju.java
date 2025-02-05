package drai.dev.gravelmon.pokemon.rica;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Yamiju extends drai.dev.gravelmon.pokemon.Pokemon {
    public Yamiju() {
        super("Yamiju",
                Type.DARK,
                new Stats(116,
                        154,
                        90,
                        120,
                        90,
                        110),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,3,0,0,0,0), 3,
                0.0,
                306, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("- BiteSTAB Dark - Scary Face Normal 6 Dragon Breath Dragon 13 SnarlSTAB Dark 19 Frustration Normal 25 Roar Normal 31 Sucker PunchSTAB Dark 37 Nasty Plot Dark 44 Shadow Sneak Ghost 50 CrunchSTAB Dark 56 Torment Dark 62 Power TripSTAB Dark 70 Outrage Dragon 77 Foul PlaySTAB Dark 84 Dragon Tail Dragon"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,6),
                        new MoveLearnSetEntry(Move.SNARL,13),
                        new MoveLearnSetEntry(Move.FRUSTRATION,19),
                        new MoveLearnSetEntry(Move.ROAR,25),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,31),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,37),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,44),
                        new MoveLearnSetEntry(Move.CRUNCH,50),
                        new MoveLearnSetEntry(Move.TORMENT,56),
                        new MoveLearnSetEntry(Move.POWER_TRIP,62),
                        new MoveLearnSetEntry(Move.OUTRAGE,70),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,77),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,84)                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Yamiju");

    }


}

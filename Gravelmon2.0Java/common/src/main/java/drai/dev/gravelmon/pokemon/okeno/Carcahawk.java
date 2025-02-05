package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Carcahawk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Carcahawk() {
        super("Carcahawk",
                Type.FIRE, Type.FLYING,
                new Stats(70,
                        94,
                        72,
                        92,
                        72,
                        98),
                List.of(Ability.FLASH_FIRE,Ability.FIERYSPIRIT,Ability.DROUGHT), Ability.DROUGHT,
                8, 165,
                new Stats(0,1,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Carcahawk can fly at amazing speeds. Not only that, the fire from its wings lets it adjust the pressure of air currents, which gives it more control when soaring."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MORNING_SUN,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.SETTINGSUN,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,"tm"),
                        new MoveLearnSetEntry(Move.SKY_DROP,"tm"),
                        new MoveLearnSetEntry(Move.FEATHERRUSH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Carcahawk");

    }


}

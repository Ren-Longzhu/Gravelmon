package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Turmoilet extends drai.dev.gravelmon.pokemon.Pokemon {
    public Turmoilet() {
        super("Turmoilet",
                Type.WATER,
                new Stats(85,
                        65,
                        30,
                        120,
                        80,
                        50),
                List.of(Ability.STORM_DRAIN,Ability.RAIN_DISH,Ability.CLEAR_BODY), Ability.CLEAR_BODY,
                8, 165,
                new Stats(0,0,0,2,1,0), 110,
                0.5,
                133, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.WATER_1),
                List.of("As a coprophage, it lives in sewers where its food source is most plentiful. Rumors of a 'butt-eating monster' tend to follow Turmoilet sightings in cities."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ACID,6),
                        new MoveLearnSetEntry(Move.WATER_GUN,8),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.MUD_SHOT,16),
                        new MoveLearnSetEntry(Move.SLUDGE,18),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,21),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,26),
                        new MoveLearnSetEntry(Move.NATURESCALL,31),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,35),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,40),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,44),
                        new MoveLearnSetEntry(Move.PROTECT,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Turmoilet");

    }


}
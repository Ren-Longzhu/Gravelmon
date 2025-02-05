package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Digobite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Digobite() {
        super("Digobite",
                Type.ROCK, Type.GROUND,
                new Stats(32,
                        75,
                        50,
                        46,
                        40,
                        60),
                List.of(Ability.SAND_RUSH,Ability.JACKPOT,Ability.SPEED_BOOST), Ability.SPEED_BOOST,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("- FissureSTAB Ground - DigSTAB Ground - Rock SlideSTAB Rock - Rapid Spin Normal - Rock TombSTAB Rock - Metal Sound Steel - Rock BlastSTAB Rock - Metal Burst Steel - Power GemSTAB Rock - Flash Cannon Steel - Rock WreckerSTAB Rock - BulldozeSTAB Ground - Drill RunSTAB Ground - Rototiller Ground"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROTOTILLER,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.TOMBSTONER,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Digobite");

    }


}

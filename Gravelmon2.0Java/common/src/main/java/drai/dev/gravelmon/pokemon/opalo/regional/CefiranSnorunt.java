package drai.dev.gravelmon.pokemon.opalo.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class CefiranSnorunt extends Pokemon {
    public CefiranSnorunt(int dexNo) {
        super(dexNo,"CefiranSnorunt",
                Type.GROUND,
                new Stats(50,50,50,50,50,50),
                List.of(Ability.INNER_FOCUS, Ability.POISON_HEAL), Ability.MOODY,
                7, 168,
                new Stats(1,0,0,0,0,0), 190,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY, EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("CefiranGlalie", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42"))),
                        new EvolutionEntry("CefiranFroslass", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(), List.of(), "cobblemon:dawn_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, 4),
                        new MoveLearnSetEntry(Move.BITE, 10),
                        new MoveLearnSetEntry(Move.MUD_SHOT, 13),
                        new MoveLearnSetEntry(Move.HEADBUTT, 19),
                        new MoveLearnSetEntry(Move.PROTECT, 22),
                        new MoveLearnSetEntry(Move.MUD_BOMB, 28),
                        new MoveLearnSetEntry(Move.CRUNCH, 31),
                        new MoveLearnSetEntry(Move.EARTH_POWER, 37),
                        new MoveLearnSetEntry(Move.SANDSTORM, 40),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 46),
                        new MoveLearnSetEntry(Move.AVALANCHE, "egg"),
                        new MoveLearnSetEntry(Move.TACKLE, "egg"),
                        new MoveLearnSetEntry(Move.BLOCK, "egg"),
                        new MoveLearnSetEntry(Move.DISABLE, "egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, "egg"),
                        new MoveLearnSetEntry(Move.HEX, "egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT, "egg"),
                        new MoveLearnSetEntry(Move.SPIKES, "egg"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL, "egg")
                ),
                List.of(Label.GEN3,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 15, 41, 8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Snorunt");
    }
}

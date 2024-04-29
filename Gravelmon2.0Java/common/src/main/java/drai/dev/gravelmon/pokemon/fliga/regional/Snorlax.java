package drai.dev.gravelmon.pokemon.fliga.regional;


import drai.dev.gravelmon.pokemon.amavi.*;
import drai.dev.gravelmon.pokemon.dhiome.*;
import drai.dev.gravelmon.pokemon.mushi.*;
import drai.dev.gravelmon.pokemon.theos.*;
import drai.dev.gravelmon.pokemon.kuria.*;
import drai.dev.gravelmon.pokemon.ottora.*;
import drai.dev.gravelmon.pokemon.spion.*;
import drai.dev.gravelmon.pokemon.mastenia.*;
import drai.dev.gravelmon.pokemon.mongratis.*;
import drai.dev.gravelmon.pokemon.ultraspace.*;
import drai.dev.gravelmon.pokemon.urzavos.*;
import drai.dev.gravelmon.pokemon.terranov.*;
import drai.dev.gravelmon.pokemon.enjin.*;
import drai.dev.gravelmon.pokemon.mystis.*;
import drai.dev.gravelmon.pokemon.pastelisland.*;
import drai.dev.gravelmon.pokemon.neonintendo.*;
import drai.dev.gravelmon.pokemon.tokas.*;
import drai.dev.gravelmon.pokemon.panjaea.*;
import drai.dev.gravelmon.pokemon.cyare.*;
import drai.dev.gravelmon.pokemon.olysos.*;
import drai.dev.gravelmon.pokemon.nodorro.*;
import drai.dev.gravelmon.pokemon.orbis.*;
import drai.dev.gravelmon.pokemon.fliga.*;
import drai.dev.gravelmon.pokemon.ruskow.*;
import drai.dev.gravelmon.pokemon.otopo.*;
import drai.dev.gravelmon.pokemon.goetia.*;
import drai.dev.gravelmon.pokemon.ionos.*;
import drai.dev.gravelmon.pokemon.lagoone.*;
import drai.dev.gravelmon.pokemon.atlas.*;
import drai.dev.gravelmon.pokemon.avoris.*;
import drai.dev.gravelmon.pokemon.enriko.*;
import drai.dev.gravelmon.pokemon.ferroa.*;
import drai.dev.gravelmon.pokemon.hiza.*;
import drai.dev.gravelmon.pokemon.hub.*;
import drai.dev.gravelmon.pokemon.interregional.*;
import drai.dev.gravelmon.pokemon.isiah.*;
import drai.dev.gravelmon.pokemon.junnin.*;
import drai.dev.gravelmon.pokemon.lonava.*;
import drai.dev.gravelmon.pokemon.mythire.*;
import drai.dev.gravelmon.pokemon.nosto.*;
import drai.dev.gravelmon.pokemon.novrai.*;
import drai.dev.gravelmon.pokemon.oceane.*;
import drai.dev.gravelmon.pokemon.okeno.*;
import drai.dev.gravelmon.pokemon.orohnhavai.*;
import drai.dev.gravelmon.pokemon.qamor.*;
import drai.dev.gravelmon.pokemon.rica.*;
import drai.dev.gravelmon.pokemon.varitas.*;
import drai.dev.gravelmon.pokemon.aristos.*;
import drai.dev.gravelmon.pokemon.midamis.*;
import drai.dev.gravelmon.pokemon.norheim.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Snorlax extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snorlax(int dex) {
        super(dex, "Snorlax",
                Type.NORMAL,
                new Stats(160,
                        120,
                        65,
                        55,
                        100,
                        40),
                List.of(Ability.OBLIVIOUS,Ability.THICK_FAT), Ability.GLUTTONY,
                21, 4600,
                new Stats(2,0,0,0,0,0), 25,
                0.875,
                189, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Fligian Snorlax are a minor deviation from it's Kantoian cousins. It naps in a seemingly smug manner, somehow proud of it's laziness."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,4),
                        new MoveLearnSetEntry(Move.AMNESIA,9),
                        new MoveLearnSetEntry(Move.LICK,12),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,17),
                        new MoveLearnSetEntry(Move.YAWN,20),
                        new MoveLearnSetEntry(Move.BODY_SLAM,25),
                        new MoveLearnSetEntry(Move.SNORE,28),
                        new MoveLearnSetEntry(Move.REST,28),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,33),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,35),
                        new MoveLearnSetEntry(Move.ROLLOUT,36),
                        new MoveLearnSetEntry(Move.BLOCK,41),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,44),
                        new MoveLearnSetEntry(Move.CRUNCH,49),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,50),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,57),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.BLOCK,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.WATER_GUN,"tm"),
                        new MoveLearnSetEntry(Move.PAY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SUBMISSION,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.FISSURE,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,"tm"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"tm"),
                        new MoveLearnSetEntry(Move.PSYWAVE,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.DARKEST_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"tm"),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,"tm"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"tm"),
                        new MoveLearnSetEntry(Move.SCREECH,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tm"),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,"tm"),
                        new MoveLearnSetEntry(Move.LICK,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.BELCH,"tm")                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snorlax");

    }


}
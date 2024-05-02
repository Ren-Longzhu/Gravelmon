package drai.dev.gravelmon.games.pokemmo.firstbatch;

import drai.dev.gravelmon.pokemon.amavi.*;
import drai.dev.gravelmon.pokemon.attributes.*;
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

import java.util.*;

public class Oceane extends drai.dev.gravelmon.games.registry.Game {
    public Oceane() {
        super("Oceane");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Bublit());
        pokemon.add(new Nautilite());
        pokemon.add(new Tentalcyon(new Stats(537, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.SPEED))));
        pokemon.add(new Friney());
        pokemon.add(new Ripplier());
        pokemon.add(new Swordier());
        pokemon.add(new Nomstar());
        pokemon.add(new Disastar());
        pokemon.add(new Ferossicle(new Stats(542, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.HP))));
        pokemon.add(new Planten());
        pokemon.add(new Handren());
        pokemon.add(new Digdog());
        pokemon.add(new Groundhound(new Stats(432, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.DEFENCE))));
        pokemon.add(new Sweal());
        pokemon.add(new Fleezer());
        pokemon.add(new AFleezer());
        pokemon.add(new Swirlsea());
        pokemon.add(new Spirashell());
        pokemon.add(new Sealestial());
        pokemon.add(new Urchum());
        pokemon.add(new Urtichum());
        pokemon.add(new Parrosea());
        pokemon.add(new Nauticaw());
        pokemon.add(new Coronacaw());
        pokemon.add(new Reefam());
        pokemon.add(new Appendash());
        pokemon.add(new Nutsy());
        pokemon.add(new Jawson());
        pokemon.add(new Merbebi());
        pokemon.add(new Shrimpnotize(new Stats(457, StatArchetype.SPECIAL_ATTACKER,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.SPEED))));
        pokemon.add(new Phantamaron(new Stats(423, StatArchetype.FAST_SPECIAL_WALL,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Rayscal());
        pokemon.add(new Rayth());
        pokemon.add(new Minusplus());
        pokemon.add(new Siphonowar());
        pokemon.add(new Uphonowar());
        pokemon.add(new Cachaleen());
        pokemon.add(new Submalot());
        pokemon.add(new Porpice());
        pokemon.add(new Balacier());
        pokemon.add(new Armacle());
        pokemon.add(new Barbarrage());
        pokemon.add(new Snaptrap());
        pokemon.add(new Snaggrip());
        pokemon.add(new Merluscious());
        pokemon.add(new Spunch());
        pokemon.add(new Upporecut());
        pokemon.add(new Twintacle());
        pokemon.add(new Undallure());
        pokemon.add(new Ghoubloon());
        pokemon.add(new Drenchest());
        pokemon.add(new Medissin());
        pokemon.add(new Mambaboo());
        pokemon.add(new Floink());
//        pokemon.add(new AFloink()); Missing Stats
        pokemon.add(new Hypnode());
        pokemon.add(new Cupscape());
        pokemon.add(new Nodescape());
        pokemon.add(new Reefazoid());
        pokemon.add(new Amusea());
        pokemon.add(new Finfetti());
        pokemon.add(new Harlefin(new Stats(517, StatArchetype.SPECIAL_ATTACKER,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Ziptide());
        pokemon.add(new Moreen());
        pokemon.add(new Salpackin(new Stats(376, StatArchetype.FAST_SUPPORT,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.SPEED))));
//        pokemon.add(new ASalpackin()); Missing Stats
        pokemon.add(new Eletta());
        pokemon.add(new Sentresha());
        pokemon.add(new Origalleon());
        pokemon.add(new Tatatot());
        pokemon.add(new Drumbum());
        pokemon.add(new Symphonia());
        pokemon.add(new Camozoic());
        pokemon.add(new Churlice());
        pokemon.add(new Torchurn());
        pokemon.add(new Altarath());
        pokemon.add(new Topsee());
        pokemon.add(new Hallucid());
        pokemon.add(new Spectrance());
        pokemon.add(new Grasstache());
        pokemon.add(new Papalgae());
        pokemon.add(new Lavrassire());
        pokemon.add(new Mamagma());
        pokemon.add(new Kellyp());
        pokemon.add(new Ferrush(new Stats(498, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.SPEED))));
        pokemon.add(new Bwobble());
        pokemon.add(new Noxical());
        pokemon.add(new Venomenace());
        pokemon.add(new Octomuray(new Stats(484, StatArchetype.PHYSICAL_ATTACKER,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.DEFENCE))));
        pokemon.add(new Cycaroon());
        pokemon.add(new Argoceane());
        pokemon.add(new Dreadtyde());
        pokemon.add(new Abysside(new Stats(640, StatArchetype.SPECIAL_WALL,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.SPECIAL_ATTACK))));
    }

}

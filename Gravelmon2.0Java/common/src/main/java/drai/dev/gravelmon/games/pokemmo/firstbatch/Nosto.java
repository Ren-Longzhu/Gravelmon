package drai.dev.gravelmon.games.pokemmo.firstbatch;

import drai.dev.gravelmon.pokemon.amavi.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.dhiome.*;
import drai.dev.gravelmon.pokemon.mushi.*;
import drai.dev.gravelmon.pokemon.nosto.Brailien;
import drai.dev.gravelmon.pokemon.nosto.Carrauntain;
import drai.dev.gravelmon.pokemon.nosto.Cereboost;
import drai.dev.gravelmon.pokemon.nosto.Fauxmingo;
import drai.dev.gravelmon.pokemon.nosto.Marshun;
import drai.dev.gravelmon.pokemon.nosto.Sedinane;
import drai.dev.gravelmon.pokemon.nosto.Stalittle;
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


public class Nosto extends drai.dev.gravelmon.games.registry.Game {
    public Nosto() {
        super("Nosto");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Neschick());
        pokemon.add(new Phloxling());
        pokemon.add(new Mosstrich());
        pokemon.add(new Treetle());
        pokemon.add(new Tumball());
        pokemon.add(new Titanoss());
        pokemon.add(new Pepinch());
        pokemon.add(new Torpepo());
        pokemon.add(new Melauncher(new Stats(563, StatArchetype.PHYSICAL_WALL,
                List.of(Stats.StatType.DEFENCE))));
        pokemon.add(new Charrat());
        pokemon.add(new Blashrew());
        pokemon.add(new Explodent());
        pokemon.add(new Squiddle());
        pokemon.add(new Squignite());
        pokemon.add(new Cephlame());
        pokemon.add(new Drimp());
        pokemon.add(new Prawnee());
        pokemon.add(new Fabulusk());
        pokemon.add(new Cheekii());
        pokemon.add(new Grumpster());
        pokemon.add(new Ferasquab());
        pokemon.add(new Streedove());
        pokemon.add(new Urbigeon(new Stats(492, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(Stats.StatType.SPECIAL_ATTACK))));
        pokemon.add(new Principillar());
        pokemon.add(new Kookoon());
        pokemon.add(new Fluttereign());
        pokemon.add(new Larvake());
        pokemon.add(new Mockoon());
        pokemon.add(new Mimoth());
        pokemon.add(new Cherm());
        pokemon.add(new Cherrish());
        pokemon.add(new Denshirui());
        pokemon.add(new Melabuzz());
        pokemon.add(new Mieltz());
        pokemon.add(new Mieltzar(new Stats(405, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(Stats.StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Budcheep());
        pokemon.add(new Paratweet());
        pokemon.add(new Pinksqueek());
        pokemon.add(new Pinkaboo(new Stats(425, StatArchetype.BULKY_SUPPORT,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.SPEED))));
        pokemon.add(new Stalittle());
        pokemon.add(new Sedinane());
        pokemon.add(new Carrauntain(new Stats(501, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(Stats.StatType.ATTACK))));
        pokemon.add(new Tuburrow());
        pokemon.add(new Tunnelurm());
        pokemon.add(new Audibat());
        pokemon.add(new Chiraudio());
        pokemon.add(new Echolocave());
        pokemon.add(new Flintten());
        pokemon.add(new Scruffur());
        pokemon.add(new Olynx());
        pokemon.add(new Hairibble());
        pokemon.add(new Furrocious());
        pokemon.add(new Glyptic());
        pokemon.add(new Buttereef());
        pokemon.add(new Oarful());
        pokemon.add(new Pyrant());
        pokemon.add(new Piluma());
        pokemon.add(new Killarumi());
        pokemon.add(new Metalien());
        pokemon.add(new Lunetal());
        pokemon.add(new Galextrial());
        pokemon.add(new Shrimpond(new Stats(312, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.SPEED))));
        pokemon.add(new Pekaboo());
        pokemon.add(new Pitohood());
        pokemon.add(new Aviafel());
        pokemon.add(new Cursour());
        pokemon.add(new Frankensour());
//        pokemon.add(new Dragome()); Member of line Not Finished
        pokemon.add(new Halux());
        pokemon.add(new Visiangel());
        pokemon.add(new Marshun());
        pokemon.add(new Brailien());
        pokemon.add(new Cereboost(new Stats(567, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.SPEED))));
        pokemon.add(new Pix());
        pokemon.add(new PixE());
        pokemon.add(new PixL());
        pokemon.add(new Twinkluppy());
        pokemon.add(new Notillunar(new Stats(421, StatArchetype.FAST_SUPPORT,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.SPEED))));
//        pokemon.add(new dog());Member of line Not Finished
        pokemon.add(new Rosinella());
        pokemon.add(new Sinsenella());
        pokemon.add(new Dysmerella());
        pokemon.add(new Signapsi());
        pokemon.add(new Reneuron());
        pokemon.add(new Brainergy());
        pokemon.add(new Primmella());
        pokemon.add(new Primmadame());
        pokemon.add(new Primmoiselle());
        pokemon.add(new Plasduck());
        pokemon.add(new Fauxmingo());
        pokemon.add(new Swandola());
        pokemon.add(new Buldough());
        pokemon.add(new Duggout());

        pokemon.add(new Seasaw());
        pokemon.add(new Chainjaw());
        pokemon.add(new Atlarv());
        pokemon.add(new Atlagon());
        pokemon.add(new Pigstyk());
        pokemon.add(new Lumboar());
        pokemon.add(new Hogstead());
        pokemon.add(new Planebe());
        pokemon.add(new Staurbor());
        pokemon.add(new Mantaqua());
        pokemon.add(new Merineon());
        pokemon.add(new Teslax());
        pokemon.add(new Zexalax());
        pokemon.add(new Diagem());
        pokemon.add(new Cephalotox());
        pokemon.add(new Feiring());
        pokemon.add(new Pendelf());
        pokemon.add(new Encrona());
        pokemon.add(new Tilow());
        pokemon.add(new Candhoul());
        pokemon.add(new Chandemise());
        pokemon.add(new Novil());
        pokemon.add(new Azatome());
        pokemon.add(new Necromanos());
        pokemon.add(new Vaniteeny());
        pokemon.add(new Boodoir());
        pokemon.add(new Maspook());
        pokemon.add(new Cresprit());
        pokemon.add(new Spectmare());
        pokemon.add(new Suravi());
        pokemon.add(new Pzeigon());
    }

}

package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.infinity.regional.*;
import drai.dev.gravelmon.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

public class GenerationFive extends Original {
    public GenerationFive() {
        super("generation5");
    }

    @Override
    public void registerPokemon() {
        //Pokemon Infinity
        pokemon.add(new EhgoTrubbish(568));
        pokemon.add(new EhgoGarbodor(569));

        //Pokemon Insurgance
        pokemon.add(new DeltaSnivy(495));
        pokemon.add(new DeltaServine(496));
        pokemon.add(new DeltaSerperior(497));
        pokemon.add(new DeltaPurrloin(509));
        pokemon.add(new DeltaLiepard(510));
        pokemon.add(new DeltaVenipede(543));
        pokemon.add(new DeltaWhirlipede(544));
        pokemon.add(new DeltaScolipede(545));
        pokemon.add(new DeltaWaterPetilil(548));
        pokemon.add(new DeltaWaterLilligant(549));
        pokemon.add(new DeltaFairyPetilil(548));
        pokemon.add(new DeltaFairyLilligant(549));
        pokemon.add(new DeltaDarumaka(554));
        pokemon.add(new DeltaDarmanitan(555));
        pokemon.add(new DeltaMaractus(556));
        pokemon.add(new DeltaBerryDwebble(557));
        pokemon.add(new DeltaBerryCrustle(558));
        pokemon.add(new DeltaCakeDwebble(557));
        pokemon.add(new DeltaCakeCrustle(558));
        pokemon.add(new DeltaScraggy(559));
        pokemon.add(new DeltaScrafty(560));
        pokemon.add(new DeltaYamask(562));
        pokemon.add(new DeltaCofagrigus(563));
        pokemon.add(new DeltaSolosis(577));
        pokemon.add(new DeltaDuosion(578));
        pokemon.add(new DeltaReuniclus(579));
        pokemon.add(new DeltaEmolga(587));
        pokemon.add(new DeltaKarrablast(588));
        pokemon.add(new DeltaEscavalier(589));
        pokemon.add(new DeltaFoongus(590));
        pokemon.add(new DeltaAmoonguss(591));
        pokemon.add(new DeltaLitwick(607));
        pokemon.add(new DeltaLampent(608));
        pokemon.add(new DeltaChandelure(609));
        pokemon.add(new DeltaAxew(610));
        pokemon.add(new DeltaFraxure(611));
        pokemon.add(new DeltaHaxorus(612));
        pokemon.add(new DeltaGolett(622));
        pokemon.add(new DeltaGolurk(623));
        pokemon.add(new DeltaPawniard(624));
        pokemon.add(new DeltaBisharp(625));
        pokemon.add(new DeltaHeatmor(631));
        pokemon.add(new DeltaDeino(633));
        pokemon.add(new DeltaZweilous(634));
        pokemon.add(new DeltaHydreigon(635));
        pokemon.add(new DeltaLarvesta(636));
        pokemon.add(new DeltaVolcarona(637));
        pokemon.add(new DeltaMeloetta(648));

        //X-Species (Xenoverse)
        pokemon.add(new YamaskX(562));
        pokemon.add(new CofagrigusX(563));
        pokemon.add(new JoltikX(595));
        pokemon.add(new GalvantulaX(596));
        pokemon.add(new BisharpX(625));

        //Pokemon Blazing Emerald
        pokemon.add(new HoennianMaractus(556));
        pokemon.add(new HoennianSolosis(577));
        pokemon.add(new HoennianDuosion(578));
        pokemon.add(new HoennianReuniclus(579));
        pokemon.add(new HoennianEmolga(587));
        pokemon.add(new HoennianTynamo(602));
        pokemon.add(new HoennianEelektrik(603));
        pokemon.add(new HoennianEelektross(604));
        pokemon.add(new HoennianPawniard(624));
        pokemon.add(new HoennianBisharp(625));
    }
}

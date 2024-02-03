package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Hatchick extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hatchick() {
        super("Hatchick",
                Type.NORMAL,Type.FLYING,
                new Stats(55,
                        34,
                        58,
                        34,
                        34,
                        30),
                List.of(Ability.EARLY_BIRD,Ability.RUN_AWAY,Ability.WEAK_ARMOR), Ability.WEAK_ARMOR,
                8, 165,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("This timid Pokémon only feels safe if it is wearing its eggshell, and it will boldly drive off children that reach for its head. Trainers are always confused seeing them hatch."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHIRP,1)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hatchick");

    }


}
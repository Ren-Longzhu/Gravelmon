package drai.dev.gravelmon.pokemon;

import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import net.minecraft.core.*;
import net.minecraft.core.registries.*;

import java.util.*;
import java.util.stream.*;

public class Pokemon {
    public static String pokemonThatEvolveIntoThemselves = "Encountered pokemon that evolve into Themselves:";
    public static Map<String, Pokemon> pokemonRegistry = new HashMap<>();
    String name;
    Stats stats;
    Type primaryType;
    Type secondaryType;
    List<Ability> abilities;
    Ability hiddenAbility;
    int catchRate;
    double maleRatio;
    boolean isShoulderMountable = false;
    private int baseExperienceYield;
    ExperienceGroup experienceGroup;
    int eggCycles;
    List<EggGroup> eggGroups;
    int dropAmount;
    List<ItemDrop> drops;
    private int pokedexNumber;
    private final List<PokemonForm> forms;
    private final List<MoveLearnSetEntry> learnSet;
    private final List<Label> labels;
    private final List<String> dexEntries;
    private String preEvolution;
    private final List<EvolutionEntry> evolutions;
    private final int baseFriendship;
    private final Stats evYield;
    private final int height;
    private final int weight;
    private Boolean cannotDynamax = false;
    private Boolean isNew = true;
    private boolean hasGenderDifferences = false;
    private final SpawnContext spawnContext;
    private final SpawnPool spawnPool;
    private final int minSpawnLevel;
    private final int maxSpawnLevel;
    private final double spawnWeight;
    private final List<SpawnCondition> spawnConditions;
    private final List<SpawnCondition> spawnAntiConditions;
    private final List<SpawnPreset> spawnPresets;
    private Effect shoulderEffect;
    private Boolean canFly = false;
    private int lightLevelMinSleep = 0;
    private int lightLevelMaxSleep = 6;
    private double swimSpeed = 0.1;
    private double wanderChance = 1;
    private Boolean canSleep = true;
    private Boolean canSwim = true;
    private Boolean canLookAround = true;
    private Boolean willSleepOnBed = false;
    private Boolean canBreathUnderwater = false;
    private Boolean canWalk = true;
    private Boolean avoidsLand = false;
    private double baseScale;
    private final double portraitScale;
    private double portraitTranslationX = 0;
    private double portraitTranslationY = 1.8;
    private double portraitTranslationZ = 0;
    private boolean nameDifferentInLangFile;
    private String langFileName;
    private double hitboxWidth = 1.0;
    private double hitboxHeight = 1.0;
    private String shoulderMountEffect;
    private boolean modeled = false;
    private double profileTranslationZ = 0;
    private double profileTranslationY = 1;
    private double profileScale = 0.001;
    private double profileTranslationX = 0;

    public Pokemon(String name, Type primaryType, Type secondaryType, List<EvolutionEntry> evolutions, List<Label> labels){
        this(name, primaryType, secondaryType, new Stats(10,10,10,10,10,10),List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10,10,new Stats(0,0,0,0,0,0),255, 0.5, 50, ExperienceGroup.MEDIUM_FAST, 70, 30, List.of(EggGroup.UNDISCOVERED),
                List.of(""), evolutions, List.of(new MoveLearnSetEntry(Move.TACKLE,1), new MoveLearnSetEntry(Move.GROWL, 1)),labels, 0, List.of(),SpawnContext.GROUNDED,
                SpawnPool.COMMON, 1,1,0,List.of(), List.of(),List.of(SpawnPreset.ANCIENT_CITY),0.4,0.4,List.of());
        this.setSecondaryType(secondaryType);
    }

    public Pokemon(int dexNo, String name, Type primaryType, Type secondaryType, List<EvolutionEntry> evolutions, List<Label> labels){
        this(dexNo, name, primaryType, secondaryType, new Stats(10,10,10,10,10,10),List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10,10,new Stats(0,0,0,0,0,0),255, 0.5, 50, ExperienceGroup.MEDIUM_FAST, 70, 30, List.of(EggGroup.UNDISCOVERED),
                List.of(""), evolutions, List.of(new MoveLearnSetEntry(Move.TACKLE,1), new MoveLearnSetEntry(Move.GROWL, 1)),labels, 0, List.of(),SpawnContext.GROUNDED,
                SpawnPool.COMMON, 1,1,0,List.of(), List.of(),List.of(SpawnPreset.ANCIENT_CITY),0.4,0.4,List.of());
        this.setSecondaryType(secondaryType);
    }

    public Pokemon(String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                   Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                   int eggCycles, List<EggGroup> eggGroups,

                   List<String> dexEntries,

                   List<EvolutionEntry> evolutions,

                   List<MoveLearnSetEntry> learnSet,

                   List<Label> labels,

                   int dropAmount, List<ItemDrop> drops,

                   SpawnContext spawnContext, SpawnPool spawnPool,
                   int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                   List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets,

                   double baseScale, double portraitScale,

                   List<PokemonForm> forms) {
        this(name,primaryType,stats,abilities,hiddenAbility,height,weight,
                evYield,catchRate,maleRatio,baseExperienceYield,
                experienceGroup,baseFriendship,eggCycles,eggGroups,
                dexEntries,evolutions,learnSet,labels,dropAmount,drops,spawnContext,spawnPool,
                minSpawnLevel,maxSpawnLevel,spawnWeight,spawnConditions,spawnAntiConditions,
                spawnPresets,baseScale,portraitScale,forms);
        this.secondaryType = secondaryType;
    }

    public Pokemon(int dexNo, String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                   Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                   int eggCycles, List<EggGroup> eggGroups,

                   List<String> dexEntries,

                   List<EvolutionEntry> evolutions,

                   List<MoveLearnSetEntry> learnSet,

                   List<Label> labels,

                   int dropAmount, List<ItemDrop> drops,

                   SpawnContext spawnContext, SpawnPool spawnPool,
                   int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                   List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets,

                   double baseScale, double portraitScale,

                   List<PokemonForm> forms) {
        this(dexNo, name,primaryType,stats,abilities,hiddenAbility,height,weight,
                evYield,catchRate,maleRatio,baseExperienceYield,
                experienceGroup,baseFriendship,eggCycles,eggGroups,
                dexEntries,evolutions,learnSet,labels,dropAmount,drops,spawnContext,spawnPool,
                minSpawnLevel,maxSpawnLevel,spawnWeight,spawnConditions,spawnAntiConditions,
                spawnPresets,baseScale,portraitScale,forms);
        this.secondaryType = secondaryType;
    }
    public Pokemon(String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                   Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                   int eggCycles, List<EggGroup> eggGroups,

                   List<String> dexEntries,

                   List<EvolutionEntry> evolutions,

                   List<MoveLearnSetEntry> learnSet,

                   List<Label> labels,

                   int dropAmount, List<ItemDrop> drops,

                   SpawnContext spawnContext, SpawnPool spawnPool,
                   int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                   List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets,

                   double baseScale, double portraitScale,

                   List<PokemonForm> forms) {
        this(name,primaryType,stats,abilities,hiddenAbility,height,weight,
                evYield,catchRate,maleRatio,baseExperienceYield,
                experienceGroup,baseFriendship,eggCycles,eggGroups,
                dexEntries,evolutions,learnSet,labels,dropAmount,drops,spawnContext,spawnPool,
                minSpawnLevel,maxSpawnLevel,spawnWeight,spawnConditions,spawnAntiConditions,
                spawnPresets,forms);
        GravelmonJsonGenerator.incrementDexCounter();
    }

    public Pokemon(int dexNo, String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                   Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                   int eggCycles, List<EggGroup> eggGroups,

                   List<String> dexEntries,

                   List<EvolutionEntry> evolutions,

                   List<MoveLearnSetEntry> learnSet,

                   List<Label> labels,

                   int dropAmount, List<ItemDrop> drops,

                   SpawnContext spawnContext, SpawnPool spawnPool,
                   int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                   List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets,

                   double baseScale, double portraitScale,

                   List<PokemonForm> forms) {
        this(name,primaryType,stats,abilities,hiddenAbility,height,weight,
            evYield,catchRate,maleRatio,baseExperienceYield,
            experienceGroup,baseFriendship,eggCycles,eggGroups,
            dexEntries,evolutions,learnSet,labels,dropAmount,drops,spawnContext,spawnPool,
            minSpawnLevel,maxSpawnLevel,spawnWeight,spawnConditions,spawnAntiConditions,
            spawnPresets,forms);
        GravelmonJsonGenerator.setDexCounter(dexNo);
        pokedexNumber = dexNo;
        GravelmonJsonGenerator.incrementDexCounter();
    }

    private Pokemon(String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                   Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                   int eggCycles, List<EggGroup> eggGroups,
                   List<String> dexEntries,
                   List<EvolutionEntry> evolutions,
                   List<MoveLearnSetEntry> learnSet,
                   List<Label> labels,
                   int dropAmount, List<ItemDrop> drops,
                   SpawnContext spawnContext, SpawnPool spawnPool,
                   int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                   List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets,
                   List<PokemonForm> forms) {
        this.name = getClass().getSimpleName();
        this.stats = stats;
        this.primaryType = primaryType;
        this.secondaryType = null;
        this.abilities = new ArrayList<>();
               this.abilities.addAll(abilities);
        if(this.abilities.size() > 2){
            this.abilities.remove(2);
        }
        this.hiddenAbility = hiddenAbility;
        this.catchRate = catchRate;
        this.maleRatio = maleRatio;
        this.baseExperienceYield = baseExperienceYield == 0 ? 60 : baseExperienceYield;
        this.experienceGroup = experienceGroup;
        this.eggCycles = eggCycles;
        this.eggGroups = eggGroups;
        this.dropAmount = dropAmount;
        this.drops = new ArrayList<>();
        this.pokedexNumber = GravelmonJsonGenerator.getDexCounter();
        this.forms = forms;
        this.learnSet = learnSet;
        this.labels = new ArrayList<>(labels);
        this.labels.add(Label.NOT_MODELED);
        this.dexEntries = dexEntries;
        this.evolutions = evolutions;
        this.baseFriendship = baseFriendship;
        this.evYield = evYield;
        this.height = height;
        this.weight = weight;
        this.spawnContext = spawnContext;
        this.spawnPool = spawnPool;
        this.minSpawnLevel = minSpawnLevel;
        this.maxSpawnLevel = maxSpawnLevel;
        this.spawnWeight = spawnWeight;
        this.spawnConditions = spawnConditions;
        this.spawnAntiConditions = spawnAntiConditions;
        this.spawnPresets = spawnPresets;
        this.baseScale = Math.max((height*1.5) /10/6,0.1);
//        if(height > 50){
            this.hitboxWidth = 6;
            this.hitboxHeight = 6;
//        } else {
//            this.hitboxWidth = Math.max((height*1.5),0.1);
//            this.hitboxHeight = Math.max((height*1.5),0.1);
//        }
        this.portraitScale = 0.3;
        pokemonRegistry.put(this.name.toLowerCase().replaceAll("\\W",""), this);
    }

    public static void postRegistration() {
        //TODO assign pre-evolutions stats based on the final evolution if they have empty stats
        List<Pokemon> zeroStatPokemon = new ArrayList<>();
        var evaluatedMons = new ArrayList<>();
        StringBuilder pokemonWithZeroCatchrate = new StringBuilder("Pokemon with 0 catch-rate: \n");
        StringBuilder pokemonWithZeroBaseStats = new StringBuilder("Pokemon with 0 Base Stats: \n");
        StringBuilder pokemonWithMoreThanTwoSpawnPresets = new StringBuilder("Pokemon with more than 1 spawn preset: \n");
        var sortedPokemonList = pokemonRegistry.values().stream().sorted(Comparator.comparing(pokemon -> pokemon.pokedexNumber)).toList();
        for (var pokemon : sortedPokemonList) {
            if (pokemon.getCatchRate() == 0)
                pokemonWithZeroCatchrate.append(pokemon.getLabels().stream().findFirst().orElse(Label.MISSING).getName()).append(": ").append(pokemon.getCleanName()).append(",\n");
            if(pokemon.spawnPresets.size()>1){
                pokemonWithMoreThanTwoSpawnPresets.append(pokemon.getLabels().stream().findFirst().orElse(Label.MISSING).getName()).append(": ")
                        .append(pokemon.getCleanName()).append(", being: ");
                for (var preset :
                        pokemon.spawnPresets) {
                    pokemonWithMoreThanTwoSpawnPresets.append(preset).append(",");
                }
                pokemonWithMoreThanTwoSpawnPresets.append("\n");
            }
            if(pokemon.getEggGroups().isEmpty()){
                pokemon.eggGroups = new ArrayList<>(pokemon.eggGroups);
                pokemon.eggGroups.add(EggGroup.FIELD);
            }
            if(pokemon.stats.isEmpty()){
                zeroStatPokemon.add(pokemon);
            }

            for (EvolutionEntry evolutionEntry : pokemon.getEvolutions()) {
                Pokemon result = pokemonRegistry.values().stream().filter(p -> p.getName().equalsIgnoreCase(evolutionEntry.getResult())).findFirst().orElse(null);
                if (result != null) {
                    if (evolutionEntry.getRequiredContext() != null) {
                        addItemAsDrop(pokemon, evolutionEntry.getRequiredContext(), result);
                    } else {
                        evolutionEntry.getRequirements().stream()
                                .filter(entry -> entry.getCondition().equals("itemCondition"))
                                .forEach(entry -> addItemAsDrop(pokemon, entry.getConditionParameter().replace("\"", ""), result));
                    }
                    if (result.getLangFileName() != null) {
                        if (result.getLangFileName().equalsIgnoreCase(pokemon.getName())) continue;
                        if (pokemon.getLangFileName() != null) {
                            if (result.getLangFileName().equalsIgnoreCase(pokemon.getLangFileName())) continue;
                        }
                    } else if (pokemon.getLangFileName() != null) {
                        if (pokemon.getLangFileName().equalsIgnoreCase(result.getName())) continue;
                    }

                    if (evaluatedMons.contains(result)) continue;
                    evaluatedMons.add(result);
                    if (result.preEvolution != null) {
                        continue;
                    }
                    if (result.getCleanName().equals(pokemon.getCleanName())) {
                        pokemonThatEvolveIntoThemselves += pokemon.getCleanName() + ",\n";
                    }
                    if (!isBasedOnOriginalPokemon(pokemon)) {
                        result.getLabels().add(Label.FAKEMON);
                    }
                    result.setPreEvolution(pokemon.getCleanName());
                }
            }
            var evaluatedForms = new ArrayList<>();
            for (PokemonForm form : pokemon.getForms()) {
                if (pokemon.getCatchRate() == 0)
                    pokemonWithZeroCatchrate.append(pokemon.getCleanName()).append(", Aspect: ").append(form.getAspects()).append(",\n");
                if (form.getStats().getTotal() == 0)
                    pokemonWithZeroBaseStats.append(form.getLabels().stream().findFirst().orElse(Label.MISSING).getName()).append(": ").append(pokemon.getCleanName()).append(", Aspect: ").append(form.getAspects()).append(",\n");
                for (EvolutionEntry evolutionEntry : form.getEvolutions()) {
                    String resultName = evolutionEntry.getResult();
                    PokemonForm result = pokemonRegistry.values().stream()
                            .filter(p -> p.getName().equalsIgnoreCase(resultName))
                            .map(Pokemon::getForms).flatMap(List::stream).filter(pokemonForm -> new HashSet<>(pokemonForm.getAspects()).containsAll(evolutionEntry.getAspects())).findFirst().orElse(null);
                    if (result != null) {
                        if (evolutionEntry.getRequiredContext() != null) {
                            addItemAsDrop(form, evolutionEntry.getRequiredContext(), result);
                        } else {
                            evolutionEntry.getRequirements().stream()
                                    .filter(entry -> entry.getCondition().equals("itemCondition"))
                                    .forEach(entry -> addItemAsDrop(form, entry.getConditionParameter().replace("\"", ""), result));
                        }


                        if (evaluatedForms.contains(result)) continue;
                        evaluatedForms.add(result);
                        if (result.preEvolution != null) {
                            continue;
                        }
                        if (result.getCleanName().equals(pokemon.getCleanName())) {
                            pokemonThatEvolveIntoThemselves += pokemon.getCleanName() + ", Aspect: " + evolutionEntry.getAspects() + ",\n";
                        }
                        if (!isBasedOnOriginalPokemon(pokemon)) {
                            result.getLabels().add(Label.FAKEMON);
                        }
                        String aspect = evolutionEntry.getAspects().stream().findFirst().isEmpty() ? "" : " form=" + evolutionEntry.getAspects().stream().findFirst().get().getName();
                        result.setPreEvolution(pokemon.getCleanName() + aspect);
                    }
                }
            }
        }
        System.out.println(pokemonThatEvolveIntoThemselves);
//        System.out.println(pokemonWithZeroBaseStats);
        System.out.println(pokemonWithZeroCatchrate);
        System.out.println(pokemonWithMoreThanTwoSpawnPresets);
        System.out.println("Evolution Items:");
        for (String item : evolutionItems) {System.out.println(item+",");
        }

        for (int i = zeroStatPokemon.size()-1; i > -1; i--) {
            var pokemon = zeroStatPokemon.get(i);
            if (!pokemon.evolutions.isEmpty()) {
                var pokemonToCopy = pokemon.evolutions.stream()
                        .map(evolutionEntry -> evolutionEntry.getResult().toLowerCase())
                        .filter(result -> pokemonRegistry.containsKey(result))
                        .map(result -> pokemonRegistry.get(result))
                        .min(Comparator.comparing(pokemon1 -> pokemon1.stats.getTotal()));
                if (pokemonToCopy.isPresent()) {
                    var evolutionStats = pokemonToCopy.get().stats;
                    pokemon.stats = new Stats(evolutionStats, 0.7);
                }
            }
        }

        for (var pokemon : sortedPokemonList) {
            if(pokemon.baseExperienceYield == 0){
                pokemon.baseExperienceYield = 512/(pokemon.stats.getHP()/255);
            }
            if(pokemon.stats.isEmpty()){
                pokemonWithZeroBaseStats.append(pokemon.getLabels().stream().findFirst().orElse(Label.MISSING).getName()).append(": ").append(pokemon.getCleanName()).append(",\n");
            }
        }
        System.out.println(pokemonWithZeroBaseStats);

    }

    public static List<String> evolutionItems = new ArrayList<>();
    private static void addItemAsDrop(PokemonForm form, String evolutionEntry, PokemonForm result) {
        if(evolutionEntry.contains("gravelmon")){
            if(!evolutionItems.contains(evolutionEntry)){
                evolutionItems.add(evolutionEntry);
            }
            result.setDropAmount(1);
            result.getDrops().add(new ItemDrop(evolutionEntry,40, 1,1));
            form.setDropAmount(1);
            form.getDrops().add(new ItemDrop(evolutionEntry,10, 1,1));
        }
    }

    private static void addItemAsDrop(Pokemon form, String evolutionEntry, Pokemon result) {
        if(evolutionEntry.contains("gravelmon")){
            if(!evolutionItems.contains(evolutionEntry)){
                evolutionItems.add(evolutionEntry);
            }
            result.setDropAmount(1);
            result.getDrops().add(new ItemDrop(evolutionEntry,40, 1,1));
            form.setDropAmount(1);
            form.getDrops().add(new ItemDrop(evolutionEntry,10, 1,1));
        }
    }

    private void setDropAmount(int i) {
        dropAmount = i;
    }

    private static boolean isBasedOnOriginalPokemon(Pokemon pokemon) {
        boolean isEvoOfAPreviousPokemon = false;
        for (Label label : pokemon.labels) {
            String generationLabel = "gen";
            for (int i = 1; i < 10; i++) {
                if (label.getName().equalsIgnoreCase(generationLabel + i)) {
                    isEvoOfAPreviousPokemon = true;
                    break;
                }
            }
        }
        return isEvoOfAPreviousPokemon;
    }

    protected void setPreEvolution(String cleanName) {
        if(cleanName.equalsIgnoreCase("eevee")){
            this.labels.add(Label.EEVEELUTION);
        }
        this.labels.add(Label.FAKEMON_EVOLUTION);
        this.preEvolution = cleanName;
    }

    public void setShoulderMountable(boolean shoulderMountable) {
        isShoulderMountable = shoulderMountable;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public void setCanSleep(Boolean canSleep) {
        this.canSleep = canSleep;
    }

    public void setCanSwim(Boolean canSwim) {
        this.canSwim = canSwim;
    }

    public void setCanLookAround(Boolean canLookAround) {
        this.canLookAround = canLookAround;
    }

    public void setAvoidsLand(Boolean avoidsLand) {
        this.avoidsLand = avoidsLand;
    }

    public void setWillSleepOnBed(Boolean willSleepOnBed) {
        this.willSleepOnBed = willSleepOnBed;
    }

    public void setCanBreathUnderwater(Boolean canBreathUnderwater) {
        this.canBreathUnderwater = canBreathUnderwater;
    }

    public void setCanWalk(Boolean canWalk) {
        this.canWalk = canWalk;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }

    public void setSecondaryType(Type secondaryType) {
        this.secondaryType = secondaryType;
    }

    public void setCannotDynamax(Boolean cannotDynamax) {
        this.cannotDynamax = cannotDynamax;
    }

    public void setHasGenderDifferences(boolean hasGenderDifferences) {
        this.hasGenderDifferences = hasGenderDifferences;
    }

    public String getName(){
        return name;
    }

    public String getCleanName() {
        return name.toLowerCase().replace(' ','_').replaceAll("[^a-zA-Z0-9_]", "")
                .replace("'","").replace("\\.","");
    }

    public Stats getStats(){
        return stats;
    }

    public Type getPrimaryType() {
        return primaryType;
    }

    public Type getSecondaryType() {
        return secondaryType;
    }

    public Boolean isShoulderMountable() {
        return isShoulderMountable;
    }

    public int getBaseExperienceYield() {
        return baseExperienceYield;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public Ability getHiddenAbility() {
        return hiddenAbility;
    }

    public int getCatchRate() {
        return catchRate;
    }

    public double getMaleRatio() {
        return maleRatio;
    }

    public ExperienceGroup getExperienceGroup() {
        return experienceGroup;
    }

    public int getEggCycles() {
        return eggCycles;
    }

    public List<EggGroup> getEggGroups() {
        return eggGroups;
    }

    public int getDropAmount() {
        return dropAmount;
    }

    public List<ItemDrop> getDrops() {
        return drops;
    }

    public int getPokedexNumber() {
        return pokedexNumber;
    }

    public List<PokemonForm> getForms() {
        return forms;
    }

    public List<MoveLearnSetEntry> getLearnSet() {
        return learnSet;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public List<String> getDexEntries() {
        return dexEntries;
    }

    public List<EvolutionEntry> getEvolutions() {
        return evolutions;
    }

    public int getBaseFriendship() {
        return baseFriendship;
    }

    public Stats getEvYield() {
        return evYield;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Boolean cannotDynamax() {
        return cannotDynamax;
    }

    public boolean isNew() {
        return isNew;
    }

    public boolean hasGenderDifferences() {
        return hasGenderDifferences;
    }

    public SpawnContext getSpawnContext() {
        return spawnContext;
    }

    public SpawnPool getSpawnPool() {
        return spawnPool;
    }

    public int getMinSpawnLevel() {
        return minSpawnLevel;
    }

    public int getMaxSpawnLevel() {
        return maxSpawnLevel;
    }

    public double getSpawnWeight() {
        return spawnWeight;
    }

    public List<SpawnCondition> getSpawnConditions() {
        return spawnConditions;
    }

    public List<SpawnCondition> getSpawnAntiConditions() {
        return spawnAntiConditions;
    }

    public List<SpawnPreset> getSpawnPresets() {
        return spawnPresets;
    }

    public Effect getShoulderEffect() {
        return shoulderEffect;
    }

    public Boolean canFly() {
        return canFly;
    }

    public Boolean canSleep() {
        return canSleep;
    }

    public Boolean willSleepOnBed() {
        return willSleepOnBed;
    }

    public int getLightLevelMinSleep() {
        return lightLevelMinSleep;
    }

    public void setLightLevelMinSleep(int lightLevelMinSleep) {
        this.lightLevelMinSleep = lightLevelMinSleep;
    }

    public int getLightLevelMaxSleep() {
        return lightLevelMaxSleep;
    }

    public void setLightLevelMaxSleep(int lightLevelMaxSleep) {
        this.lightLevelMaxSleep = lightLevelMaxSleep;
    }

    public Boolean canLookAround() {
        return canLookAround;
    }

    public Boolean canWalk() {
        return canWalk;
    }

    public Boolean avoidsLand() {
        return avoidsLand;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public Boolean canSwim() {
        return canSwim;
    }

    public Boolean canBreathUnderwater() {
        return canBreathUnderwater;
    }

    public double getWanderChance() {
        return wanderChance;
    }

    public void setWanderChance(double wanderChance) {
        this.wanderChance = wanderChance;
    }

    public double getBaseScale() {
        return baseScale;
    }

    public double getPortraitScale() {
        return portraitScale;
    }

    public double getPortraitTranslationX() {
        return portraitTranslationX;
    }

    public double getPortraitTranslationY() {
        return portraitTranslationY;
    }

    public double getPortraitTranslationZ() {
        return portraitTranslationZ;
    }

    public void setPortraitTranslationX(double portraitTranslationX) {
        this.portraitTranslationX = portraitTranslationX;
    }

    public void setPortraitTranslationY(double portraitTranslationY) {
        this.portraitTranslationY = portraitTranslationY;
    }

    public void setPortraitTranslationZ(double portraitTranslationZ) {
        this.portraitTranslationZ = portraitTranslationZ;
    }

    protected void setPortraitXYZ(double x, double y, double z) {
        this.setPortraitTranslationX(x);
        this.setPortraitTranslationY(y);
        this.setPortraitTranslationZ(z);
    }

    public void setNameDifferentInLangFile(boolean nameDifferentInLangFile) {
        this.nameDifferentInLangFile = nameDifferentInLangFile;
    }

    public boolean isNameDifferentInLangFile() {
        return nameDifferentInLangFile;
    }

    public void setLangFileName(String langFileName) {
        this.langFileName = langFileName;
    }

    public String getLangFileName() {
        return langFileName;
    }

    protected void setHitbox(double width, double height) {
        this.hitboxWidth = width;
        this.hitboxHeight = height;
    }

    public double getHitboxWidth() {
        return hitboxWidth;
    }

    public double getHitboxHeight() {
        return hitboxHeight;
    }

    protected void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public void setShoulderMountEffect(String shoulderMountEffect) {
        this.shoulderMountEffect = shoulderMountEffect;
    }

    public String getShoulderMountEffect() {
        return shoulderMountEffect;
    }

    public boolean isModeled() {
        return modeled;
    }

    public void setModeled(boolean modeled) {
        labels.remove(Label.NOT_MODELED);
        this.forms.forEach(pokemonForm -> pokemonForm.getLabels().remove(Label.NOT_MODELED));
        this.modeled = modeled;
    }

    protected void setBaseScaleAndScaleHitbox(double scale) {
        this.baseScale = scale;
    }

    protected void setBaseScale(double scale) {
        this.baseScale = scale;
        double newHitboxWidth = (double)height/10;
        double newHitboxHeight = (double)height/10;
        setHitbox(newHitboxWidth,newHitboxHeight);
        this.forms.forEach(forms->{forms.setBaseScale(scale);
            double newFormHitboxWidth = (double)forms.getHeight()/10;
            double newFormHitboxHeight = (double)forms.getHeight()/10;
            setHitbox(newFormHitboxWidth,newFormHitboxHeight);});
    }

    public String getPreEvolution() {
        return this.preEvolution;
    }

    public double getProfileTranslationZ() {
        return profileTranslationZ;
    }

    public void setProfileTranslationZ(double profileTranslationZ) {
        this.profileTranslationZ = profileTranslationZ;
    }

    public double getProfileTranslationY() {
        return profileTranslationY;
    }

    public void setProfileTranslationY(double profileTranslationY) {
        this.profileTranslationY = profileTranslationY;
    }

    public double getProfileScale() {
        return profileScale;
    }

    public void setProfileScale(double profileScale) {
        this.profileScale = profileScale;
    }

    public double getProfileTranslationX() {
        return profileTranslationX;
    }

    public void setProfileTranslationX(double profileTranslationX) {
        this.profileTranslationX = profileTranslationX;
    }
}

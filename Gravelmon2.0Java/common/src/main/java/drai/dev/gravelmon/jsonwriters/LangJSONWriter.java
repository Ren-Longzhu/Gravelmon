package drai.dev.gravelmon.jsonwriters;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.io.*;
import java.nio.file.*;

public class LangJSONWriter {
    private static String contents ="{\n";
    private static boolean isFirst=true;
    private static String dir = "";
    public static void writeLang(Game game, String resourcesDir) {
        dir = resourcesDir;
        game.getPokemon().forEach(pokemon -> {writePokemon(pokemon);});
    }

    public static void writeTranslationKey(String key, String text){
        contents+="    \""+key+"\": \"" + text + "\",\n";
    }

    private static void writePokemon(Pokemon pokemon) {
        int dexEntryCounter = 1;
        if(pokemon.isNew()) {
            if (isFirst) {
                isFirst = false;
            } else {
                contents += ",\n";
            }
            if (pokemon.getLangFileName() != null) {
                contents += "    \"cobblemon.species." + pokemon.getCleanName() + ".name\": \"" + pokemon.getLangFileName() + "\",\n";
            } else {
                contents += "    \"cobblemon.species." + pokemon.getCleanName() + ".name\": \"" + pokemon.getName() + "\",\n";
            }

            if(pokemon.getDexEntries().size() > 0){
                for (String entry : pokemon.getDexEntries()) {
                    contents += "    \"cobblemon.species." + pokemon.getCleanName() + ".desc\": \"" + entry + "\"";
                    dexEntryCounter++;
                }
            }

        }
        for (PokemonForm form : pokemon.getForms()){
            if (isFirst) {
                isFirst = false;
            } else {
                contents += ",\n";
            }
            contents+="    \"cobblemon.species."+form.getCleanName()+"_"+pokemon.getCleanName()+".name\": \""+pokemon.getName()+"\"";
            dexEntryCounter = 1;
            if(pokemon.getDexEntries().size() > 0) {
                for (String entry : form.getDexEntries()) {
                    contents += ",\n    \"cobblemon.species." + form.getCleanName() + "_" + pokemon.getCleanName() + ".desc" + dexEntryCounter + "\": \"" + entry + "\"";
                    dexEntryCounter++;
                }
            }
        }
    }

    public static void finalizeLang(String resourcesDir){
        contents+="\n}";
        try {
            Files.createDirectories(new File(resourcesDir+"\\assets\\cobblemon\\lang").toPath());
            BufferedWriter writer = new BufferedWriter(new FileWriter(resourcesDir+"\\assets\\cobblemon\\lang\\en_us.json"));
            writer.write(contents);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

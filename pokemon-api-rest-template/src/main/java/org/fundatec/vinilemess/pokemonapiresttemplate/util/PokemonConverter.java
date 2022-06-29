package org.fundatec.vinilemess.pokemonapiresttemplate.util;

import org.fundatec.vinilemess.pokemonapiresttemplate.external.response.PokemonResponse;

public class PokemonConverter {

    public static PokemonResponse convert(PokemonResponse pokemonResponse) {
        pokemonResponse.setName(capitalize(pokemonResponse.getName()));
        return pokemonResponse;
    }

    public static String capitalize(String str) {
        return str.replaceFirst(str.substring(0, 1), str.substring(0, 1).toUpperCase());
    }
}

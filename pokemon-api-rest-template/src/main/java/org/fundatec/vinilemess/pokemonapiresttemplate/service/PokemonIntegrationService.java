package org.fundatec.vinilemess.pokemonapiresttemplate.service;

import org.fundatec.vinilemess.pokemonapiresttemplate.external.response.PokemonResponse;

public interface PokemonIntegrationService {
    PokemonResponse findPokemonById(int id);

    PokemonResponse findPokemonByName(String name);
}

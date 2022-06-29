package org.fundatec.vinilemess.pokemonapiresttemplate.service.implementation;

import org.fundatec.vinilemess.pokemonapiresttemplate.external.response.PokemonResponse;
import org.fundatec.vinilemess.pokemonapiresttemplate.service.PokemonIntegrationService;
import org.fundatec.vinilemess.pokemonapiresttemplate.util.PokemonConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonIntegrationServiceImpl implements PokemonIntegrationService {

    private final RestTemplate restTemplate;

    @Value("${poke-api-uri}")
    private String uri;

    public PokemonIntegrationServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public PokemonResponse findPokemonById(int id) {
        String url = generateURLIntegration(id);
        PokemonResponse pokemon = this.restTemplate.getForObject(url, PokemonResponse.class);
        return PokemonConverter.convert(pokemon);
    }

    public PokemonResponse findPokemonByName(String name) {
        String url = generateURLIntegration(name);
        PokemonResponse pokemon = this.restTemplate.getForObject(url, PokemonResponse.class);
        return PokemonConverter.convert(pokemon);
    }

    private String generateURLIntegration(int id) {
        return this.uri + "/" + id;
    }
    private String generateURLIntegration(String name) {
        return this.uri + "/" + name;
    }

}

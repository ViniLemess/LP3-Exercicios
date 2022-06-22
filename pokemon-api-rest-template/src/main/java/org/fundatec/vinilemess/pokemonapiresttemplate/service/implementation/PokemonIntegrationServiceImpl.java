package org.fundatec.vinilemess.pokemonapiresttemplate.service.implementation;

import org.fundatec.vinilemess.pokemonapiresttemplate.model.Response.PokemonResponse;
import org.fundatec.vinilemess.pokemonapiresttemplate.service.PokemonIntegrationService;
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
        return this.restTemplate.getForObject(url, PokemonResponse.class);
    }

    public PokemonResponse findPokemonByName(String name) {
        String url = generateURLIntegration(name);
        return this.restTemplate.getForObject(url, PokemonResponse.class);
    }

    private String generateURLIntegration(int id) {
        return this.uri + "/" + id;
    }
    private String generateURLIntegration(String name) {
        return this.uri + "/" + name;
    }

}

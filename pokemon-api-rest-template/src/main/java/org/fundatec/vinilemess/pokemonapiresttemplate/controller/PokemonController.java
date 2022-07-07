package org.fundatec.vinilemess.pokemonapiresttemplate.controller;

import org.fundatec.vinilemess.pokemonapiresttemplate.external.response.PokemonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.fundatec.vinilemess.pokemonapiresttemplate.service.PokemonIntegrationService;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    private final PokemonIntegrationService service;

    public PokemonController(PokemonIntegrationService service) {
        this.service = service;
    }

    @GetMapping(params = "{id}")
    public ResponseEntity<PokemonResponse> findPokemonById(@PathVariable("id") int id) {
        return ResponseEntity.ok(this.service.findPokemonById(id));
    }

    @GetMapping("/{name}")
    public ResponseEntity<PokemonResponse> findPokemonByName(@PathVariable("name") String name) {
        return ResponseEntity.ok(this.service.findPokemonByName(name));
    }
}

package org.fundatec.vinilemess.pokemonapiresttemplate.controller;

import io.swagger.annotations.ApiParam;
import org.fundatec.vinilemess.pokemonapiresttemplate.external.response.PokemonResponse;
import org.fundatec.vinilemess.pokemonapiresttemplate.util.PokemonConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.fundatec.vinilemess.pokemonapiresttemplate.service.implementation.PokemonIntegrationServiceImpl;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    @Autowired
    private PokemonIntegrationServiceImpl service;

    @GetMapping(params = "{id}")
    @ApiParam()
    public ResponseEntity<PokemonResponse> findPokemonById(@PathVariable("id") int id) {
        return ResponseEntity.ok(this.service.findPokemonById(id));
    }

    @GetMapping("/{name}")
    public ResponseEntity<PokemonResponse> findPokemonByName(@PathVariable("name") String name) {
        return ResponseEntity.ok(this.service.findPokemonByName(name));
    }
}

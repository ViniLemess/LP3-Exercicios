package org.fundatec.vinilemess.pokemonapiresttemplate.external.response;

import lombok.Data;
import org.fundatec.vinilemess.pokemonapiresttemplate.external.Move;
import org.fundatec.vinilemess.pokemonapiresttemplate.external.Sprites;
import org.fundatec.vinilemess.pokemonapiresttemplate.external.Type;

import java.util.List;

@Data
public class PokemonResponse {
    private Integer id;
    private String name;
    private int height;
    private int weight;
    private Sprites sprites;
    private List<Move> moves;
    private List<Type> types;
}

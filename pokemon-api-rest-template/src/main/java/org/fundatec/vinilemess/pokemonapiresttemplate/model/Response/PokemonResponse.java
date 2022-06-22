package org.fundatec.vinilemess.pokemonapiresttemplate.model.Response;

import lombok.Data;
import org.fundatec.vinilemess.pokemonapiresttemplate.model.Move;
import org.fundatec.vinilemess.pokemonapiresttemplate.model.Sprites;
import org.fundatec.vinilemess.pokemonapiresttemplate.model.Type;

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

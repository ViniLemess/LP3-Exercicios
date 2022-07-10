package org.fundatec.vinilemess.pokemonapiresttemplate.external.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sprites {
    private String frontDefault;
    private String frontShiny;

    public String getFrontDefault() {
        return frontDefault;
    }

    public String getFrontShiny() {
        return frontShiny;
    }
}

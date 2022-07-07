package org.fundatec.vinilemess.pokemonapiresttemplate.external.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sprites {

    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_shiny")
    private String frontShiny;

    @JsonProperty("front_default")
    public String getFrontDefault() {
        return frontDefault;
    }

    @JsonProperty("front_shiny")
    public String getFrontShiny() {
        return frontShiny;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }
}

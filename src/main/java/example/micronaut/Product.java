package example.micronaut;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Product {

    @JsonProperty("name")
    private String name;

    @JsonProperty("image")
    private String image;

    @JsonProperty("description")
    private String description;

    @JsonProperty("price")
    private Float price;


    public Product(){}

    public Product(String name, String image, String description, Float price) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.price = price;
    }
}

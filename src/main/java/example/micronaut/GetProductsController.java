package example.micronaut;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller("/products")
public class GetProductsController {

    @Get
    @Produces(MediaType.ALL)
    public List<String> index() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("products.json");
        Product[] products = objectMapper.readValue(file, Product[].class);

        List<String> jsonObjArray = new ArrayList<String>();

        for (Product product: products ){
            String productObj = new ObjectMapper().writeValueAsString(product);
            jsonObjArray.add( productObj );
        }

        return jsonObjArray;
    }
}


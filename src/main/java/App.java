import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        staticFileLocation("/public");

        get("/", (request, response) -> { //request for route happens at this location
            Map<String, Object> model = new HashMap<>(); // new model is made to store information
            return new ModelAndView(model, "hero-form.hbs"); // assemble individual pieces and render
        }, new HandlebarsTemplateEngine()); //
    }

}

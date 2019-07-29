import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.ModelAndView;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        staticFileLocation("/public");

        get("/", (request, response) -> { //request for route happens at this location
            Map<String, Object> model = new HashMap<String, Object>(); // new model is made to store information
            return new ModelAndView(model, "home.hbs"); // assemble individual pieces and render
        }, new HandlebarsTemplateEngine()); //

        get("/hero_form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad_form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            model.put("name", name);
            return new ModelAndView(model, "squad-form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero_squad", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String squad = request.queryParams("squad");
            model.put("squad", squad);
            return new ModelAndView(model, "hero-squad.hbs");
        }, new HandlebarsTemplateEngine());


    }

}

import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.ModelAndView;


import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        staticFileLocation("/public");


        get("/", (request, response) -> { //request for route happens at this location
            Map<String, Object> model = new HashMap<String, Object>(); // new model is made to store information\
            return new ModelAndView(model, "home.hbs"); // assemble individual pieces and render
        }, new HandlebarsTemplateEngine()); //

        get("/hero_form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("heroes", Hero.all());
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero_success", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            model.put("name", name);
            model.put("age", age);
            model.put("power", power);
            model.put("weakness", weakness);
            return new ModelAndView(model, "hero-success.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad_form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "squad-form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad_success", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String squad = request.queryParams("squad");
            String cause = request.queryParams("cause");
            String size = request.queryParams("size");
            model.put("squad", squad);
            model.put("cause", cause);
            model.put("size", size);
            return new ModelAndView(model, "squad-success.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad_heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            model.put("name", name);
            model.put("age", age);
            model.put("power", power);
            model.put("weakness", weakness);
            return new ModelAndView(model, "squad-heroes.hbs");
        }, new HandlebarsTemplateEngine());

    }

}

package controllers;

import models.User;
import org.joda.time.DateTime;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import java.util.List;

import static play.libs.Json.toJson;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("User Stuff"));
    }

    public static Result saveUser() {
        User user = Form.form(User.class).bindFromRequest().get();
        user.created_date = DateTime.now().toDate();
        user.active = true;
        user.save();
        return redirect(routes.Application.getUsers());
    }

    public static Result getUsers() {
        List<User> recipes = new Model.Finder(String.class, User.class).all();
        return ok(toJson(recipes));
    }

}

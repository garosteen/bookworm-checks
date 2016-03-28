package checks;

import checks.templates.nested.Navigation;
import checks.templates.pages.Home;
import spark.Spark;

import static spark.Spark.get;

public class Main {

		public static void main(String[] args) {
			Spark.staticFileLocation("/public");

		/* This is where we'll instantiate each page, based on the Water template workflow */
			Navigation navMenu = new Navigation();

			Home home = new Home(navMenu);
			get("/", (req, res) -> home.render());
	}
}

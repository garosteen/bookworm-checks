package checks;

import checks.templates.TestPage;

import static spark.Spark.get;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main
{
	public static String file(String filename)
	{
		try
		{
			return new String(Files.readAllBytes(Paths.get("src", "main", "resources", "templates", filename)));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return "";
	}
	
	public static void main(String[] args) {
		get("/", (req, res) -> file("index.html"));
		get("/checkin", (req, res) -> file("checkin.html"));
		get("/checkout", (req, res) -> file("checkout.html"));

		/* This is where we'll instantiate each page, based on the Water template workflow */
		TestPage testPage = new TestPage();
		get("/test", (req, res) -> testPage.render());
	}
}

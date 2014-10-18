package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        String port = System.getenv("PORT");
        String hostname = System.getenv("HOSTNAME");
        renderText("Hello from Flynn on port " + port + " from container " + hostname + "\n");
    }

}

package com.revature;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * Assignment: retrieve the variable "first" from the path parameter and send it in the response body. Produce
         * the response using:
         *      ctx.result(StringVariable);
         * 
         * Note: Please refer to the "PathParameters.MD" file for more assistance if needed.
         */
        app.get("/firstname/{first}", ctx -> {
            String firstName = ctx.pathParam("first");
            //write code here
            ctx.result(firstName);
        });

      
        return app;
    }
    
}
/*
app.get("/lastname/{name}", ctx -> {
    String lastName = ctx.pathParam("name");
});
 */

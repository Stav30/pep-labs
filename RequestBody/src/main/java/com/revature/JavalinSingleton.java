package com.revature;

import org.h2.engine.User;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.javalin.Javalin;

/**
 * Background: A json string representing a song will be sent in this POST request with the following fields: 
 *      songName, artistName
 */
public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * problem1: retrieve the song object from the request body and return the artist name.
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem1", ctx -> {
            //retrieve the json string from the request body
            String jsonString = ctx.body();

            //utilize jackson to convert the json string to a user object
            ObjectMapper om = new ObjectMapper();
            Song song = om.readValue(jsonString, Song.class);

            //we need to let the request know we will send back json in the body
            ctx.contentType("application/json"); 
            song.setSongName("songName");

             //utilize jackson convert back the user object to a json string
            String jsonStringToBeReturned = om.writeValueAsString(song);

             //return the json string in the response body
            ctx.result(jsonStringToBeReturned);

        });     
            

        /**
         * problem2: retrieve the song object from the request body...
         *      1. update the artist in the song object to "Beatles"
         *      2. return the updated song object in the response body
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem2", ctx -> {
            //retrieve the json string from the request body
            String jsonString = ctx.body();

            //utilize jackson to convert the json string to a user object
            ObjectMapper om = new ObjectMapper();
            User user = om.readValue(jsonString, User.class);

            //we need to let the request know we will send back json in the body
            ctx.contentType("application/json"); 

            //change the last name
            user.setLastname("Jones");
    
            //utilize jackson convert back the user object to a json string
            String jsonStringToBeReturned = om.writeValueAsString(user);

            //return the json string in the response body
            ctx.result(jsonStringToBeReturned);
            
       
            //implement logic here
        });


        return app;
    }
    
}

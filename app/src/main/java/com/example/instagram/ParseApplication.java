package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

//        register parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Wt8z9M5OFL0r0WFnD2vnqYJLu4Tcrn1W7R5vgTE0")
                .clientKey("EwyyqbHy0k28QUitE0F6MuE8HyMfOZg4CzN3mEsZ")
                .server("https://parseapi.back4app.com")
                .build()

        );
    }
}

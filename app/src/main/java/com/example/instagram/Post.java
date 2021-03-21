package com.example.instagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import java.io.File;
import java.security.Key;


@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";

    public String getDescription() {
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String description) {
        put(KEY_DESCRIPTION, description);
    }

    public ParseFile getImage() {
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile image){
        put(KEY_IMAGE, image);
    }

    // Ensure that your subclass has a public default constructor
    public Post() {
        super();
    }

//    // Add a constructor that contains core properties
//    public Post(String body) {
//        super();
//        setBody(body);
//    }

//    // Use getString and others to access fields
//    public String getBody() {
//        return getString("body");
//    }

//    // Use put to modify field values
//    public void setBody(String value) {
//        put("body", value);
//    }

    // Get the user for this item
    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }

    // Associate each item with a user
    public void setUser(ParseUser user) {
        put(KEY_USER, user);
    }
}
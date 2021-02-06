package yourid.csumb.wk1hw02_restapi;

import com.google.gson.annotations.SerializedName;

public class Post {
    //Declaring Initial Variables
    private int userId;

    private int id;

    private String title;

    @SerializedName("body")
    private String text;

    //Generated Getter Methods
    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
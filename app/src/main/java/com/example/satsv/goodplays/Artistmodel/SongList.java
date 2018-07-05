
package com.example.satsv.goodplays.Artistmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SongList {

    @SerializedName("message")
    @Expose
    private Message message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SongList() {
    }

    /**
     * 
     * @param message
     */
    public SongList(Message message) {
        super();
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

}

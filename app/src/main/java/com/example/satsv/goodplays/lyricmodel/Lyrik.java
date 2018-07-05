
package com.example.satsv.goodplays.lyricmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lyrik {

    @SerializedName("message")
    @Expose
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

}

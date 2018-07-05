
package com.example.satsv.goodplays.Artistmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Header {

    @SerializedName("status_code")
    @Expose
    private int statusCode;
    @SerializedName("execute_time")
    @Expose
    private float executeTime;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public float getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(float executeTime) {
        this.executeTime = executeTime;
    }

}

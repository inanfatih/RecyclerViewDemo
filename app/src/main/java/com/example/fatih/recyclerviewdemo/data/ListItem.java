package com.example.fatih.recyclerviewdemo.data;

/**
 *  - Workout
 *  - Reminder
 *  - Task
 *  - Note
 *  - User
 * Created by Fatih on 2017-11-19.
 */

public class ListItem {

    private String dateAndTime;
    private String message;
    private int colorResource;

    public ListItem(String dateAndTime, String message, int colorResource) {
        this.dateAndTime = dateAndTime;
        this.message = message;
        this.colorResource = colorResource;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getColorResource() {
        return colorResource;
    }

    public void setColorResource(int colorResource) {
        this.colorResource = colorResource;
    }
}

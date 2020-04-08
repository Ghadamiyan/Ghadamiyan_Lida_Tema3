package com.example.tema3_android;
public class ToDo {

    public String UserId;
    public String Id;
    public String Title;
    public String Completed;

    public ToDo(String userId, String id, String title, String completed) {
        UserId = userId;
        Id = id;
        Title = title;
        Completed = completed;
    }

    public String getUserId() {
        return UserId;
    }

    public String getId() {
        return Id;
    }

    public String getTitle() {
        return Title;
    }

    public String getCompleted() {
        return Completed;
    }
}
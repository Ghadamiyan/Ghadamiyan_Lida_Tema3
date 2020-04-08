package com.example.tema3_android;

public class User {

        private String Id;
        private String Name;
        private String UserName;
        private String Mail;

        public User(String id, String name, String userName, String mail) {
            Id = id;
            Name = name;
            UserName = userName;
            Mail = mail;
        }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getUserName() {
        return UserName;
    }

    public String getMail() {
        return Mail;
    }
}

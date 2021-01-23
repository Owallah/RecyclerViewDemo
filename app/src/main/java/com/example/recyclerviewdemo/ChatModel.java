package com.example.recyclerviewdemo;

import android.widget.ImageView;
import android.widget.TextView;

public class ChatModel {

    private ImageView profilePic;
    private TextView userName,message;

    public ChatModel(ImageView profilePic, TextView userName, TextView message) {
        this.profilePic = profilePic;
        this.userName = userName;
        this.message = message;
    }

    public ImageView getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(ImageView profilePic) {
        this.profilePic = profilePic;
    }

    public TextView getUserName() {
        return userName;
    }

    public void setUserName(TextView userName) {
        this.userName = userName;
    }

    public TextView getMessage() {
        return message;
    }

    public void setMessage(TextView message) {
        this.message = message;
    }
}

package edu.andrews.cptr252.kevindaniel.firebasetest;

import android.app.Activity;
import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Kevin Daniel on 9/24/2016.
 */
public class FireApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}

package com.example.opilane.service1;

import android.app.IntentService;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;

public class TheService extends IntentService {

    public TheService() {
        super("TheService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        long l = intent.getLongExtra("todo", 0);
        for (long i = 0; i < l; ++i) Math.sin(Math.sqrt(i));

        Uri defaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(getApplicationContext().getApplicationContext(), RingtoneManager.TYPE_RINGTONE);
        Ringtone defaultRingtone = RingtoneManager.getRingtone(getApplicationContext(), defaultRingtoneUri);
        defaultRingtone.play();
    }
}
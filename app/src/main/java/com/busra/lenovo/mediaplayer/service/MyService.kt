package com.busra.lenovo.mediaplayer.service

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import com.busra.lenovo.mediaplayer.R

class MyService :Service() {
    private lateinit var player: MediaPlayer
    override fun onBind(p0: Intent?): IBinder? {
        return null;
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        player = MediaPlayer.create(this, R.raw.edis)
        player.isLooping = true
        player.start()
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        player.stop()
    }






}
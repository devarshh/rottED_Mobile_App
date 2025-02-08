package com.example.rottED.ui.components

import android.content.Context
import android.media.MediaPlayer
import android.net.Uri
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView

@Composable
fun VideoPlayer(context: Context, videoUrl: String, isPlaying: Boolean  ) {
    // ExoPlayer for Video
    val exoPlayer = remember {
        ExoPlayer.Builder(context).build().apply {
            val mediaItem = MediaItem.Builder().setUri(Uri.parse(videoUrl)).build()
            setMediaItem(mediaItem)
            prepare()
            playWhenReady = true
            repeatMode = ExoPlayer.REPEAT_MODE_ALL
        }
    }
    LaunchedEffect(isPlaying) {
        exoPlayer.playWhenReady = isPlaying
    }

    // MediaPlayer for Audio
//    val mediaPlayer = remember { MediaPlayer() }
//
//    DisposableEffect(videoUrl) {
//        mediaPlayer.reset() // Reset before setting new data
//        mediaPlayer.setDataSource(context, Uri.parse(videoUrl)) // Set audio source
//        mediaPlayer.prepareAsync() // Prepare asynchronously to prevent UI lag
//
//        mediaPlayer.setOnPreparedListener {
//            it.start() // Start playing audio when ready
//        }
//
//        mediaPlayer.setOnCompletionListener {
//            it.seekTo(0) // Loop the audio
//            it.start()
//        }
//
//        onDispose {
//            mediaPlayer.release() // Release MediaPlayer to prevent memory leaks
//            exoPlayer.release()
//        }
//    }

    AndroidView(
        factory = { ctx ->
            PlayerView(ctx).apply {
                player = exoPlayer
                useController = false
            }
        },
        modifier = Modifier.fillMaxSize()
    )
}

package com.example.rottED.ui.screens

import android.content.Context
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.rottED.model.Video
import com.example.rottED.ui.components.VideoPlayer

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ReelsScreen(context: Context) {
    val videoList = listOf(
        Video("1", "Reel 1", "https://www.devarshjoshi.com/demovid1.MP4"),
        Video("2", "Reel 2", "https://www.devarshjoshi.com/demovid2.MP4"),
        Video("3", "Reel 3", "https://www.devarshjoshi.com/video9.MP4"),
        Video("4", "Reel 3", "https://www.devarshjoshi.com/demovid3.MP4"),
        Video("5", "Reel 3", "https://www.devarshjoshi.com/demovid4.MP4"),
        )

    val pagerState = rememberPagerState(pageCount = { videoList.size })

    VerticalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize()
    ) { page ->
        VideoPlayer(context, videoList[page].url, isPlaying = (page == pagerState.currentPage))
    }
}

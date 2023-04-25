package com.example.workermanagercounttime.ui.model

import androidx.lifecycle.ViewModel
import com.example.workermanagercounttime.data.repositories.DownloadImageRepository
import dagger.Provides
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val downloadImageRepository: DownloadImageRepository,
) : ViewModel() {
    fun onClick(){
        downloadImageRepository.startDownload()
    }
}
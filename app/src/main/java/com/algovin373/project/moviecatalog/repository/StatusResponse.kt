package com.algovin373.project.moviecatalog.repository

import com.algovin373.project.moviecatalog.model.DataMovie

interface StatusResponse {
    fun onSuccess(list: List<DataMovie>)
    fun onFailed()
}
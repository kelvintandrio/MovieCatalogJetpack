package com.algovin373.project.moviecatalog.repository.inter.movie

import com.algovin373.project.moviecatalog.model.DataMovie

interface StatusResponse {
    fun onSuccess(list: List<DataMovie>)
    fun onFailed()
}
package com.mona.picsearch.domain.repository

import com.mona.picsearch.data.model.Photos

interface SearchRepository {
    suspend fun search(query: String, currentPage: Int): Photos
}
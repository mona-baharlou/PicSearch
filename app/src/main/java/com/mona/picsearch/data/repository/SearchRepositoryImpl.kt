package com.mona.picsearch.data.repository

import com.mona.picsearch.data.api.RestAPI
import com.mona.picsearch.data.model.Photos
import com.mona.picsearch.domain.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val restAPI: RestAPI
) : SearchRepository {
    override suspend fun search(query: String, currentPage: Int): Photos {
        return restAPI.searchPic(text = query, page = currentPage).photos
    }
}

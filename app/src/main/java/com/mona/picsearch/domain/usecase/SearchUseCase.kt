package com.mona.picsearch.domain.usecase

import com.mona.picsearch.data.model.Photos
import com.mona.picsearch.domain.repository.SearchRepository
import javax.inject.Inject

class SearchUseCase @Inject constructor(
    private val searchRepository: SearchRepository
) {
    suspend fun invoke(query: String, currentPage: Int): Photos {
        return searchRepository.search(query = query, currentPage = currentPage)
    }
}
package io.github.aag.core.domain.models

data class Lesson(
    val id: Long,
    val title: String,
    val shortDescription: String?,
    val fullDescription: String?,
    val coverImgUrl: String?,
    val youtubeUrl: String?,
    val githubRepoUrl: String?,
    val telegramChannel: String?,
    val additionalMaterials: List<AdditionalMaterial>,
    val tags: List<String>,
    val startTimestampSec: Long,
    val endTimestampSec: Long,
    val isFavourite: Boolean
)
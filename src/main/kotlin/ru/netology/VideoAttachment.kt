package ru.netology

data class VideoAttachment(
	val id: Long,
	val ownerId: Long,
	val artist: String,
	val title: String,
	val description: String,
	val firstFrameUrl: String,
	val dateAdd: Int,
	override val type: String = "video",
	val video: Video = Video(),

	) : Attachment(type)

class Video {
}

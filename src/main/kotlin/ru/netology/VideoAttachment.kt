package ru.netology

open class VideoAttachment(
	val id: Long,
	val ownerId: Long,
	val artist: String,
	val title: String,
	val description: String,
	val firstFrameUrl: String,
	val dateAdd: Int,

	) : Attachment("Video")
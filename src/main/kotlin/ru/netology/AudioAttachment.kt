package ru.netology

open class AudioAttachment(
	val id: Long,
	val ownerId: Long,
	val artist: String,
	val title: String,
	val url: String,
	val dateAdd: Int,

	) : Attachment("Audio")
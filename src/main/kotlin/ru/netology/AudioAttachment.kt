package ru.netology

data class AudioAttachment(
	val id: Long,
	val ownerId: Long,
	val artist: String,
	val title: String,
	val url: String,
	val dateAdd: Int,
	override val type: String = "audio",
	val audio: Audio = Audio(),

	) : Attachment(type)

class Audio {
}

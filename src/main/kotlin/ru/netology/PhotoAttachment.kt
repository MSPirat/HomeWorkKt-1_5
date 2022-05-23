package ru.netology

data class PhotoAttachment(
	val id: Long,
	val albumId: Long,
	val ownerId: Long,
	val userAddId: Long,
	val text: String,
	val dateAdd: Int,
	override val type: String = "photo",
	val photo: Photo = Photo(),

	) : Attachment(type)

class Photo

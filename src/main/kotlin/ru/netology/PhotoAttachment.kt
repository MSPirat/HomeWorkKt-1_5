package ru.netology

open class PhotoAttachment(
	val id: Long,
	val albumId: Long,
	val ownerId: Long,
	val userAddId: Long,
	val text: String,
	val dateAdd: Int,

	) : Attachment("Photo")
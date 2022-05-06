package ru.netology

open class DocumentAttachment(
	val id: Long,
	val ownerId: Long,
	val title: String,
	val dateAdd: String,
	val size: Int,
	val url: String,

	) : Attachment("Document")
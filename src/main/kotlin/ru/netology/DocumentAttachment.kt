package ru.netology

data class DocumentAttachment(
	val id: Long,
	val ownerId: Long,
	val title: String,
	val dateAdd: String,
	val size: Int,
	val url: String,
	override val type: String = "document",
	val document: Document = Document(),

	) : Attachment(type)

class Document

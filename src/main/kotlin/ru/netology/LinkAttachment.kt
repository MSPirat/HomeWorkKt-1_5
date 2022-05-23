package ru.netology

data class LinkAttachment(
	val url: String,
	val title: String,
	val description: String,
	override val type: String = "link",
	val link: Link = Link(),

	) : Attachment(type)

class Link

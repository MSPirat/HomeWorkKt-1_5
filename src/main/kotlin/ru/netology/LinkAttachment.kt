package ru.netology

open class LinkAttachment(
	val url: String,
	val title: String,
	val description: String,

	) : Attachment("Link")
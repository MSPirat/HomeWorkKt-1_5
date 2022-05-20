package ru.netology

data class Comment(
	val commentId: Long,
	val postId: Long,
	val authorId: String,
	val date: Int,
	val text: String,
	val replyToUserId: Long,
	val replyToCommentId: Long,
	val attachment: Any?,
)

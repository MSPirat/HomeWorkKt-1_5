package ru.netology

import java.util.Objects

data class Post(
	val postId: Long,
	val ownerId: Long,
	val authorId: Long,
	val authorName: String,
	val dateTime: Long,    //https://i-leon.ru/tools/time
	val text: String,
	val replyOwnerId: Long,
	val replyPostId: Long,
	val friendsOnly: Boolean,
	val comments: Objects,
	val likes: Int, //= 0,
	val reposts: Objects,
	val views: Objects,
	val isFavorite: Boolean,
)
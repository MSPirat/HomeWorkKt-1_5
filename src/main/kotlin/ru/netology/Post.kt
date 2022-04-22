package ru.netology

import java.util.Objects

data class Post(
	val postId: Long,
	val authorId: Long,
	val authorName: String,
	val dateTime: Long,    //https://i-leon.ru/tools/time
	val text: String,
	val comments: Objects,
	val likes: Int = 0,
	val views: Objects,
)

object WallService {
	private var posts = emptyArray<Post>()

	fun add(post: Post): Post {
		posts += post
		return posts.last()
	}

	fun likeById(id: Long) {
		for ((index, post) in posts.withIndex()) {
			if (post.postId == id) {
				posts[index] = post.copy(likes = post.likes + 1)
			}
		}
	}
}
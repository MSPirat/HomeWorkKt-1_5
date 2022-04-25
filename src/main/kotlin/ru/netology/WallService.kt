package ru.netology

object WallService {
	private var posts = emptyArray<Post>()
	private var nextId: Long

	fun add(post: Post): Post {
		posts += if (posts.isEmpty()) {
			post.copy(postId = 0)
		} else {
			post.copy(postId = nextId)
		}
		nextId++
		return posts.last()
	}

	fun update(post: Post): Boolean {
		for ((postId, newPost) in posts.withIndex()) {
			if (newPost.postId == post.postId) {
				posts[postId] = newPost.copy(ownerId = newPost.ownerId, dateTime = newPost.dateTime)
				return true
			}
		}
		return false
	}

	fun likeById(id: Long) {
		for ((index, post) in posts.withIndex()) {
			if (post.postId == id) {
				posts[index] = post.copy(likes = post.likes + 1)
			}
		}
	}
}
package ru.netology

object WallService {
	private var posts = emptyArray<Post>()
	private var postsClear = emptyArray<Post>()
	private var comments = emptyArray<Comment>()
	private var nextId: Long = 0
	private var addComment: Boolean = false

	fun clear() {
		if (posts.isNotEmpty()) {
			posts = postsClear
			nextId = 0
		}
		return
	}

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
				posts[postId] = newPost.copy(ownerId = post.ownerId, date = post.date)
				return true
			}
		}
		return false
	}

	fun createComment(comment: Comment) {
		for (newPost in posts) {
			if (newPost.postId == comment.postId) {
				comments += comment
				addComment = true
			}
		}
		if (!addComment) {
			throw PostNotFoundException("Post not found")
		}
	}

	fun likeById(id: Long) {
		for ((index, post) in posts.withIndex()) {
			if (post.postId == id) {
				posts[index] = post.copy(likes = post.likes + 1)
			}
		}
	}
}
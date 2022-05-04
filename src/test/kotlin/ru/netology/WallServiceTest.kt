package ru.netology

import org.junit.Test
import org.junit.Before
import org.junit.Assert.*

class WallServiceTest {

	@Before
	fun clear() {
		WallService.clear()
	}

	@Test
	fun add() {
		// arrange
		val serviceTest = WallService
		serviceTest.add(Post(1, 2, 3, "author", 4, "text",
			5, 6, true, "comments", 7, "reposts",
			"views", true))
		val updateTest = Post(1, 2, 3, "author", 4, "text",
			5, 6, true, "comments", 7, "reposts",
			"views", true)

		//act
		val result = WallService.add(post = updateTest)

		//assert
		assertEquals(7, result.postId)
	}

	@Test
	fun updateTrue() {
		val serviceTest = WallService
		serviceTest.add(Post(1, 2, 3, "author", 4,
			"text", 5, 6, true, "comments", 7,
			"reposts", "views", true))
		serviceTest.add(Post(2, 2, 3, "author", 4,
			"text", 5, 6, true, "comments", 7,
			"reposts", "views", true))
		serviceTest.add(Post(3, 2, 3, "author", 4,
			"text", 5, 6, true, "comments", 7,
			"reposts", "views", true))

		val updateTest = Post(5, 2, 3, "author", 4, "text",
			5, 6, true, "comments", 7, "reposts",
			"views", true)

		val result = serviceTest.update(updateTest)

		assertTrue(result)
	}

	@Test
	fun updateFalse() {
		val serviceTest = WallService
		serviceTest.add(Post(1, 2, 3, "author", 4,
			"text", 5, 6, true, "comments", 7,
			"reposts", "views", true))
		serviceTest.add(Post(2, 2, 3, "author", 4,
			"text", 5, 6, true, "comments", 7,
			"reposts", "views", true))
		serviceTest.add(Post(3, 2, 3, "author", 4,
			"text", 5, 6, true, "comments", 7,
			"reposts", "views", true))

		val updateTest = Post(10, 2, 3, "author", 4, "text",
			5, 6, true, "comments", 7, "reposts",
			"views", true)

		val result = serviceTest.update(updateTest)

		assertFalse(result)
	}

	@Test
	fun likeById() {
	}
}
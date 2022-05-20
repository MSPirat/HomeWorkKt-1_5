package ru.netology

import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

	@Before
	fun clear() {
		WallService.clear()
	}

	@Test
	fun add() {
		// arrange
		val serviceTest = WallService
		serviceTest.add(
			Post(
				0, 2, 3, "author", 4, "text",
				5, 6, true, "comments", 7, "reposts",
				"views", true
			)
		)
		val updateTest = Post(
			0, 2, 3, "author", 4, "text",
			5, 6, true, "comments", 7, "reposts",
			"views", true
		)

		//act
		val result = WallService.add(post = updateTest)

		//assert
		assertEquals(1, result.postId)
	}

	@Test
	fun updateTrue() {
		val serviceTest = WallService
		serviceTest.add(
			Post(
				0, 2, 3, "author", 4,
				"text", 5, 6, true, "comments", 7,
				"reposts", "views", true
			)
		)
		serviceTest.add(
			Post(
				1, 2, 3, "author", 4,
				"text", 5, 6, true, "comments", 7,
				"reposts", "views", true
			)
		)
		serviceTest.add(
			Post(
				2, 2, 3, "author", 4,
				"text", 5, 6, true, "comments", 7,
				"reposts", "views", true
			)
		)

		val updateTest = Post(
			2, 2, 3, "author", 4, "text",
			5, 6, true, "comments", 7, "reposts",
			"views", true
		)

		val result = serviceTest.update(updateTest)

		assertTrue(result)
	}

	@Test
	fun updateFalse() {
		val serviceTest = WallService
		serviceTest.add(
			Post(
				0, 2, 3, "author", 4,
				"text", 5, 6, true, "comments", 7,
				"reposts", "views", true
			)
		)
		serviceTest.add(
			Post(
				1, 2, 3, "author", 4,
				"text", 5, 6, true, "comments", 7,
				"reposts", "views", true
			)
		)
		serviceTest.add(
			Post(
				2, 2, 3, "author", 4,
				"text", 5, 6, true, "comments", 7,
				"reposts", "views", true
			)
		)

		val updateTest = Post(
			10, 2, 3, "author", 4, "text",
			5, 6, true, "comments", 7, "reposts",
			"views", true
		)

		val result = serviceTest.update(updateTest)

		assertFalse(result)
	}

	@Test
	fun createComment() {
		WallService.add(
			Post(
				0, 2, 3, "author", 4,
				"text", 5, 6, true, "comments", 7,
				"reposts", "views", true
			)
		)

		val commentTest = Comment(
			1, 0, "author", 2, "text",
			3, 4, true
		)

		WallService.createComment(
			comment = commentTest
		)
	}

	@Test(expected = PostNotFoundException::class)
	fun shouldThrow() {
		WallService.createComment(
			comment = Comment(
				1, 10, "author", 2, "text",
				3, 4, true
			)
		)
	}
}

/*
 User: ophir
 Date: 08/11/13
 Time: 23:22
 */
package org.liqweed.boot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloControllerTest {

	@Test
	public void sayHello() {
		assertEquals("hello Bob!", new HelloController().sayHello("Bob"));
	}
}

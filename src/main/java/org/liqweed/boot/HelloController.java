/*
 User: ophir
 Date: 08/11/13
 Time: 23:14
 */
package org.liqweed.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	String sayHello() {
		return "hello";
	}
}

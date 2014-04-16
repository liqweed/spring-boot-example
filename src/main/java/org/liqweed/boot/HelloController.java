/*
 User: ophir
 Date: 08/11/13
 Time: 23:14
 */
package org.liqweed.boot;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello(@RequestParam(value="name", required=false, defaultValue="World") String name) {
		return String.format("hello %s!", name);
	}

	@RequestMapping("/pins")
	public List<Pin> getPins(@RequestParam(value="location", required=false) String location, @RequestParam(value="author", required=false) String author) {
		List<Pin> pins = Lists.newLinkedList();
		pins.add(new Pin(UUID.randomUUID(), "Boston", "Bob"));
		pins.add(new Pin(UUID.randomUUID(), "NY", "Lacy"));
		return pins;
	}
}

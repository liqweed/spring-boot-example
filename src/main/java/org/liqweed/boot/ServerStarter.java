/*
 User: ophir
 Date: 08/11/13
 Time: 23:19
 */
package org.liqweed.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("org.liqweed")
public class ServerStarter {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServerStarter.class, args);
	}
}

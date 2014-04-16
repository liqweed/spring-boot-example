/*
 User: oradnitz
 Date: 4/16/14
 Time: 4:10 PM
*/
package org.liqweed.boot;

import java.util.UUID;

public class Pin {

	private UUID id;
	private String location;
	private String author;

	public Pin() {
	}

	public Pin(UUID id, String location, String author) {
		this.id = id;
		this.location = location;
		this.author = author;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}

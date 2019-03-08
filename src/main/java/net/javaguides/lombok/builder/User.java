package net.javaguides.lombok.builder;

import lombok.Builder;

import lombok.ToString;

@Builder
@ToString
public class User {
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
}

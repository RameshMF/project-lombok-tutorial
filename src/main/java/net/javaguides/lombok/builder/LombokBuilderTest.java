package net.javaguides.lombok.builder;

import net.javaguides.lombok.builder.User.UserBuilder;

public class LombokBuilderTest {
	public static void main(String[] args) {
		// create builder class and add parameters to it.
		UserBuilder builder = new UserBuilder();

		builder.id(100L);
		builder.firstName("Ramesh");
		builder.lastName("Fadatare");
		builder.age(28);
		builder.gender("Male");
		builder.build();
		System.out.println();
		System.out.println(builder.toString());
		System.out.println();
	}
}

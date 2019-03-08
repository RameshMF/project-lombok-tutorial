package net.javaguides.lombok.nonnull;

import lombok.NonNull;
import net.javaguides.lombok.User;

public class NonNullLombokExample {
	private String name;

	public NonNullLombokExample(@NonNull User person) {
		this.name = person.getFirstName();
	}
	
	public static void main(String[] args) {
		NonNullLombokExample example = new NonNullLombokExample(null);
	}
}

package net.javaguides.lombok.value;

import java.time.LocalDate;

import lombok.Value;

@Value
public class UserLombokModel {
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String gender;

	public static void main(String[] args) {
	}
}

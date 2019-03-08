package net.javaguides.lombok.data;

import java.time.LocalDate;

public class LombokTest {
	public static void main(String[] args) {
		UserLombokModel lombokModel = new UserLombokModel();

		// test setter methods
		lombokModel.setId(100L);
		lombokModel.setFirstName("Ramesh");
		lombokModel.setLastName("Fadatare");
		lombokModel.setAge(28);
		lombokModel.setGender("Male");
		lombokModel.setCreatedDate(LocalDate.now());
		lombokModel.setUpdatedDate(LocalDate.now());

		UserLombokModel lombokModel2 = new UserLombokModel();

		lombokModel2.setId(100L);
		lombokModel2.setFirstName("Ramesh");
		lombokModel2.setLastName("Fadatare");
		lombokModel2.setAge(28);
		lombokModel2.setGender("Male");
		lombokModel2.setCreatedDate(LocalDate.now());
		lombokModel2.setUpdatedDate(LocalDate.now());

		// equals method
		System.out.println(lombokModel.equals(lombokModel2));

		// hashCode method
		System.out.println(lombokModel.hashCode());
		System.out.println(lombokModel2.hashCode());

		// toString method
		System.out.println(lombokModel.toString());
	}
}

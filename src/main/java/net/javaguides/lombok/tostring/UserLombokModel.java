package net.javaguides.lombok.tostring;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserLombokModel {
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String gender;
	
	
	public static void main(String[] args) {
		UserLombokModel lombokModel = new UserLombokModel();
		
		lombokModel.setId(100L);
		lombokModel.setFirstName("Ramesh");
		lombokModel.setLastName("Fadatare");
		lombokModel.setAge(28);
		lombokModel.setGender("Male");
		lombokModel.setCreatedDate(LocalDate.now());
		lombokModel.setUpdatedDate(LocalDate.now());
		
		System.out.println(lombokModel.toString());
	}
}

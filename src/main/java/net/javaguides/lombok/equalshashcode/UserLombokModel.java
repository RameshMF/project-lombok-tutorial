package net.javaguides.lombok.equalshashcode;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "createdDate")
@EqualsAndHashCode(exclude = "createdDate")
public class UserLombokModel {
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String gender;
	
}

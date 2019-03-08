package net.javaguides.lombok.gettersetter;

import java.time.LocalDate;

import lombok.Data;
import lombok.ToString;

/**
 * @Data is a convenient shortcut annotation that bundles the features of 
 * @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together.
 */

@Data
public class UserLombokModel {
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String gender;

	@ToString(includeFieldNames = true)
	@Data(staticConstructor = "of")
	public static class InnerClass<T> {
		private final String name;
		private final T value;
	}

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

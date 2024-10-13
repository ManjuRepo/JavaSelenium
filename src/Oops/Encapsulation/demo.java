package Oops.Encapsulation;

//To create getter & setter method use shoer cut (Alt+Shift+s) right click >> source>>select generate getter & setter select variable finish
public class demo {

	private String Name;
	private int age;
	private char grade;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
}

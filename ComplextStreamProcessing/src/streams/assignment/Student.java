package streams.assignment;

import java.util.List;

public class Student {
	private int studentId;
	private String name;
	private Address address;
	private List<MobileNumber> mobileNumbers;

	public Student() {

	}

	public Student(int studentId, String name, Address address, List<MobileNumber> mobileNumbers) {
		this.studentId = studentId;
		this.name = name;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<MobileNumber> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

}


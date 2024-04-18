package streams.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		Student st1=new Student(100,"Ranga",new Address("50002","Hyderabad"),Arrays.asList(new MobileNumber("2222"),new MobileNumber("2323")));
		Student st2=new Student(101,"Karan",new Address("80012","Bangalore"),Arrays.asList(new MobileNumber("3333"),new MobileNumber("4344")));
		Student st3=new Student(102,"Ruchi",new Address("50002","Hyderabad"),Arrays.asList(new MobileNumber("4444"),new MobileNumber("6666")));
		Student st4=new Student(103,"Thiru",new Address("40052","Chennai"),Arrays.asList(new MobileNumber("5555"),new MobileNumber("4567")));
		Student st5=new Student(104,"Shantanu",new Address("50032","Hyderabad"),Arrays.asList(new MobileNumber("7777"),new MobileNumber("6776")));
		Student st6=new Student(105,"Pavan",new Address("50012","Hyderabad"),Arrays.asList(new MobileNumber("7878"),new MobileNumber("5454")));
		//create 5 more students
		//Create a List of all the students
		List<Student> studentsList=Arrays.asList(st1,st2,st3,st4,st5,st6);
		//List all the students with city Hyderabad
		studentsList.stream().filter(st->st.getAddress().getCity().equals("Hyderabad")).forEach(st->System.out.println(st.getName()+" "+st.getAddress().getCity()));
		//find the student with mobile number 6666
		Optional<Student> stOp= studentsList.stream().filter(st->st.getMobileNumbers().stream().anyMatch(n->n.getNumber().equals("66666"))).findFirst();
		
		System.out.println(stOp.isPresent()?stOp.get().getName():"No Student with given Mobile No");
		
		//List all the students with pincode 50002
		//Find the first student with Name Ranga
	}

}

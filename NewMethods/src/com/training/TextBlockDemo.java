package com.training;

public class TextBlockDemo {

	public static void main(String[] args) {
		String post = "{\r\n" + "  \"userId\": 1,\r\n" + "  \"id\": 1,\r\n"
				+ "  \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\r\n"
				+ "  \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\r\n"
				+ "}";

		
		String postBlock = """
								{
				  "userId": 1,
				  "id": 1,
				  "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
				  "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
				}
								""";
		
		//String test1="""hello""";
		
		String designation = "Programmer";
		double salary = 100.50;

		String query = """
               SELECT emp_id, f_name, l_name FROM "EMPLOYEE"
               WHERE designation=%s
               AND salary > %.2f
               ORDER BY emp_id
               """.formatted(designation, salary);
		
		System.out.println(query);
		
		System.out.println(query.indent(4));
		
		
		String sentence="Once upon a time in Hyderabad";
		System.out.println(sentence.transform(String::toUpperCase));
		System.out.println(sentence.transform(String::length));
		
		

	}

}

package com.training;

public class TextBlockDemo2 {

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
		
		
		
		System.out.println(post.translateEscapes());

		String test="Hello There \n How are you\n You are the \"Shotgun\"";
		System.out.println(test.translateEscapes().indent(5));
		
	}

}

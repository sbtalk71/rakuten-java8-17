package com.training.client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class MyHttpClient {

	public static void main(String[] args) throws Exception {
		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
				.header("Accept", "application/json").GET().build();

		// HttpResponse<String> response=client.send(request, BodyHandlers.ofString());

		// System.out.println(response.body());

		/*
		 * client.sendAsync(request, BodyHandlers.ofString())
		 * .thenApply(HttpResponse::body) .thenAccept(System.out::println) .join();
		 */

		// POST Call
		String input = """
				{
				  "userId": 10,
				  "id": 99,
				  "title": "temporibus sit alias delectus eligendi possimus magni",
				  "body": "quo deleniti praesentium dicta non quod\naut est molestias\nmolestias et officia quis nihil\nitaque dolorem quia"
				}
				""";

		HttpRequest post_request = HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
				.header("Content-Type", "application/json")
				.POST(BodyPublishers.ofString(input))
				.build();
		
		HttpResponse<String> post_response=client.send(request, BodyHandlers.ofString());
		
		System.out.println(post_response.statusCode()); //200
	}

}

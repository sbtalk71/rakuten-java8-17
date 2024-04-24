package com.demo.app;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import com.demo.dao.EmpDB;

public class EmailSenderApp {

	public static void main(String[] args) throws Exception{
		ExecutorService executor=Executors.newCachedThreadPool();
		CompletableFuture<Void> cf=CompletableFuture
				.supplyAsync(()->EmpDB.getEmpList(),executor)
				.thenApplyAsync(list->{return list.stream().filter(e->e.getNewJoiner().equals("TRUE")).collect(Collectors.toList());},executor)
				.thenApplyAsync(nj->{return nj.stream().filter(j->j.getLearningPending().equals("TRUE")).map(e->e.getEmail()).collect(Collectors.toList());},executor)
				.thenAccept(e->e.stream().forEach(EmailSenderApp::sendMail));
		
		cf.get();
				

	}

	private static void sendMail(String mailAddress) {
		System.out.println("Mail sent to "+mailAddress);
	}
}

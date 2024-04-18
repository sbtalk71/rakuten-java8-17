package com.training.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
       // ExecutorService es= Executors.newFixedThreadPool(3);
        
    	//ExecutorService es= Executors.newCachedThreadPool();
    	
    	ExecutorService es= Executors.newSingleThreadExecutor();
    	
    	
        TableGenerator tg= new TableGenerator();
        
        es.execute(new Table(2,tg));
        es.execute(new Table(3,tg));
        es.execute(new Table(4,tg));
        
        es.shutdown();
        }
    }
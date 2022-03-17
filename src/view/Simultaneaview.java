package view;

import java.util.concurrent.Semaphore;

import controller.Simultaneacontroller;

public class Simultaneaview {

	public static void main(String[] args) {
Semaphore semaforo = new Semaphore(1);
		
		for (int threadId = 1; threadId < 22; threadId++) {
			
			Thread threadP = new Simultaneacontroller(threadId, semaforo);
			threadP.start();
		}
		
	}

}



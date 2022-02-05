package com.ion.training.oops.cohesion;

//This is a better way of approaching the problem. Different classes have their
//own responsibilities.

class InternetDownloader {
	public void downloadFromInternet() {
		// download
	}
}

class DataParser {
	public void parseData(String content) {
		// parse
	}
}

class DatabaseStore {
	public void storeIntoDatabase(String data) {
		// store in DB
	}
}

class ImprovedDownloadAndStore {
	void doEverything() {
		new InternetDownloader().downloadFromInternet();
		new DataParser().parseData("");
		new DatabaseStore().storeIntoDatabase("");
	}
}

public class CohesionExampleSolution {

}

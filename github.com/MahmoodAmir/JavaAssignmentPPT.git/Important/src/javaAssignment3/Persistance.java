package javaAssignment3;

class FilePersistence extends Persistance {

	@Override
	void persist() {
		System.out.println("File Persistence");
	}
}

class DatabasePersistence extends Persistance {

	@Override
	void persist() {
		System.out.println("Database Persistence");
		
		
	}
}

public abstract class Persistance {
	abstract void persist();
	
	public static void main(String args[]) {
		Persistance p = new DatabasePersistence();
		Persistance p1 = new FilePersistence();
		
			p.persist();
	}
	

}

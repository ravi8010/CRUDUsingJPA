import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainApp {

	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp"); // Create EntityManagerFactory
																							// object.
	static EntityManager entityManager = factory.createEntityManager(); // Create EntityManager object.

	public static void main(String args[]) {
		// crudOperatin
	//insertOperation();
	//retrieveOperation();
		// updateOperation();
	// deleteOperation();

	}

	private static void updateOperation() {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Student1 std=entityManager.find(Student1.class, 10);
		std.setName("mudit");
		
		entityTransaction.commit();

	}

	private static void deleteOperation() {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Student1 std=entityManager.find(Student1.class, 10);
		entityManager.remove(std);
		entityTransaction.commit();
		
		

	}

	private static void retrieveOperation() {
		// TODO Auto-generated method stub
		
		Student1 std=entityManager.find(Student1.class, 10);
		System.out.println("Name:"+std.getName());
		System.out.println("Mobile Number: "+std.getMobileNo());
		System.out.println("Id:" + std.getId());

	}

	private static void insertOperation() {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Student1 std=new Student1();
		std.setId(10);
		std.setName("Ravi");
		std.setMobileNo("1234");
		entityManager.persist(std);
		entityTransaction.commit();

	}

}

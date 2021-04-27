package com.pattern;

public class Main {
	 private static Dao<User> userDao;
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Phone p = new Phone("Ios",16);
		Phone c = new PhoneBuilder().setOs("android").setRam(8).getPhone();
		System.out.println(c);
		
		// Prototype 
		
		BookShop bs = new BookShop();		
		bs.setShopName("Peach");		
		bs.loadData();
		
		BookShop bs1 = (BookShop)bs.clone();		
		bs1.setShopName("Hope");
		bs1.loadData();
		
		System.out.println("------ PROTOTYPE EXAMPLE-----------");
		System.out.println(bs);
		System.out.println(bs1);
				
		// SingleTon 
		System.out.println("------ SINGLETON-----------");
		Student st = Student.getInstance();
		st.show();
		
		// DAO 
		System.out.println("------ DAO-----------");		
		
		userDao = new UserDao();
		 
	    User user1 = userDao.get(1).get();
	    System.out.println("user1: " + user1);
	         
	    user1.setName("updated." + user1.getName());
	    userDao.update(user1);
	         
	    System.out.println("All users: ");
	    userDao.getAll().forEach(user -> System.out.println(user));
		
		//FACTORY
	    
	    System.out.println("------ FACTORY-----------");	
	    
	    ColorFactory colorFactory = new ColorFactory();
	    Color color  = colorFactory.getInstance("Sky");
	    color.show();
	    
	    
		//DEPENCECY INJECTION 
	    
	    System.out.println("------ DEPENCECY INJECTION ----------");	
	    LaptopService lap = new Dell();
	    Customer cus = new Customer(lap);
	    cus.getReview();
	    
	}

}

package Model;


public class Employee {

//	public Employee() {
		// TODO Auto-generated constructor stub

		private int id;
		private String name,department,code;
		private double salaryRate;
		private int age;
		public Employee(int id, String name, int age, String department, String code, double salaryRate){
			this.id = id;
			this.name = name;
			this.department = department;
			this.code = code;
			this.salaryRate = salaryRate;
			this.age = age;
		}
		public int getID() {
	        return id;
	    }

	    public void setID(int id) {
	        this.id = id;
	    }

	   
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    
	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	   
	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	 
	    public String getCode() {
	        return code;
	    }

	    public void setCode(String code) {
	        this.code = code;
	    }

	   
	    public double getSalaryRate() {
	        return salaryRate;
	    }


	}



class MethodOverloading{
	public static void main(String[] args){
		user("Vaish" , 1234567890L);
	}
		public static void user(String name , long p_no){
			System.out.println("Just entered the very required fields");
			System.out.println("Name :" + name);
			System.out.println("long :" + p_no);
			
			}
		public static void user(String name , long p_no , String email){
			System.out.println("Just entered the required fields ");
			System.out.println("Name: " + name);
			System.out.println("Contact: " + p_no);
			System.out.println("Email: " + email);		
			}
			
		public static void user(String name , long p_no , String email ,int pincode ){
			System.out.println("Entered the required fields along with the address");
			System.out.println("Name: " + name);
			System.out.println("Contact: " + p_no);
			System.out.println("Email: " + email);	
			System.out.println("Pincode: " + pincode);
			
			}
			
		public static void user(String name , long p_no , String email ,int pincode , int age){
			System.out.println("Just entered the required fields along with some extra details");
			System.out.println("Name: " + name);
			System.out.println("Contact: " + p_no);
			System.out.println("Email: " + email);	
			System.out.println("Pincode: " + pincode);
			System.out.println("Age: " + age);
			
			}
			
		public static void user(String name , long p_no , String email ,int pincode , int age , long alt_phn_no ){
			System.out.println("Just entered the required fields");
			System.out.println("Name: " + name);
			System.out.println("Contact: " + p_no);
			System.out.println("Email: " + email);	
			System.out.println("Pincode: " + pincode);
			System.out.println("Age: " + age);
			System.out.println("Alt_p_no: " + alt_phn_no);
			
			}
}
			
package Assessment3;

public class Tester {
		public static void main(String[] args) {
		   
			Classteacher_Info object1=new Classteacher_Info("Alex","Java Fundamentals",1200.0);
			Classteacher_Info object2=new Classteacher_Info("John","RDBMS",800.0);
			Classteacher_Info object3=new Classteacher_Info("Sam","Networking",900.0);
			Classteacher_Info object4=new Classteacher_Info("Maria","Python",900.0);
		    
		    
			Classteacher_Info[]teacher={object1,object2,object3,object4};
		    
		    for(Classteacher_Info o:teacher)
		    {    
		        System.out.println("Name:"+o.getTeacherName()+","+"Subject:"+o.getSubject()+","+"Salary:"+o.getSalary());
		    }
		    
		     
		    
		}
	}



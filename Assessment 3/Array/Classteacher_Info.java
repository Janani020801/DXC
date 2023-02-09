package Assessment3;

 public class Classteacher_Info {
    private String teacherName;
    private String subject;
    private double salary;
    public Classteacher_Info(String teacherName,String subject,double salary)
    {
        this.teacherName=teacherName;
        this.subject=subject;
       this.salary= salary;
    }  
    public void setTeacherName(String teacherName)
    {
    	this.teacherName=teacherName;
     }
     public void setSubject(String subject)
        
        {
            this.subject=subject;
        }
         public void setSalary(double salary)
        {
            this.salary=salary;
        }
        public String getTeacherName()
        {
           return teacherName;
        }
        public String getSubject()
        {
            return subject;
        }
        public double getSalary()
        {
            return salary;
        }
        
 }
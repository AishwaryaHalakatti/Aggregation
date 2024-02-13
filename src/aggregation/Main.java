
package aggregation;

public class Main {
    public static void main(String args[])
    {
        Employee e=new Employee();
        e.setId(101);
        
        Address add=new Address();
        add.setHouseno(121);
        add.setCity("vijayapur");
        add.setState("karnataka");
        add.setCountry("india");
        e.setAddress(add);
        
        Salary s=new Salary();
        s.setBasic(25000.0f);
        s.setGross(45000.0f);
        e.setSalary(s);
        
        System.out.println("Profile section");
        System.out.println("id:"+e.getId());
        
        System.out.println("\nAddress details");
        System.out.println("\nHouse number:"+e.getAddress().getHouseno());
        System.out.println("\nCity:"+e.getAddress().getCity());
        System.out.println("\nState:"+e.getAddress().getState());
        System.out.println("\nCountry"+e.getAddress().getCountry());
        
        System.out.println("\nSalary Details");
        System.out.println("\nBasic Salary:"+e.getSalary().getBasic());
        System.out.println("\nGross Salary:"+e.getSalary().getGross());
        
    }
}

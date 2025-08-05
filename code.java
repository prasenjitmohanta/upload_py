import java.util.*;


//Employee class implementing comparable interface
class Employee implements Comparable<Employee>{
    String firstName; 
    String lastName;
    //constructor
    public Employee(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    //Implements the compareTO method to sort by last name 
    @Override
    public int compareTo(Employee i){
        return this.lastName.compareTo(i.lastName);
    }   
    //override tosString method to  display enployee names
    @Override
    public String toString(){
        return firstName + " " +lastName;
    }

   
}


public class sortExample{
    public static void main(String args[]){
        //setup array with employee class
        Employee a[]={
            new Employee("Kirk","Douglas"),
            new Employee("Keil","Bruks"),
            new Employee("houuil","Douglas"),
            new Employee("Kutts","itse"),
            new Employee("hhuri","Douglas"),
        };

        // sort the array with comparable interface
        Arrays.sort(a);

        //print sorted Employee
        for(Employee employee:a){
            System.out.println(employee);
        }
    }
}

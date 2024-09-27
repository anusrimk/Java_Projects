// Question 3
package Module_2;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    Employee(int id, String f, String l, int sal){
        this.id = id;
        this.firstName = f;
        this.lastName = l;
        this.salary = sal;
    };

    public int getId(){
        return this.id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getName(){
        return (this.firstName + " " + this.lastName);
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int sal){
        this.salary = sal;
    }

    public int getAnnualSalary(){
        return this.salary * 12;
    }

    public double raiseSalary(int percent){
        return (this.salary + (this.salary * (percent / 100)));
    }

    @Override
    public String toString(){
        return ("Employee [id = " +this.id+ ", name = " +this.firstName+ " " +this.lastName+ ", salary = " +this.salary+ "]");
    }
}

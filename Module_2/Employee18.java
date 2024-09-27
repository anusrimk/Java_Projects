// Question 18
package Module_2;

class Employee18 {
    private String name;
    private String address;
    private String jobTitle;
    private double salary;

    Employee18() {
        this.name = "";
        this.address = "";
        this.jobTitle = "";
        this.salary = 0.0;
    }

    Employee18(String name, String add, String job, double sal) {
        this.name = name;
        this.address = add;
        this.jobTitle = job;
        this.salary = sal;
    }

    public double calculateBonus() {
        return 0.0;
    }

    public String generatePerformanceReport() {
        return "No performance report available.";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee18 {
    private int numberOfSubordinates;

    Manager() {
        super();
        this.numberOfSubordinates = 0;
    }

    Manager(String name, String add, int num, double sal) {
        super(name, add, "Manager", sal);
        this.numberOfSubordinates = num;
    }

    public void manageProject() {
        System.out.println(getName() + " is managing a project.");
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public String generatePerformanceReport() {
        return getName() + " has an Excellent rating.";
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int num) {
        this.numberOfSubordinates = num;
    }
}

class Developer extends Employee18 {
    private String programmingLanguage;

    Developer() {
        super();
        this.programmingLanguage = "";
    }

    Developer(String name, String add, String language, double sal) {
        super(name, add, "Developer", sal);
        this.programmingLanguage = language;
    }

    public void writeCode() {
        System.out.println(getName() + " is writing code in " + programmingLanguage + ".");
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    @Override
    public String generatePerformanceReport() {
        return getName() + " has a Good rating.";
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String language) {
        this.programmingLanguage = language;
    }
}
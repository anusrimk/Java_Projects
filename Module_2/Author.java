// Question 5
package Module_2;

public class Author {
    private String name;
    private String email;
    private char gender;

    Author(String n, String e, char g){
        this.name = n;
        this.email = e;
        this.gender = g;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String e){
        this.email = e;
    }

    public char getGender(){
        return this.gender;
    }

    @Override
    public String toString(){
        return ("Author[name = " +this.name+ ", email = " +this.email+ ", gender = " +this.gender+ "]");
    }
}

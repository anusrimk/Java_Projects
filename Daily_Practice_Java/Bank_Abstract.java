package Daily_Practice_Java;

abstract class Bank{
    abstract int getRateOfInterest();
}

class SBI extends Bank{
    int getRateOfInterest() {return 7;}
}

class PNB extends Bank{
    int getRateOfInterest() {return 8;}
}

public class Bank_Abstract {
    public static void main(String args[]){
        // Bank b1 = new SBI();
        Bank b;

        b = new SBI();
        System.out.println("Rate of Interest is : "+b.getRateOfInterest()+"%");
        
        b = new PNB();
        System.out.println("Rate of Interest is : "+b.getRateOfInterest()+"%");
    }
}

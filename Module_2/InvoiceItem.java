// Question 4
package Module_2;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    InvoiceItem(String id, String desc, int q, double p){
        this.id = id;
        this.desc = desc;
        this.qty = q;
        this.unitPrice = p;
    }

    public String getId(){
        return this.id;
    }

    public String getDesc(){
        return this.desc;
    }

    public int getQty(){
        return this.qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public double getUnitPrice(){
        return this.unitPrice;
    }

    public void setUnitPrice(double p){
        this.unitPrice = p;
    }

    public double getTotal(){
        return (this.unitPrice * this.qty);
    }

    @Override
    public String toString(){
        return ("InvoiceItem [id = " +this.id+ ", desc = " +this.desc+ ", qty = " +this.qty+ ", unitPrice = " +this.unitPrice+ "]");
    }
}   

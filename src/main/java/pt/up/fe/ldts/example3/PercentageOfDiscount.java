package pt.up.fe.ldts.example3;

public class PercentageOfDiscount extends Discount{
    public PercentageOfDiscount(double discount){super(discount);}
    @Override
    public double applyDiscount(double price){return price -price*getDiscount();}
}

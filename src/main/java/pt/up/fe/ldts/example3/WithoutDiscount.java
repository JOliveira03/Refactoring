package pt.up.fe.ldts.example3;

public class WithoutDiscount extends Discount{
    public WithoutDiscount(){super(0);}
    @Override
    public double applyDiscount(double price){return price;}
}

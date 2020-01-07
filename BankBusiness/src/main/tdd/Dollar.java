package main.tdd;

public class Dollar extends Money {

//    private int amount;
    
    public Dollar(int amount){
        this.amount = amount;
    }
    
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    
//    public boolean equals(Object object) {
//        Money money = (Money)object;
//        return amount == money.amount;
//    }
}

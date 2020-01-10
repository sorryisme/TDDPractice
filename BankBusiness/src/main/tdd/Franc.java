package main.tdd;

public class Franc extends Money{

    private String currency;
    
    
    public Franc(int amount){
        this.amount = amount;
        currency = "CHF";
    }

    public Money times(int multiplier) {
        return new Franc( amount * multiplier);
    }

    @Override
    public String currency() {
        return "CHF";
    }

//    public boolean equals(Object object) {
//        Money money= (Money) object;
//        return amount == money.amount;
//    }
}

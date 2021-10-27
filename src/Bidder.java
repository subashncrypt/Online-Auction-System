//package Assingment;

public class Bidder {

    // class bidder that stores bidder data
    private int bidderId;
    private String name;
    private int numberOfLotsWon = 0;
    private int TotolAmountOwed = 0;

    // constructor to initialize bidder data
    public Bidder(int bidderId, String name) {
        this.bidderId = bidderId;
        this.name = name;
    }

    // getter and setter functions
    public Integer getBidderId() {
        return this.bidderId;
    }

    public void setBidderId(int bidderId) {
        this.bidderId = bidderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLotsWon() {
        return numberOfLotsWon;
    }

    public void setNumberOfLotsWon(int numberOfLotsWon) {
        this.numberOfLotsWon = numberOfLotsWon;
    }

    public int getTotolAmountOwed() {
        return TotolAmountOwed;
    }

    public void setTotolAmountOwed(int totolAmountOwed) {
        TotolAmountOwed = totolAmountOwed;
    }
}

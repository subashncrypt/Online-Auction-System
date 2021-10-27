//package Assingment;

public class Bid {

    // class bid that stored information of each bid
    private int lotNumber;
    private int bidderId;
    private int amount;

    // constructor to initialize variables
    public Bid(int lotNumber, int bidderId, int amount) {
        this.lotNumber = lotNumber;
        this.bidderId = bidderId;
        this.amount = amount;
    }

    // getter and setter function of the private variables
    public int getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    public int getBidderId() {
        return bidderId;
    }

    public void setBidderId(int bidderId) {
        this.bidderId = bidderId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}

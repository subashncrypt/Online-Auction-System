//package Assingment;

import java.util.ArrayList;

public class Auction {

    // Auction class stores' arraylist of lots
    // and places bid on particular auction

    // initializing private variables.
    private String name;
    private int firstLot;
    private int lastLot;
    private int minIncrementBid;
    private String status;
    private int totalBidSum;
    private ArrayList<Lot> lots = new ArrayList<>();   //lot array list

    // constructor to store auction name and minimum increment bid
    // create lots requested
    public Auction(String name, int firstLot, int lastLot, int minIncrementBid) {
        this.name = name;
        this.firstLot = firstLot;
        this.lastLot = lastLot;
        this.minIncrementBid = minIncrementBid;
        this.status = "new";

        // Create lots for associated with Auction
        for (int i=firstLot; i<=lastLot; i++){
            Lot l1 = new Lot(i,name, minIncrementBid);

            // add to the LOT array list
            lots.add(l1);
        }
    }

    // places bid on a particular lot based on certain rules
    // returns status of the bid
    public int placeBid(Bid bid){

        int status = 1;

        for (int i =0; i< lots.size();i++){

            //Select the particular lot the bid has to placed on
            if(lots.get(i).getNumber() == bid.getLotNumber()){

                // Send a bid to be processed and placed on a particular LOT
                status = lots.get(i).placeBid(bid);
            }
        }

        return status;

    }


    // Function to calculate the total bid sum of all the winning bids of an auction
    // this value used by auction status in the OnlineAuction system class
    private void caluculateTotalBidSum(){

        this.totalBidSum = 0;  // initializing the total sum bid

        // sum of all the official bid for an auction
        for (int i=0; i< lots.size(); i++){
            this.totalBidSum += lots.get(i).getOfficialBid();
        }
    }

    // function sets the auction to open
    // if the auction is new and makes sure not to reopen it
    // return true if the auction is opened for bids
    public boolean openAuction() {
        if(getStatus() != "open" && getStatus() == "new" && getStatus() != "closed"){
            setStatus("open");
            return true;
        }
        else {
            return false;
        }
    }


    // function to close auction only when the auction is open
    // return false in other case
    public boolean closeAuction() {
        if(getStatus() == "open"){

            setStatus("closed");
            return true;
        }
        else {
            return false;
        }

    }

    // Return the Winning bids for the lost of a particular auction
    // return the string of format [ lots no + official bid + bidder id]
    public String winningBids() {
        String winningBidsString="";

        for(int i=0; i<lots.size(); i++){
           winningBidsString += lots.get(i).getNumber()
                   +"\t"+lots.get(i).getOfficialBid()
                   +"\t" +lots.get(i).getBidderID()+"\n";
        }

        return winningBidsString;
    }


    // getter and setter function of the private variable

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFirstLot() {return firstLot;}

    public void setFirstLot(int firstLot) {
        this.firstLot = firstLot;
    }

    public int getLastLot() {
        return lastLot;
    }

    public void setLastLot(int lastLot) {this.lastLot = lastLot;}

    public int getMinIncrementBid() {
        return minIncrementBid;
    }

    public void setMinIncrementBid(int minIncrementBid) {
        this.minIncrementBid = minIncrementBid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalBidSum() {
        caluculateTotalBidSum();  // call to calculate total sum bid for each auction and sets the same.
        return totalBidSum;
    }

    public void setTotalBidSum(int totalBidSum) {
        this.totalBidSum = totalBidSum;
    }

    public ArrayList<Lot> getLots() {
        return lots;
    }

    public void setLots(ArrayList<Lot> lots) {
        this.lots = lots;
    }
}

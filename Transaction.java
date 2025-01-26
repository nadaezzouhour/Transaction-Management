package transac;

public abstract class Transaction {
    protected String transactionID;
    protected String clientID;
    public Transaction(String transactionID, String clientID) {
        this.transactionID = transactionID;
        this.clientID = clientID;
    }
     public abstract void execute();

    public void showDetails() {
        System.out.println("Transaction ID: "+ transactionID +" | Client ID: " + clientID);
    }
}

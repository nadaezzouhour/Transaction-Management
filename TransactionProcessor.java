package transac;

public class TransactionProcessor {
    public static void processTransaction(Transaction t) {
        t.execute();
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new InsertTransaction("Too1", "C1"));
        transactions.add(new UpdateTransaction("T002", "C002"));
        transactions.add(new DeleteTransaction("T003", "C003"));
        for (Transaction t : transactions) {
            t.showDetails();
            TransactionProcessor.processTransaction(t);
        }
    }
}
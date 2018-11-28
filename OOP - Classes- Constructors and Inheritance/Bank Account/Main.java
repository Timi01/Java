package BankAccount;

public class Main {

    public static void main(String[] args) {
        Account johnsAccount = new Account();

        System.out.println(johnsAccount.getBalance());

        johnsAccount.setNumber("001");
        //johnsAccount.setBalance(0.0);
        johnsAccount.setCustomerName("John Doe");
        johnsAccount.setEmailAddress("myemail@john.com");
        johnsAccount.setPhoneNumber("646-123-4567");

        johnsAccount.deposit(1000);
        johnsAccount.withdrawal(100);

        Account timisAccount = new Account("002", 0.0, "Timea Nemet",
                "timi.nt01@gmail.com", "060-123-1324");
        timisAccount.deposit(100_000);




    }
}

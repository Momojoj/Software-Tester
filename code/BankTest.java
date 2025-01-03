import Bank.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {
	private Bank bank;
	private Account account1;
	private Account account2;
	
	@BeforeEach
	public void Setup() {
		bank = new Bank();
		account1 = new Account("Habibah Masae","123456",500.0);
		account2 = new Account("Onnicha Srisaman","654321",1000.0);
	}
	
	@Test
	public void AddAccountTest() {
		bank.addAccount(account1);
		assertEquals(1, bank.getAccounts().size()); //บัญชีควรมีแค่ 1 บัญชี
        assertEquals(account1, bank.getAccounts().get(0)); //บัญชีที่เพิ่มจะเป็น บัญชีaccount1
	}
	
	@Test
	public void RemoveAccountTest() {
		bank.addAccount(account1);
		bank.removeAccount(account1);
		//System.out.println(bank.getAccounts());
		assertEquals(0, bank.getAccounts().size()); //บัญชี account1 จะถูกลบ
	}
	
	@Test
	public void DepositMoneyTest() {
		bank.addAccount(account1);
		bank.depositMoney(account1, 200.0);
		assertEquals(700.0, account1.getBalance()); //ยอดเงินจะเหลือ 700 เพราะฝากเพิ่ม 200
	}
	
	@Test
	public void WithdrawMoney() {
		bank.addAccount(account1);
        bank.withdrawMoney(account1, 100.0);
        assertEquals(400.0, account1.getBalance()); // ยอดเงินจะเหลือ 400.0 เพราะถอนเงิน 100
	}
	
	@Test
	public void GetAccountTest() {
		bank.addAccount(account1);
        bank.addAccount(account2);
        assertEquals(2, bank.getAccounts().size()); // ใน bank จะมี 2 บัญชี
        assertTrue(bank.getAccounts().contains(account1));
        assertTrue(bank.getAccounts().contains(account2));
	}
	
	
}



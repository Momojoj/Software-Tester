import Bank.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {
	private Account account ;
	
	
	@BeforeEach
	public void setup() {
		account = new Account("Habibah Masae","123456",500.0);
	}
	
	@Test
	public void GetNameTest() {
		//System.out.println(account.getName());
		assertEquals("Habibah Masae",account.getName()); //ชื่อบัญชีจะเป็นชื่อ Habibah Masae
		
	}
	
	@Test
	public void SetNameTest() {
		account.setName("Onnicha Srisaman");
		//System.out.println(account.getName());
		assertEquals("Onnicha Srisaman", account.getName()); //ชื่อบัญชีจะเปลี่ยนเป็น Onnicha Srisaman
	}
	
	@Test
	public void GetAccountNumberTest() {
		String expected = "123456";
		String result = account.getAccountNumber();
		System.out.println(account.getAccountNumber());
		assertEquals(expected, result); //เลขบัญชี 123456
	}
	
	@Test
	public void SetAccountNumberTest() {
		account.setAccountNumber("654321");
		assertEquals("654321", account.getAccountNumber()); //เลขบัญชีจะเปลี่ยนเป็น 654321
	}
	@Test
	public void GetBalanceTest() {
		assertEquals(500.0, account.getBalance()); // มียอดเงิน 500
	}
	
	@Test
	public void SetBalanceTest() {
		account.setBalance(0);
		assertEquals(0, account.getBalance()); // กำหนดยอดเงินเป็น 0 
	}
	
	@Test
	public void DepositTest() {
		account.deposit(200.0);
        assertEquals(700.0, account.getBalance()); // ยอดเงินจะเหลือ 700 หลังจากฝากเพิ่ม 200
    }
	
	@Test
	public void WithdrawTest() {
		account.withdraw(100.0);
		//System.out.println(account.getBalance());
        assertEquals(400.0, account.getBalance()); // ยอดเงินเหลือ 400 หลังจากถอน 100
	}
	
	
	
	@Test
	public void AccountInfoTest() {
		 String expectedInfo = "Name: Habibah Masae, Account Number: 123456, Balance: 500.0";
		 //System.out.println(account.getAccountInfo());
	     assertEquals(expectedInfo, account.getAccountInfo());
	}

}

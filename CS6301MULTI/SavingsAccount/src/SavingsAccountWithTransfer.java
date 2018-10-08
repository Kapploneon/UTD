import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 95-3. Add a transfer() method that transfers a sum from one account to another.
 */
public class SavingsAccountWithTransfer extends SavingsAccount {

  private final Lock transferMutex = new ReentrantLock();

  /**
   * transfer() method transfers a sum from one account to another
   */
  public void transfer(int k, Account reserve) {
    this.transferMutex.lock();
    try {
      reserve.withdraw(k);
      this.deposit(k);
    } finally {
      this.transferMutex.unlock();
    }
  }
}

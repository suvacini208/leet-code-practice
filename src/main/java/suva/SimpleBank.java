package suva;

import java.util.HashMap;
import java.util.Map;

public class SimpleBank {

        Map<Integer, Long> accountMap = new HashMap<Integer, Long>();
        public SimpleBank(long[] balance) {
            for(int i = 0; i < balance.length; i++) {
                accountMap.put(i+1, balance[i]);
            }
        }
        
        public boolean transfer(int account1, int account2, long money) {
                System.out.println("account1: " + account1);
                System.out.println("account2: " + account2);
            if(account1 <= accountMap.size() && account2 <= accountMap.size()) {
                long currentBalance = accountMap.get(account1);
                System.out.println("currentBalance: " + currentBalance);
                System.out.println("money: " + money);
                if(money > 0 && currentBalance >= money) {
                    accountMap.put(account1  , currentBalance-money);
                    accountMap.put(account2, accountMap.get(account2) + money);
                    return true;
                }
            }
            return false;
        }
        
        public boolean deposit(int account, long money) {
            if(account <= accountMap.size() && money > 0) {
                long currentBalance = accountMap.get(account);
                accountMap.put(account, currentBalance+money);
                return true;
            }
            return false;

        }
        
        public boolean withdraw(int account, long money) {
            if(account <= accountMap.size()) {
                long currentBalance = accountMap.get(account);
                if(money > 0 && currentBalance >= money) {
                    accountMap.put(account, currentBalance-money);
                    return true;
                }
            }
            return false;
        }
    

    public static void main(String[] args) {
        
        String[] operations = {"Bank", "withdraw", "transfer", "deposit", "transfer", "withdraw"};
        long[][] amounts = {{10,100,20,50,30}, {3, 10}, {5, 1, 20}, {5, 20}, {3, 4, 15}, {10, 50}};
        boolean[] results = new boolean[operations.length-1];
        SimpleBank simpleBank = new SimpleBank(amounts[0]);
        for(int i = 1; i < amounts.length; i++) {
            switch (operations[i]) {
                case "withdraw":
                    results[i-1] = simpleBank.withdraw((int)amounts[i][0], amounts[i][1]);
                    break;

                case "deposit":
                    results[i-1] = simpleBank.deposit((int)amounts[i][0], amounts[i][1]);
                    break;

                case "transfer":
                    results[i-1] = simpleBank.transfer((int)amounts[i][0], (int)amounts[i][1], amounts[i][2]);
                    break;
            
                default:
                    break;
            }
        }
        for(boolean result : results) {
            System.out.print(result);
        }
    }
}

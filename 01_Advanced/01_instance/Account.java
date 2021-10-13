public class Account implements Comparable<Account> {
    String accountNo;
    int number;
    int zandaka;

    public Account(int number, int zandaka) {
        this.number = number;
        this.zandaka = zandaka;
    }

    public int compareTo(Account obj) {
        if (this.number < obj.number) {
            return -1;
        }
        if (this.number > obj.number) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        if (!(o instanceof Account)) return false;
        Account r = (Account)o;
        if (!this.accountNo.trim().equals(r.accountNo.trim())) {
            return false;
        }
        return true;
    }
}

package a5_class;

public class BankAccount {
    // 필드
    // accountNumber 계좌번호
    // ownerName 예금주 이름
    // balance 잔액
    String accountNumber;
    String ownerName;
    double balance;

    // 생성자 (기본과 매개변수 있는 것)
    public BankAccount() {
    }
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // 메서드
    // deposit(입금할 금액) : 돈을 입금하는 메서드 (양수만 가능)
    // withdraw(출금할 금액) : 돈을 출금하는 메서드(양수만 가능. 잔액보다 출금액이 많으면 경고표시)
    // toString() : 계좌번호, 예금주이름, 잔액 화면출력
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("출금액에 오류가 있습니다.");
            return false; // 입금실패하면 false
        }else {
            this.balance = this.balance + amount;
            return true; // 입금성공하면 true
        }
    }
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("출금액에 오류가 있습니다.");
            return false;
        }else if (amount > this.balance) {
            System.out.println("출금액이 잔액보다 큽니다.");
            return false;
        }else {
            this.balance = this.balance - amount;
            return true;
        }
    }
    @Override
    public String toString() {
        return accountNumber + " " + ownerName + " " + balance;
    }
}

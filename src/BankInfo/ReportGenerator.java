package BankInfo;

public class ReportGenerator {
	public void printReport(Account a1) {
		System.out.print(a1.getAcctNo()+" ");
		System.out.print(a1.getDate1() +" ");
		System.out.print(a1.getCreditAmt()==0?"-" : a1.getCreditAmt()+" ");
		System.out.print(a1.getDebitAmt()==0?"- " : a1.getDebitAmt()+" ");
		System.out.print(a1.getClosureAmt()==0?"- " : a1.getClosureAmt());
		System.out.println();
	}
	public void printHeaders() {
		System.out.println("Account No    Date        Credit Amount Debit Amount Closure Amount");
	}
}

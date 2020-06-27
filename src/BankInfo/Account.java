package BankInfo;

import java.util.Date;

public class Account {
	private Date date1;
	private String acctNo;
	private int creditAmt;
	private int debitAmt;
	private int closureAmt;

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public int getCreditAmt() {
		return creditAmt;
	}

	public void setCreditAmt(int creditAmt) {
		this.creditAmt = creditAmt;
	}

	public int getDebitAmt() {
		return debitAmt;
	}

	public void setDebitAmt(int debitAmt) {
		this.debitAmt = debitAmt;
	}

	public int getClosureAmt() {
		return closureAmt;
	}

	public void setClosureAmt(int closureAmt) {
		this.closureAmt = closureAmt;
	}
	
	public Account(Date date1,String acctNo,int creditAmt,int debitAmt,int closureAmt) {
		this.date1 = date1;
		this.acctNo = acctNo;
		this.creditAmt= creditAmt;
		this.debitAmt=debitAmt;
		this.closureAmt=closureAmt;
	}
}

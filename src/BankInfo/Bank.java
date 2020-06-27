package BankInfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Bank {
	public static final String delimiter = ",";

	public void readFromFile(String fileName) throws ParseException {
		try {
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			String[] tempArr;
			Account[] accounts = new Account[0];
			ReportGenerator newReportGenerator = new ReportGenerator();
			newReportGenerator.printHeaders();
			while ((line = br.readLine()) != null) {
				tempArr = line.split(delimiter);
				// for(String tempStr : tempArr) {
				// System.out.print(tempStr + " ");
				Date date1 = getDate(tempArr[0]);
				String acctNo = tempArr[1];
				int creditAmount = Integer.parseInt(tempArr[2]);
				int debitAmount, closureAmout;
				if (tempArr[3].contentEquals("-")) {
					debitAmount = 0;
				} else {
					debitAmount = Integer.parseInt(tempArr[3]);
				}
				if (tempArr[4].contentEquals("-")) {
					closureAmout = 0;
				} else {
					closureAmout = Integer.parseInt(tempArr[4]);
				}
				Account newAccount = new Account(date1, acctNo, creditAmount, debitAmount, closureAmout);

				newReportGenerator.printReport(newAccount);
				// }
				// System.out.println();
			}
			br.close();
			fr.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public Date getDate(String strDate) throws ParseException {
		Date d1 = new Date();
		DateFormat format = new SimpleDateFormat("DD/MM/YYYY HH:MM", Locale.ENGLISH);
		d1 = format.parse(strDate);
		return d1;
	}

	public static void main(String args[]) throws ParseException {
		System.out.println("Welcome to Newscape Bank.");
		// Read File and Print
		Bank b1 = new Bank();
		String fileName = "src/BankInfo/bankDetails.cvc";
		b1.readFromFile(fileName);
	}
}

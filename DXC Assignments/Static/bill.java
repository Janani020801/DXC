package example;

class bill {
	private static int counter;
	private String billId, paymentMode;
	
	static {
		counter = 9000;
	}
	
	public bill(String paymentMode) {
		this.billId = "B"+ ++counter;
		this.paymentMode = paymentMode;
	}

	public static int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}





	public static void main(String[] args) {
		bill bill1 = new bill("DebitCard");
		bill bill2 = new bill("PayPal");
		bill bill3 = new bill("UPI");
		bill bill4 = new bill("NetBanking");
		
		bill[] bills = { bill1, bill2,bill3,bill4 };
		for (bill bill : bills) {
		System.out.println("Bill Details");
		System.out.println("Bill Id: " + bill.getBillId());
		System.out.println("Payment method: " + bill.getPaymentMode());
		System.out.println();
		}
	}
}
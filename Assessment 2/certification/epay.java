package Oops_Assign;
class epay {
    private double walletBalance;

    public epay(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public boolean makePayment(double billAmount) {
        if (walletBalance >= billAmount) {
            walletBalance -= billAmount;
            return true;
        }
        return false;
    }

    public double getWalletBalance() {
        return walletBalance;
    }
}

class KYCUser extends epay {
    private double rewardPoints;

    public KYCUser(double walletBalance) {
        super(walletBalance);
    }

    @Override
    public boolean makePayment(double billAmount) {
        boolean paymentSuccess = super.makePayment(billAmount);
        if (paymentSuccess) {
            rewardPoints += 0.1 * billAmount;
        }
        return paymentSuccess;
    }

    public double getRewardPoints() {
        return rewardPoints;
    }
}

class EPayWallet {
    public static void processPaymentByUser(epay user, double billAmount) {
        boolean paymentSuccess = user.makePayment(billAmount);
        if (paymentSuccess) {
            System.out.println("Payment successful, remaining wallet balance: " + user.getWalletBalance());
        } else {
            System.out.println("Insufficient balance, payment failed");
        }
        if (user instanceof KYCUser) {
            KYCUser kycUser = (KYCUser) user;
            System.out.println("your Reward points: " + kycUser.getRewardPoints());
        }
    }

 public class payment{
    public static void main(String[] args) {
        epay user1 = new epay(700);
        EPayWallet.processPaymentByUser(user1, 1500);
        KYCUser kycUser1 = new KYCUser(200);
        EPayWallet.processPaymentByUser(kycUser1, 100);
       
    }
}
}

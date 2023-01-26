public class Test0 {
    public static void main(String[] args) {

        Amazon customer = new Amazon();
        float payableAmount = customer.Transaction(1000);
        System.out.println("Total Payable " + payableAmount);
    }
}

class Amazon {
    float Transaction(float amt) {
        GPay gpayobj = new GPay();
        float totalAmount = amt + (amt * gpayobj.getTxnCharge());
        return totalAmount;
    }
}

class GPay {
    private float txnCharge = 0.05f;
    public float getTxnCharge(){
        return txnCharge;
    }

}

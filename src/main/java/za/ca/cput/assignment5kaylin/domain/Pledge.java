package za.ca.cput.assignment5kaylin.domain;

public class Pledge
{
    private String pledgeNum, paymentType;

    private Pledge(){}

    private Pledge(Builder builder)
    {
        this.pledgeNum = builder.pledgeNum;
        this.paymentType = builder.paymentType;
    }

    public String getPledgeNum() {return pledgeNum;}
    public String getPaymentType() {return paymentType;}

    public static class Builder
    {
        private String pledgeNum, paymentType;

        public Builder pledgeNum(String pledgeNum)
        {
            this.pledgeNum = pledgeNum;
            return this;
        }
        public Builder paymentType(String paymentType)
        {
            this.paymentType = paymentType;
            return this;
        }
        public Pledge build() {
            return new Pledge(this);
        }

        @Override
        public String toString()
        {
            return "Pledge Number" + pledgeNum + " Payment type" + paymentType;
        }
    }
}

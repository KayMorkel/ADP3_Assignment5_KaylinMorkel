package za.ca.cput.assignment5kaylin.domain;

import javafx.geometry.Side;

public class SidesPerson
{
    private String sal, payType;

    private SidesPerson(){}

    private SidesPerson(Builder builder)
    {
        this.sal = builder.sal;
        this.payType = builder.payType;
    }

    public String getSal() {return sal;}
    public String getPayType() {return payType;}

    public static class Builder
    {
        private String sal, payType;

        public Builder sal(String sal)
        {
            this.sal = sal;
            return this;
        }
        public Builder payType(String payType)
        {
            this.payType = payType;
            return this;
        }
        public SidesPerson build() {
            return new SidesPerson(this);
        }

        @Override
        public String toString()
        {
            return "SP sal" + sal + " SPPAyType" + payType;
        }
    }
}

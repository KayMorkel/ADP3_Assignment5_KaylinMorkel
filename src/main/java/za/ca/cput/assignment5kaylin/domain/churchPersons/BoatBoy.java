package za.ca.cput.assignment5kaylin.domain.churchPersons;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BoatBoy
{
    @Id
    private String sal;
    private String payType;

    private BoatBoy(){}

    private BoatBoy(Builder builder)
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
        public BoatBoy build() {
            return new BoatBoy(this);
        }

        @Override
        public String toString()
        {
            return "BB sal" + sal + " BBPayType" + payType;
        }
    }
}

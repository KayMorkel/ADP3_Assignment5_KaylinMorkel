package za.ca.cput.assignment5kaylin.domain.churchPersons;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person
{
    @Id
    private String pName;
    private String pTelNumber;

    private Person(){}

    private Person(Builder builder)
    {
        this.pName = builder.pName;
        this.pTelNumber = builder.pTelNumber;
    }

    public String getpName() {return pName;}
    public String getpTelNumber() {return pTelNumber;}

    public static class Builder
    {
        private String pName, pTelNumber;

        public Builder pName(String pName)
        {
            this.pName = pName;
            return this;
        }
        public Builder pTelNumber(String pTelNumber)
        {
            this.pTelNumber = pTelNumber;
            return this;
        }
        public Person build() {
            return new Person(this);
        }

        @Override
        public String toString()
        {
            return "Person name" + pName + " Person tel number" + pTelNumber;
        }
    }
}

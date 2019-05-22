package za.ca.cput.assignment5kaylin.domain.churchPersons;

public class Person
{
    private String pName, pTelNumber;

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

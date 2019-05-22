package za.ca.cput.assignment5kaylin.domain.churchAdmin;

public class IncomingMoney
{
    private String id, from;

    private IncomingMoney(){}

    private IncomingMoney(Builder builder)
    {
        this.id = builder.id;
        this.from = builder.from;
    }

    public String getId() {return id;}
    public String getFrom() {return from;}

    public static class Builder
    {
        private String id, from;

        public Builder id(String id)
        {
            this.id = id;
            return this;
        }
        public Builder from(String from)
        {
            this.from = from;
            return this;
        }
        public IncomingMoney build() {
            return new IncomingMoney(this);
        }

        @Override
        public String toString()
        {
            return "Moneyid" + id + " MoneyFrom" + from;
        }
    }
}

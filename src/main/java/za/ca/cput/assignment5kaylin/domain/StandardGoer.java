package za.ca.cput.assignment5kaylin.domain;

public class StandardGoer
{
    private boolean pledger;

    private StandardGoer(){}

    private StandardGoer(Builder builder)
    {
        this.pledger = builder.pledger;
    }

    public boolean isPledger() {return pledger;}

    public static class Builder
    {
        private boolean pledger;

        public Builder pledger(boolean pledger)
        {
            this.pledger = pledger;
            return this;
        }
        public StandardGoer build() {
            return new StandardGoer(this);
        }

        @Override
        public String toString()
        {
            return "Is he/she a pledger" + pledger;
        }
    }
}

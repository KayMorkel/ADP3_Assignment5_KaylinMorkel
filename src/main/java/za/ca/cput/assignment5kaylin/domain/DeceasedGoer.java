package za.ca.cput.assignment5kaylin.domain;

public class DeceasedGoer
{
    private String decNum, yearDied;

    private DeceasedGoer(){}

    private DeceasedGoer(Builder builder)
    {
        this.decNum = builder.decNum;
        this.yearDied = builder.yearDied;
    }

    public String getDecNum() {return decNum;}
    public String getYearDied() {return yearDied;}

    public static class Builder
    {
        private String decNum, yearDied;

        public Builder decNum(String decNum)
        {
            this.decNum = decNum;
            return this;
        }
        public Builder yearDied(String yearDied)
        {
            this.yearDied= yearDied;
            return this;
        }
        public DeceasedGoer build() {
            return new DeceasedGoer(this);
        }

        @Override
        public String toString()
        {
            return "deceasedNum" + decNum+ " yearDied" + yearDied;
        }
    }
}

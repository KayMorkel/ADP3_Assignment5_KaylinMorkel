package za.ca.cput.assignment5kaylin.domain;

public class Priest
{
    private String sal, inductDate;

    private Priest(){}

    private Priest(Builder builder)
    {
        this.sal = builder.sal;
        this.inductDate = builder.inductDate;
    }

    public String getSal() {return sal;}
    public String getInductDate() {return inductDate;}

    public static class Builder
    {
        private String sal, inductDate;

        public Builder sal(String sal)
        {
            this.sal = sal;
            return this;
        }
        public Builder inductDate(String inductDate)
        {
            this.inductDate = inductDate;
            return this;
        }
        public Priest build() {
            return new Priest(this);
        }

        @Override
        public String toString()
        {
            return "Priest salary" + sal + " Priest inductDate" + inductDate;
        }
    }
}

package za.ca.cput.assignment5kaylin.domain.churchPersons;

public class MarriedGoer
{
    private String id, yearMarried;

    private MarriedGoer(){}

    private MarriedGoer(Builder builder)
    {
        this.id = builder.id;
        this.yearMarried = builder.yearMarried;
    }

    public String getId() {return id;}
    public String getYearMarried() {return yearMarried;}

    public static class Builder
    {
        private String id, yearMarried;

        public Builder id(String id)
        {
            this.id = id;
            return this;
        }
        public Builder yearMarried(String yearMarried)
        {
            this.yearMarried = yearMarried;
            return this;
        }
        public MarriedGoer build() {
            return new MarriedGoer(this);
        }

        @Override
        public String toString()
        {
            return "Marriage id" + id + " Year married" + yearMarried;
        }
    }
}

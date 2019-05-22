package za.ca.cput.assignment5kaylin.domain.churchPersons;

public class ChurchCongregationGoer
{
    private String goerId, goerType;

    private ChurchCongregationGoer(){}

    private ChurchCongregationGoer(Builder builder)
    {
        this.goerId = builder.goerId;
        this.goerType = builder.goerType;
    }

    public String getGoerId() {return goerId;}
    public String getGoerType() {return goerType;}

    public static class Builder
    {
        private String goerId, goerType;

        public Builder goerId(String goerId)
        {
            this.goerId = goerId;
            return this;
        }
        public Builder goerType(String goerType)
        {
            this.goerType = goerType;
            return this;
        }
        public ChurchCongregationGoer build() {
            return new ChurchCongregationGoer(this);
        }

        @Override
        public String toString()
        {
            return "CongregationGoer name" + goerId + " CongregationGoer Type" + goerType;
        }
    }
}

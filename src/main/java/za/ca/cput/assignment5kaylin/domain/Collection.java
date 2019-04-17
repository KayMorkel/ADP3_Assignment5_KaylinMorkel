package za.ca.cput.assignment5kaylin.domain;

public class Collection
{
    private String collectId;
    private double collectAmt;

    private Collection(){}

    private Collection(Builder builder)
    {
        this.collectId = builder.collectId;
        this.collectAmt = builder.collectAmt;
    }

    public String getCollectId() {return collectId;}
    public double getCollectAmt() {return collectAmt;}

    public static class Builder
    {
        private String collectId;
        private double collectAmt;

        public Builder collectId(String collectId)
        {
            this.collectId = collectId;
            return this;
        }
        public Builder collectAmt(double collectAmt)
        {
            this.collectAmt = collectAmt;
            return this;
        }
        public Collection build() {
            return new Collection(this);
        }

        @Override
        public String toString()
        {
            return "Collect Id" + collectId + " CollectedAmount" + collectAmt;
        }
    }
}

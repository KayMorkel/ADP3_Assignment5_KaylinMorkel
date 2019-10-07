package za.ca.cput.assignment5kaylin.domain.churchPersons;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ChurchCongregationGoer
{
    @Id
    private String goerId;
    private String goerType;

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

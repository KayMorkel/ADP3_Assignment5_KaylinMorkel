package za.ca.cput.assignment5kaylin.domain.churchPersons;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FrailGoer
{
    @Id
    private String frailNum;
    private String type;

    private FrailGoer(){}

    private FrailGoer(Builder builder)
    {
        this.frailNum = builder.frailNum;
        this.type = builder.type;
    }

    public String getFrailNum() {return frailNum;}
    public String getType() {return type;}

    public static class Builder
    {
        private String frailNum, type;

        public Builder frailNum(String frailNum)
        {
            this.frailNum = frailNum;
            return this;
        }
        public Builder type(String type)
        {
            this.type = type;
            return this;
        }
        public FrailGoer build() {
            return new FrailGoer(this);
        }

        @Override
        public String toString()
        {
            return "Frail person number" + frailNum + " frail person type" + type;
        }
    }
}

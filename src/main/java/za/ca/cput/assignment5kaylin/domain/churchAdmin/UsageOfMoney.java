package za.ca.cput.assignment5kaylin.domain.churchAdmin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UsageOfMoney
{
    @Id
    private String id;
    private String usedFor;

    private UsageOfMoney(){}

    private UsageOfMoney(Builder builder)
    {
        this.id = builder.id;
        this.usedFor = builder.usedFor;
    }

    public String getId() {return id;}
    public String getUsedFor() {return usedFor;}

    public static class Builder
    {
        private String id, usedFor;

        public Builder id(String id)
        {
            this.id = id;
            return this;
        }
        public Builder usedFor(String usedFor)
        {
            this.usedFor = usedFor;
            return this;
        }
        public UsageOfMoney build() {
            return new UsageOfMoney(this);
        }

        @Override
        public String toString()
        {
            return "usage id" + id + " usage for" + usedFor;
        }
    }
}

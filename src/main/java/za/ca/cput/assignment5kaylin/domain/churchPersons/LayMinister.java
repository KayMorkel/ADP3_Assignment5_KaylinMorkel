package za.ca.cput.assignment5kaylin.domain.churchPersons;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LayMinister
{
    @Id
    private String id;
    private String name;

    private LayMinister(){}

    private LayMinister(Builder builder)
    {
        this.id = builder.pId;
        this.name = builder.name;
    }

    public String getId() {return id;}
    public String getName() {return name;}

    public static class Builder
    {
        private String pId, name;

        public Builder id(String pId)
        {
            this.pId = pId;
            return this;
        }
        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public LayMinister build() {
            return new LayMinister(this);
        }

        @Override
        public String toString()
        {
            return "LayMinister name" + pId + " layMinister name"  + name;
        }
    }
}

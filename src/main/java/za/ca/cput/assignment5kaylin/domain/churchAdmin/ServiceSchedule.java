package za.ca.cput.assignment5kaylin.domain.churchAdmin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServiceSchedule
{
    @Id
    private String id;
    private String type;

    private ServiceSchedule(){}

    private ServiceSchedule(Builder builder)
    {
        this.id = builder.id;
        this.type = builder.type;
    }

    public String getId() {return id;}
    public String getType() {return type;}

    public static class Builder
    {
        private String id, type;

        public Builder id(String id)
        {
            this.id = id;
            return this;
        }
        public Builder type(String type)
        {
            this.type = type;
            return this;
        }
        public ServiceSchedule build() {
            return new ServiceSchedule(this);
        }

        @Override
        public String toString()
        {
            return "id" + id + " type" + type;
        }
    }
}

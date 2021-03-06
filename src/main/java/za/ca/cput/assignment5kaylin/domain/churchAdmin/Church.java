package za.ca.cput.assignment5kaylin.domain.churchAdmin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Church
{
    @Id
    private String churchId;
    private String address;

    private Church(){}

    private Church(Builder builder)
    {
        this.churchId = builder.churchId;
        this.address = builder.address;
    }

    public String getChurchId() {return churchId;}
    public String getAddress() {return address;}

    public static class Builder
    {
        private String churchId, address;

        public Builder churchId(String churchId)
        {
            this.churchId = churchId;
            return this;
        }
        public Builder address(String address)
        {
            this.address = address;
            return this;
        }
        public Church build() {
            return new Church(this);
        }

        @Override
        public String toString()
        {
            return "Church ID" + churchId + " Church Address" + address;
        }
    }
}

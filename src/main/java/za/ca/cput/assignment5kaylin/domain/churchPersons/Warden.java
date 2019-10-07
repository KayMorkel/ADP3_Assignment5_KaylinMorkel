package za.ca.cput.assignment5kaylin.domain.churchPersons;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Warden
{
    @Id
    private String wardenName;
    private String wardenTelNumber;

    private Warden(){}

    private Warden(Builder builder)
    {
        this.wardenName = builder.wardenName;
        this.wardenTelNumber = builder.wardenTelNumber;
    }

    public String getWardenName() {return wardenName;}
    public String getWardenTelNumber() {return wardenTelNumber;}

    public static class Builder
    {
        private String wardenName, wardenTelNumber;

        public Builder wardenName(String wardenName)
        {
            this.wardenName = wardenName;
            return this;
        }
        public Builder wardenTelNumber(String wardenTelNumber)
        {
            this.wardenTelNumber = wardenTelNumber;
            return this;
        }
        public Warden build() {
            return new Warden(this);
        }

        @Override
        public String toString()
        {
            return "Warden name" + wardenName + " Warden tel number" + wardenTelNumber;
        }
    }


}

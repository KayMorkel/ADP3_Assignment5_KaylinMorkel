package za.ca.cput.assignment5kaylin.domain.churchPersons;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StandardGoer
{
    @Id
    private String pledger;

    private StandardGoer(){}

    private StandardGoer(Builder builder)
    {
        this.pledger = builder.pledger;
    }

    public String getPledger() {return pledger;}

    public static class Builder
    {
        private String pledger;

        public Builder pledger(String pledger)
        {
            this.pledger = pledger;
            return this;
        }
        public StandardGoer build() {
            return new StandardGoer(this);
        }

        @Override
        public String toString()
        {
            return "Is he/she a pledger" + pledger;
        }
    }
}

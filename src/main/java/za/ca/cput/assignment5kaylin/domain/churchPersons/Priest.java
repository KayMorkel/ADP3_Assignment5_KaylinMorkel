package za.ca.cput.assignment5kaylin.domain.churchPersons;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Priest
{
    @Id
    private String sal;
    private String inductDate;

    private Priest(){}

    private Priest(Builder builder)
    {
        this.sal = builder.sal;
        this.inductDate = builder.inductDate;
    }

    public String getSal() {return sal;}
    public String getInductDate() {return inductDate;}

    public static class Builder
    {
        private String sal, inductDate;

        public Builder sal(String sal)
        {
            this.sal = sal;
            return this;
        }
        public Builder inductDate(String inductDate)
        {
            this.inductDate = inductDate;
            return this;
        }
        public Priest build() {
            return new Priest(this);
        }

        @Override
        public String toString()
        {
            return "Priest salary" + sal + " Priest inductDate" + inductDate;
        }
    }
}

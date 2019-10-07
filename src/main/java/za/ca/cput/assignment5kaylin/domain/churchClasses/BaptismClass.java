package za.ca.cput.assignment5kaylin.domain.churchClasses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BaptismClass
{
    @Id
    private String classNo;
    private String classTime;

    private BaptismClass(){}

    private BaptismClass(Builder builder)
    {
        this.classNo = builder.classNo;
        this.classTime = builder.classTime;
    }

    public String getClassNo() {return classNo;}
    public String getClassTime() {return classTime;}

    public static class Builder
    {
        private String classNo, classTime;

        public Builder classNo(String classNo)
        {
            this.classNo = classNo;
            return this;
        }
        public Builder classTime(String classTime)
        {
            this.classTime = classTime;
            return this;
        }
        public BaptismClass build() {
            return new BaptismClass(this);
        }

        @Override
        public String toString()
        {
            return "ClassNo" + classNo + " ClassTime" + classTime;
        }
    }
}

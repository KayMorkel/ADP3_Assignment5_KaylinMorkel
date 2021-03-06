package za.ca.cput.assignment5kaylin.domain.churchClasses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ConfirmationClass
{
    @Id
    private String classNo;
    private String classTime;

    private ConfirmationClass(){}

    private ConfirmationClass(Builder builder)
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
        public ConfirmationClass build() {
            return new ConfirmationClass(this);
        }

        @Override
        public String toString()
        {
            return "ClassNo" + classNo + " ClassTime" + classTime;
        }
    }
}

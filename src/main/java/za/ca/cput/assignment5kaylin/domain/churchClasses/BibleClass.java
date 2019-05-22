package za.ca.cput.assignment5kaylin.domain.churchClasses;

public class BibleClass
{
    private String classNo, classTime;

    private BibleClass(){}

    private BibleClass(Builder builder)
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
        public BibleClass build() {
            return new BibleClass(this);
        }

        @Override
        public String toString()
        {
            return "ClassNo" + classNo + " ClassTime" + classTime;
        }
    }
}

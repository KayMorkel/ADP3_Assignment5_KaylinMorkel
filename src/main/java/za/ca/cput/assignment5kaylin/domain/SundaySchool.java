package za.ca.cput.assignment5kaylin.domain;

public class SundaySchool
{
    private String classNo;

    private SundaySchool(){}

    private SundaySchool(Builder builder)
    {
        this.classNo = builder.classNo;
    }

    public String getClassNo() {return classNo;}

    public static class Builder
    {
        private String classNo;

        public Builder classNo(String classNo)
        {
            this.classNo = classNo;
            return this;
        }
        public SundaySchool build() {
            return new SundaySchool(this);
        }

        @Override
        public String toString()
        {
            return "Class number" + classNo;
        }
    }
}

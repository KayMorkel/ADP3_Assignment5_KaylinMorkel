package za.ca.cput.assignment5kaylin.domain;

public class Teacher
{
    private String id, type;

    private Teacher(){}

    private Teacher(Builder builder)
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
        public Teacher build() {
            return new Teacher(this);
        }

        @Override
        public String toString()
        {
            return "Teacher id" + id + " Teacher type" + type;
        }
    }
}

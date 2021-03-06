package za.ca.cput.assignment5kaylin.domain.churchPersons;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
    @Id
    private String studId;
    private String studType;

    private Student(){}

    private Student(Builder builder)
    {
        this.studId = builder.studId;
        this.studType = builder.studType;
    }

    public String getStudId() {return studId;}
    public String getStudType() {return studType;}

    public static class Builder
    {
        private String studId, studType;

        public Builder studId(String studId)
        {
            this.studId = studId;
            return this;
        }
        public Builder studType(String studType)
        {
            this.studType = studType;
            return this;
        }
        public Student build() {
            return new Student(this);
        }

        @Override
        public String toString()
        {
            return "Student id" + studId + " Student type" + studType;
        }
    }
}

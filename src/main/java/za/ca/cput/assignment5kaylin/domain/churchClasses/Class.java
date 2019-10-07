package za.ca.cput.assignment5kaylin.domain.churchClasses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Class
{
    @Id
    private String classId;
    private int numOfStudents;

    private Class(){}

    private Class(Builder builder)
        {
            this.classId = builder.classId;
            this.numOfStudents = builder.numOfStudents;
        }

        public String getClassId() {return classId;}
        public int getNumOfStudents() {return numOfStudents;}

        public static class Builder
        {
            private String classId;
            private int numOfStudents;

            public Builder classId(String classId)
            {
                this.classId = classId;
                return this;
            }
            public Builder numOfStudents(int numOfStudents)
            {
                this.numOfStudents = numOfStudents;
                return this;
            }
            public Class build() {
                return new Class(this);
            }

            @Override
            public String toString()
            {
                return "Class type: " + classId + " Number of students: " + numOfStudents;
            }
        }
}


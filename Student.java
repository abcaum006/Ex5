public class Student {
    private final String name;
    private final String university;
    private final int age;

    private Student(Builder builder) {
        this.name = builder.name;
        this.university = builder.university;
        this.age = builder.age;
    }

    // Getter methods

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public int getAge() {
        return age;
    }

    // Builder class
    public static class Builder {
        private final String name;
        private final String university;
        private int age;

        public Builder(String name, String university) {
            this.name = name;
            this.university = university;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
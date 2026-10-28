class Person {
    private String name;
    private String email;
    private int age;

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() { return this.name; }
    public void setName(String name) {
        if (name != null && !name.isEmpty())
            this.name = name;
    }

    public String getEmail() { return this.email; }
    public void setEmail(String email) {
        if (email.contains("@"))
            this.email = email;
    }

    public int getAge() { return this.age; }
    public void setAge(int age) {
        if (0 < age && age < 150)
            this.age = age;
    }

    // Wszystkie 3 fieldy muszą posiadać settery dla walidacji
};


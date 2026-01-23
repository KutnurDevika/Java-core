class StudentWithConstructor {

    String name;
    int age;

    StudentWithConstructor(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        StudentWithConstructor s1 = new StudentWithConstructor("Devika", 20);
        s1.display();
    }
}


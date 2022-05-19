class TestEmployee {
    int salary;
    String name;
    int id;

    void insert (int i, String n, int s){
        id = i;
        name = n;
        salary = s;
    }
    void display(){
        System.out.println(id+ "," +name+ "," +salary);}
}

class Employee {
    public static void main(String[] args) {
        TestEmployee e1 = new TestEmployee();
        TestEmployee e2 = new TestEmployee();
        TestEmployee e3 = new TestEmployee();
        TestEmployee e4 = new TestEmployee();
        TestEmployee e5 = new TestEmployee();
        TestEmployee e6 = new TestEmployee();
        TestEmployee e7 = new TestEmployee();
        TestEmployee e8 = new TestEmployee();
        TestEmployee e9 = new TestEmployee();
        TestEmployee e10 = new TestEmployee();
        e1.insert(101, "Alex", 15000);
        e2.insert(102, "Brenda", 14000);
        e3.insert(103, "Camilla", 17000);
        e4.insert(104, "David", 16000);
        e5.insert(105, "Eleen", 15000);
        e6.insert(106, "Fred", 19000);
        e7.insert(107, "Gray", 17000);
        e8.insert(108, "Hannah", 13000);
        e9.insert(109, "Ivone", 11000);
        e10.insert(110, "Jack", 10000);
        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
        e6.display();
        e7.display();
        e8.display();
        e9.display();
        e10.display();
    }
    class Intern{
        public static void main(String[] args) {

        }
    }
}


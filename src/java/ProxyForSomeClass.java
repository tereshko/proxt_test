package java;

import java.util.ArrayList;
import java.util.List;

public class ProxyForSomeClass implements SomeInterface {
    private SomeInterface someInterface;

    public ProxyForSomeClass() {
        this.someInterface = new SomeClass();
    }

    @Override
    public List<String> getStudents() {
        List<String> test = new ArrayList<>();
        test.add("test1");
        test.add("test2");
        return test;
    }

    @Override
    public String getStudent(int id) {
        String test = "Piotr";
        return test;
    }

    @Override
    public List<Integer> getStudentsId() {
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        return test;
    }

    public Integer getStudentCount() {
        return getStudents().size();
    }

    public Integer getFirstStudent() {
        return getStudents().indexOf(0);
    }
}

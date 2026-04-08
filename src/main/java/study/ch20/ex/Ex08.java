package study.ch20.ex;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
class Employee {
    private String name;
    private String dept;
    private int salary;
}

public class Ex08 {
    public static void main(String[] args) {
        List<Employee> emps = List.of(
                new Employee("김", "개발팀", 4000),
                new Employee("이", "마케팅", 3500),
                new Employee("박", "개발팀", 4500),
                new Employee("최", "인사팀", 3000),
                new Employee("정", "개발팀", 3800)
        );    // 직원 전체

        // 부서별
        List<Employee> devTeam = new ArrayList<>();
        List<Employee> markTeam = new ArrayList<>();
        List<Employee> persTeam = new ArrayList<>();

        for (Employee employee : emps) {
            if ("개발팀".equals(employee.getDept())) devTeam.add(employee);
            if ("마케팅".equals(employee.getDept())) markTeam.add(employee);
            if ("인사팀".equals(employee.getDept())) persTeam.add(employee);
        }

        System.out.println(devTeam);
        System.out.println(markTeam);
        System.out.println(persTeam);
    }
}

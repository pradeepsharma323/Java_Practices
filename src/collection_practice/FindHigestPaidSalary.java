package collection_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindHigestPaidSalary {
    public static void main(String[] args) {
       List<Employee> empList= Stream.of(
                new Employee(1,"Pradeep", "DEV",153020),
                new Employee(3,"Ram", "QA",10000),
                new Employee(5,"Shyam", "DEV",12344),
                new Employee(4,"Vivek", "DEV",11345)
        ).collect(Collectors.toList());

        List<String> employeeNames = Arrays.asList("Rachael","Ross","Monica",
                "Chandler","Joey","Phoebe");

        // sort using lambda

        System.out.println("Sorted String List Based on Name:"+employeeNames.stream().sorted(Comparator.comparing(String::new)).collect(Collectors.toList()));

       // Comparator
        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);
       // find higest paid employee so first group by department
     /* Map<String, Optional<Employee>> mpa= empList.stream().collect(
              Collectors.groupingBy(Employee::getDepartment), Collectors.reducing(BinaryOperator.maxBy(compareBySalary))
      );*/

        // print only pradeep name data

        // who salary are more than 10K

        empList.stream().filter(emp-> emp.getSalary()>10000).collect(Collectors.toList()).stream()
                        .filter(emp1-> Boolean.parseBoolean(emp1.getName())).
                collect(Collectors.toList()).forEach(x1-> System.out.println());

        empList.stream().
                filter(emp -> emp.getName().equalsIgnoreCase("Pradeep"))
                .collect(Collectors.toList()).forEach(name -> System.out.println("print only name"+ name));

        // Find higest salary From Employee Class.
        Employee e=empList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Higest Salay Paid Person:"+e);

        // Sort List based on id or name
        empList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()).forEach(System.out::println);

        // map into map
        System.out.println(empList.stream().collect(Collectors.toMap(employee -> employee.getName(),employee -> employee)));
    }

}

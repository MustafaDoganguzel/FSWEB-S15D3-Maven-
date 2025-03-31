package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "mustafa", "doganguzel"));
        employeeList.add(new Employee(1, "mustafa", "doganguzel"));
        employeeList.add(new Employee(2, "bilge", "doganguzel"));
        employeeList.add(new Employee(3, "peri", "doganguzel"));

    }
    public static List<Employee> findDuplicates(List<Employee> employeeList){
        Set<Employee> uniques = new HashSet<>();
        List<Employee> duplicates = new ArrayList<>();
        for (Employee employee : employeeList){
            if(!uniques.add(employee)){
                duplicates.add(employee);
            }
        }
            return duplicates;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> employeeList) {
    /*    Set<Employee> uniques = new HashSet<>();
        for (Employee employee : employeeList){
          uniques.add(employee);
        }
        return new ArrayList<>(uniques);
    }
    // kod dogru fakat test Map ile yapmamizi istiyor *****************
     */
      Map<Integer, Employee > uniqueMap = new HashMap<>();
      Set<Employee> unique = new HashSet<>();
      for (Employee e : employeeList){
          if(unique.add(e)){
              uniqueMap.put(e.getId(), e);
          }
      } return uniqueMap;
    }

    public static List<Employee> removeDuplicates(List<Employee> employeeList){
        Set<Employee> unique = new HashSet<>();
        List<Employee> duplicates = new ArrayList<>();

        for (Employee e : employeeList){
            if (!unique.add(e)){
                // islem yapma
            } else{
                duplicates.add(e);
            }
        }
        return duplicates;
    }
    // duplicate'leri bulup silmemizi istiyor
}
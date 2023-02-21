package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController1 {
	@Value(value="${value.name}")
	private String newnameString;
     @GetMapping("/")
     public String homepage()
     {
    	 return newnameString+"Welcome to student list";
     }
     @GetMapping("/list")
     public List<Student>getList(){
    	 List<Student>detailsList=new ArrayList<>();
    	 detailsList.add(new Student(1,"XX",32));
    	 detailsList.add(new Student(2,"YX",3));
    	 detailsList.add(new Student(3,"AX",2));
    	 detailsList.add(new Student(4,"XB",1));
    	 return detailsList;
     }
}

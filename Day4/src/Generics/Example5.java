package Generics;
import java.util.*;
import java.io.*;
class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name, int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student st) {
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
}

public class Example5 {

	public static void main(String[] args) {
		ArrayList<Student> a= new ArrayList<Student>();
       a.add(new Student(1,"Karthik",22));
       a.add(new Student (2,"Naveen",22));
       a.add(new Student (3,"Sai",24));
       Collections.sort(a);
       for(Student st:a) {
    	   System.out.println(st.rollno+" "+st.name+" +"+st.age);
       }
	}

}

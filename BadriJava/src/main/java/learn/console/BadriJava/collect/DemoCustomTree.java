package learn.console.BadriJava.collect;

import java.util.TreeSet;

public class DemoCustomTree 
{
	public static void main(String[] args) 
	{
		TreeSet<Course> tree=new TreeSet<Course>();
		
		tree.add(new Course("Java Stack", "Spring,Hibernate", 30000, 120));
		tree.add(new Course("MERN Stack", "React,Express,Node", 32000, 110));
		tree.add(new Course("Python Stack", "React,DJango,Flask", 31500, 100));
		tree.add(new Course("Datastructures", "C,Algorithms,implementations", 5000, 60));
		
		System.out.println(tree);
	}
}

class Course implements Comparable<Course>
{
	String name;
	String covered;
	Integer fees;
	Integer duration;
	public Course(String name, String covered, Integer fees, Integer duration) {
		super();
		this.name = name;
		this.covered = covered;
		this.fees = fees;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", covered=" + covered + ", fees=" + fees + ", duration=" + duration + "]\n";
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Course o) {
		// TODO Auto-generated method stub
		//return this.duration.compareTo(o.duration);
		return o.covered.compareTo(this.covered);
	}
}
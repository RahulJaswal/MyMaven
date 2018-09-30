package com.rahul.MyMaven;

import org.springframework.core.io.FileSystemResource;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 * Hello world!
 *
 */
class One implements Serializable
{
	String name;
	Integer roll,marks;
	transient Integer val;			//we can use static or transient to get rid of serialization
									//(which means the value for this member will not be stored)
	
	
	
	public Integer getVal() {
		return val;
	}
	public void setVal(Integer val) {
		this.val = val;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public Integer getRoll() 
	{
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
}
public class App
{
   public static void main(String arg[])			//serialization
	{
	   One obj=new One();
	   obj.setMarks(124);
	   obj.setName("Rahul");
	   obj.setRoll(110);
	   obj.setVal(99);
	   
	   
	   File file=new File("F:\\My Doc\\obj.txt");
	try
	{
		FileOutputStream out=new FileOutputStream(file);
		System.out.println("file created");
		BufferedOutputStream bout=new BufferedOutputStream(out);
		System.out.println("opened");
		ObjectOutputStream obout=new ObjectOutputStream(bout);
		System.out.println("object stream");
		obout.writeObject(obj);
		System.out.println("object written");
		obout.close();
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	System.out.println("done");
	
	
	}
}

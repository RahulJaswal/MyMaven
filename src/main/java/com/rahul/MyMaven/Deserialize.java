package com.rahul.MyMaven;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize
{

	public static void main(String[] args) 
	{
		One obj=new One();
		try
		{
			FileInputStream fin=new FileInputStream("F:\\My Doc\\obj.txt");
			BufferedInputStream bfin=new BufferedInputStream(fin);
			ObjectInputStream robj= new ObjectInputStream(bfin);
			obj=(One) robj.readObject();		//object received
			robj.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Name is "+obj.getName()+" Roll no: "+obj.getRoll()+" Marks: "+obj.getMarks()+" Value:"+obj.getVal());
	}

}

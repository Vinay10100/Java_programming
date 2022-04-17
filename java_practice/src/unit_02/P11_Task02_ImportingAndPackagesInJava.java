package unit_02;//Inside this package we can create many classes!

/*
- A Java package is a group of similar types of classes,interfaces and sub-packages.
- Package in Java can be categorized in two forms'
- buit-in package (lang, awt, javax, swing, net, io, util, sql)
- user-defined package

- Package also helps to avoid class name collision
- Package also helps us to maintain access protection in Java
- Packages are named in reversed order of domain names
- unit01.javaproject.com-> "com.javaproject.unit01 "

import java.util.vector; // import the vector class from util package
import java.util.*; // import all the classes from util package

Static Import
- Static import is a feature introduced in java programming language( versions 5 and above)
that allows members (fields and methods) defined in a class as public static, to be used in
Java code without specifying the class in which the field is defined

 */

import static java.lang.System.*;
import static java.lang.Math.*;

import unit_01.P1_Task01_FirstJavaProgram;

public class P11_Task02_ImportingAndPackagesInJava {

	public static void main(String[] args) {
		out.println("Welcome to Package");

		out.println(sqrt(4));
		System.out.println(pow(2, 2));
		System.out.println(abs(6.3));

		P1_Task01_FirstJavaProgram obj = new P1_Task01_FirstJavaProgram();
		System.out.println(obj.a);
	}
}
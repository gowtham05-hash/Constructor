import java.util.Scanner;
public class Main {
	String name;
	int age;
	String color;
	String breed;
public Main(String name,int age,String color,String breed) {
	this.name = name;
	this.age = age;
	this.color = color;
	this.breed = breed;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public String getColor() {
	return color;
}
public String getBreed(){
	return breed;
}
public String Display() {
	return ("My dog name is: " + this.name +"\nMy Dog age is: " + this.age+"\nMy Dog color is: "+this.color+"\nMy Dog Breed is: "+this.breed);
}
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your Dog Name: ");
	String name = input.nextLine();
	System.out.print("Enter your Dog Age: ");
	int age = input.nextInt();
	input.nextLine();
	System.out.print("Enter your Dog Color: ");
	String color = input.nextLine();
	System.out.print("Enter your Dog Breed: ");
	String breed = input.nextLine();
	input.close();
	Main obj = new Main(name,age,color,breed);
	System.out.println(obj.Display());
}
}
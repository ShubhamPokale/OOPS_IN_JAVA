package Basic_OOPS;

class Student2{
	public int id;
	public String name;
	public int age;
//creating two arg constructor  
public Student2(int i,String n)
{
	id = i;
	name = n;
}
//creating three arg constructor  
Student2(int i,String n,int a){
id = i;
name = n;

}
void display()
{
	System.out.println(id+" "+name+" "+age);
	}
public static void main(String args[]) {
	
}
}
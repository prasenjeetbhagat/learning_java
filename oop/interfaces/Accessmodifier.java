public class Accessmodifier {
    public static void main(String [] args){
        student obj= new student();
        // obj.name ="Prasenjeet";  //eg1
      
        obj.setName(name:"Prasenjeet"); 
        //   obj.display();eg1
        System.out.println(obj.getName());
    }
}


class Student{
    string name;
    public void setNAme(String name){
        this.name = name;

    }

    public void display(){
        System.out.println("Name :"+ name);
    }
    public string getName(){
        return name;
    }

}



 class Aorray
{
    int age;
    String name;
    String address;

}




public class Student {
    public static void main(String[] args) {

    Aorray a1 = new Aorray();
    Aorray a2 = new Aorray();
    Aorray a3 = new Aorray();
    a1.age=15;
    a1.name= "pramish poduel";
    a1.address = "bhaktapur";

    a2.age=25;
    a2.name= "pramish ";
    a2.address = "lalitpur";

    a3.age=35;
    a3.name= "suman";
    a3.address = "kathmandu";

    Aorray aorrays[] = new Aorray[3];
    aorrays[0]=a1;
    aorrays[1]=a2;
    aorrays[2]=a3;

    for(int i=0;i<aorrays.length;i++)
    {
        System.out.println(aorrays[i].name+" "+aorrays[i].age);
    }

    }
}

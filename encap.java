class member{
    String name;
    private int age = 12;
    
    private int printmess(){
        return age;
    }
    public void mess(){
        
        System.out.println(printmess());
    }
}


public class encap{
    public static void main(String a[]){
        member mem1 = new member();
        mem1.name = "shashwanth";
        //System.out.println(mem1.printmess());
        mem1.mess();
    }
}

class Studentt {
    String name;
    int age;
    void dispaly(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
    public static void main(String[] args){
        Studentt s1 = new Studentt();
        s1.name = "Umama";
        s1.age = 21;
        s1.dispaly();
    }
}

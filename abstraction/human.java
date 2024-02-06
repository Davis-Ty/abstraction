package abstraction;

public abstract class human implements Animal {
    private int age;
    private String name;
    private int daysWorked;



    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    
    public int getDaysWorked(){
        return daysWorked;
    }

    public void setSaysWorked(int daysWorked){
        this.daysWorked=daysWorked;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
    
    public abstract double getTotalWork();

    @Override
    public boolean isHuman() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean notHuman() {
        // TODO Auto-generated method stub
        return false;
    }



}
interface Animal{
    boolean isHuman();
    boolean notHuman();
}


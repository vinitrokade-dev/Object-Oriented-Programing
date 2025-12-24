package Encapsulation;

class Employee{
    String Ename;
    int Eid;
    double Esalary;

    Employee(int Eid){
        this.Eid=Eid;
    }

    public int getEid(){
        return Eid;
    }

    public void setEsalary(double Esalary){
        this.Esalary=Esalary;
    }

    public double getEsalary(){
        return Esalary;
    }
}

public class General {
    public static void main(String[] args) {
        
    }
}

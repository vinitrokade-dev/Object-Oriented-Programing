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
        
        Employee Emp=new Employee(101);

        Emp.setEsalary(40000.0);

        System.out.println("Employee Salary Is : " + Emp.getEsalary());
        System.out.println("Employee ID Is : "+Emp.getEid());
        
    }
}

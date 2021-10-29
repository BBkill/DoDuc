package KetQuaXetTuyen;

public class Student {
    private String name,dayofBirth,classification,id;
    private float theorrticalPoint,practicePoint;
    private int age,point;
    Student(int order,String name,String dayofBirth,float theorrticalPoint,float practicePoint)
    {
        this.id = "PH"+String.format("%02d",order);
        this.name=name;
        this.dayofBirth=dayofBirth;
        this.theorrticalPoint=theorrticalPoint;
        this.practicePoint = practicePoint;
        this.classification = classStudent();
        this.age=getAge();
        this.point=getTotalPoint();
    }
    private int getAge()
    {
        return 2021 - Integer.parseInt(dayofBirth.substring(dayofBirth.length()-4,dayofBirth.length()));
    }

    private float bonusPoint()
    {
        if(theorrticalPoint>=8&&practicePoint>=8) return 1f;
        if(theorrticalPoint>=7.5&&practicePoint>=7.5) return 0.5f;
        return 0;
    }
    private int getTotalPoint()
    {
        int total = Math.round((theorrticalPoint+practicePoint)/2f+bonusPoint());
        if(total>10) return  10;
        return total;
    }

    private  String classStudent()
    {
        if(getTotalPoint()>=9) return "Xuat sac";
        if(getTotalPoint()==8) return "Gioi";
        if(getTotalPoint()==7) return "Kha";
        if(getTotalPoint()>=5) return "Trung binh";
        return "Truot";
    }

    @Override
    public String toString() {
        return id+" "+name+" "+age+" "+point+" "+classification;
    }
}

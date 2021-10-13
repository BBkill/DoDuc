//ackage Student;


public class Students  {
    private String name, dayOfBirth;
    private float point;
    private  int id;
    Students(int id,String name,String dayOfBirth,float point)
    {
        this.id=id;
        this.name=name;
        this.dayOfBirth=dayOfBirth;
        this.point=point;
        
    }
    

    public float getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return id+ " "+ name + " "+dayOfBirth+" "+point;
    }

    
}
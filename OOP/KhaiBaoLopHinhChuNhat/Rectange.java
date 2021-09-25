public class Rectange{
    private double width, height;
    private String color;
    Rectange(double width, double height, String color)
    {
        this.width=width;
        this.height=height;
        this.color=color;
    } 
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public void setHeight(double height)
    {
        this.height=height;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double findArea()
    {
        return width*height;
    }
    public double findPerimeter()
    {
        return (height+width)*2;
    }
    public  String Color()
    {
        String s="";
        for(int i=0;i<color.length();i++)
        {
            if(i==0) s=s+(color.charAt(i)+"").toUpperCase();
            else s=s+(color.charAt(i)+"").toLowerCase();
        }
        return s;
    }
    
    @Override
    public String toString() {
        if(width>0&&height>0)
            return String.format("%.0f", findPerimeter())+" "+String.format("%.0f",findArea())+" "+Color();
        return "INVALID";
    }

}
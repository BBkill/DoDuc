public class StudentsList{
    private String idCode, fullName, phoneNUmber, content;
    private int Order;
    StudentsList(String idCode,String fullName,String phoneNumber,int Order,String content)
    {
        this.idCode=idCode;
        this.fullName=fullName;
        this.phoneNUmber=phoneNumber;
        this.Order=Order;
        this.content=content;
    }
    public int getOrder() {
        return Order;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public String toString() {
        return idCode+" "+fullName+" "+phoneNUmber;
    }
}
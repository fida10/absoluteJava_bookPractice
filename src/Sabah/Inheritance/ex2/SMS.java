package Sabah.Inheritance.ex2;

public class SMS extends Message{

    private String recipientContactNo = "";

    public SMS(String recipientContactNo, String text){
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public String getRecipientContactNo() {
        return recipientContactNo;
    }

    public void setRecipientContactNo(String recipientContactNo) {
        this.recipientContactNo = recipientContactNo;
    }

    public String toString() {
        return this.recipientContactNo + " " + super.toString();
    }




}

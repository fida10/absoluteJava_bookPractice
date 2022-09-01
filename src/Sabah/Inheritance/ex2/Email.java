package Sabah.Inheritance.ex2;

public class Email extends Message{

    private String sender;
    private String receiver;
    private String subject;

    public Email(String sender, String receiver, String subject, String text){
        super(text);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }

    public String toString(){
        return "Sender: " + sender +"\n"+
                "Receiver: " + receiver + "\n" +
                "Message: "+ super.toString();
    }


}

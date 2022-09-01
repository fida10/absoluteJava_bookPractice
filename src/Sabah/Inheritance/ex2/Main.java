package Sabah.Inheritance.ex2;

public class Main {
    public static void main(String[] args) {
        SMS textMsg = new SMS("+1 (234) 251-5678", "Hello from SMS");
        SMS t = new SMS("+1 (234) 251-5678", "This is Sabah");
        Email email = new Email("abc@xyz.com",
                "123@gmail.com",
                "Test Message from Email",
                "Hi. I am sending this message from the email object!!");
//        System.out.println(ContainsKeyword(textMsg, "SMS"));
//        System.out.println(ContainsKeyword(email, "SMS"));
        System.out.println(t.encodeMessage());

    }

    public static boolean ContainsKeyword(Message messageObject,
                                          String keyword)
    {
        if (messageObject.toString().indexOf(keyword,0) >= 0)
            return true;
        return false;
    }
}

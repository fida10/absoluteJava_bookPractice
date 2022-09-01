package Sabah.Inheritance.ex2;

public class Message {

    private String text;
    private StringBuilder encoded = new StringBuilder();

    public Message(String text){
        this.text = text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String toString(){
        return this.text;
    }

    public String encodeMessage(){
        String s = text.replaceAll("\\s","");
        char[] ch = s.toCharArray();
        int i=0;
        while(i < ch.length){
            if (ch[i] == 'z')
                encoded.append('a');
            if(ch[i] =='Z')
                encoded.append('A');
            if (ch[i] == ' ') ++i;

            else {
                encoded.append((char)(ch[i] + 1));}

            i++;
        }

        return encoded.toString();

    }
}

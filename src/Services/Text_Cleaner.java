package Services;

public class Text_Cleaner {
    public static String clean(String text){
        text=text.toLowerCase();
        text = text.replaceAll("[^a-z0-9\\s]"," ");
        return text;
    }

}

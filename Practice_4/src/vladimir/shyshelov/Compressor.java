package vladimir.shyshelov;

public class Compressor {
    String str;

    public String compress(String s){
        str = s.replaceAll("\\s+","");
        return str;
    }
    public void output(){
        System.out.println(str);
    }
}

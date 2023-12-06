package collection_practice.accntr;

public class ExceptionDemo extends RuntimeException{
    public ExceptionDemo(String srt){
        super(srt);
    }
    public String getReason () throws Exception{
        throw new Exception();
    }
}

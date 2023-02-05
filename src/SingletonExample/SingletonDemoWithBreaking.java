package SingletonExample;

public class SingletonDemoWithBreaking {
    
    private static SingletonDemoWithBreaking singletonDemoWithBreaking;
    private SingletonDemoWithBreaking(){
        
    }
    
    public static SingletonDemoWithBreaking getInstance(){
        if (singletonDemoWithBreaking == null){
             singletonDemoWithBreaking = new SingletonDemoWithBreaking();
        }
        return singletonDemoWithBreaking;
    }
}

package test;

public class Java_static_variable {
	 private static int count;

	//static method example
    public static void setCount(int count) {
        if(count > 0)
        	Java_static_variable.count = count;
            count++;
            System.out.println(count++);
    }
    
    //static util method
    public static int addInts(int i, int...js){
        int sum=i;
        for(int x : js) sum+=x;
        return sum;
    }
    public static void main(String[] args) {
    	Java_static_variable jsv = new Java_static_variable();
    	jsv.setCount(7);
    	
    	jsv.addInts(8, null);
    	
    	
    }
}

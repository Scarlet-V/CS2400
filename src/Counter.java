public class Counter implements CounterInterface {

    int count;

    public void setCount (int count){
        if (count>=0){
            this.count=count;
        } 
        else{
            System.out.println("This value cannot be set to count");
        }
    }

    public int getCount(){
        return count;
    }
    
    public int increaseCount(){
        count =count+1;
        return count;
    }

    public int decreaseCount(){
        if(!isZero(count)){
            count =count-1;
            return count;
        }
        else{
            return count;
        }
    }

    public String toString (int count){
        return String.valueOf(count);
    }
    
    public boolean isZero(int count){
        return count==0;
    }
}


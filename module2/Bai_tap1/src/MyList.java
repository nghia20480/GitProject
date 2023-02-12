import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class MyList <E>{
    private int size=0;
    static  final int DEFAULT_CAPACITY=10;
    private Object elements[];
    public  MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newsize=elements.length*2;
        elements= Arrays.copyOf(elements,newsize);
    }
    public void  add(int e){
        if (size==elements.length){
            ensureCapa();
        }
        elements[size++]=e;

    }
    public boolean remove(Object e){
        if (e==null){
            for (int index=0;index<size;index++)
                if (elements[index] == null){
                    fastRemove(index);
                    return true;

                }
            else {
                    for ( index = 0; index < size; index++) {
                        if (e.equals(elements[index])){
                            fastRemove(index);
                            return true;
                        }

                    }

                }

        }
        return false;

    }
    private void fastRemove(int index){
        int numMoved=size-index-1;
        if (numMoved>0)
            System.arraycopy(elements,index+1,elements,index,numMoved);
        elements[--size]=null;
    }
public int size(){
        return size;
}
public Object[] clone() {


    }
}

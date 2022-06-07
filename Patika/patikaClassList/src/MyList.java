import java.util.Arrays;

public class MyList <T>{

    private T[] list;

    public MyList(){
        this.list = (T[]) new Object[10];

    }

    public MyList(int capacity){
        this.list = (T[]) new Object[capacity];
    }

    public int size(){

        int size = 0;

        for(T value : this.list){
            if(value != null){
                size++;
            }
        }
        return size;
    }

    public int getCapacity() {
        return this.list.length;
    }

    public void add(T data){

        if(indexOf(null) != -1){
            this.list[indexOf(null)] = data;
        }else {
            Arrays.copyOf(this.list,getCapacity()*2);
            this.list[indexOf(null)] = data;
        }
    }

    public String get(int index){

        if(index <= size()){
            return String.valueOf(this.list[index]);
        }

        return "null";
    }

    public void remove(int index){
        if(index <= size()){
            T[] array1 = Arrays.copyOfRange(this.list,0,index);
            T[] array2 = Arrays.copyOfRange(this.list,index + 1,this.list.length);

            int aLen = array1.length;
            int bLen = array2.length;

            this.list = (T[]) new Object[aLen+bLen];

            System.arraycopy(array1, 0, this.list, 0, aLen);
            System.arraycopy(array2, 0, this.list, aLen, bLen);


        }else{
            System.out.println("null");
        }
    }

    public void set(int index, T data){
        if(index <= size()){
            this.list[index] = data;
        }else{
            System.out.println("null");
        }
    }

    @Override
    public String toString(){

        if(isEmpty()){
            return "[ ]";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for(int i = 0 ; i < this.list.length ; i++){
            stringBuilder.append(" ").append(this.list[i]).append(",");
        }
        stringBuilder.replace(stringBuilder.length()-2,stringBuilder.length()-1,"]");

        return stringBuilder.toString();
    }

    public boolean isEmpty(){

        return this.list[0] == null;

    }

    public int indexOf(T data){

        for(int i = 0 ; i < this.list.length ; i++){
            if(this.list[i] == data){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){

        for(int i = this.list.length - 1; i >= 0  ; i--){
            if(this.list[i] == data){
                return i;
            }
        }
        return -1;
    }

    public T[] toArray(){
        return Arrays.copyOfRange(this.list,0,size());
    }

    public void clear(){
        this.list = (T[]) new Object[getCapacity()];
    }

    public boolean contains(T data){
        for(T value : this.list){
            if(value == data){
                return true;
            }
        }
        return false;
    }

    public MyList<T> subList(int start, int finish){

        MyList sublist = new MyList(finish - start + 1);

        for(int i = start ; i <= finish ; i++){
            sublist.add(this.list[i]);
        }
        return sublist;
    }
}

public class BetterArray{
    
    private int size;
    public int[] array;
    

    public BetterArray(){
        size = 0;
        array = new int[0];
    }

    public BetterArray(int size){
        array = new int[size];
        this.size = 0;
    }

    public int size(){
        return size;
    }
// Returns the number of elements in the list

    public boolean add(int item){
        if(array.length == 0){
            int[] NewArray = new int[1];
            array = new int[NewArray.length];
            for(int i=0; i<NewArray.length; i++){
                array[i] = NewArray[i];
            }
        }
        if(size >= array.length){
            int[] NewArray = new int[array.length*2];
            for(int i=0; i<array.length; i++){
                NewArray[i] = array[i];
            }
            array = new int[NewArray.length];
            for(int i=0; i<NewArray.length; i++){
                array[i] = NewArray[i];
            }
        }
        array[size] = item;
        size++;
        return true;
    }
// appends item to the end of the list; returns true

    public void add(int index, int item){
        
        if(size >= array.length){
            int[] NewArray = new int[array.length*2];
            for(int i=0; i<array.length; i++){
                NewArray[i] = array[i];
            }
            array = new int[NewArray.length];
            for(int i=0; i<NewArray.length; i++){
                array[i] = NewArray[i];
            }
        }
        int var = array[index];
        array[index] = item;
        for(int i=index+1; i<array.length; i++){
            int skib = var;
            var = array[i];
            array[i] = skib;
        }
        array[index] = item;
        size++;
        
    }
// Inserts item at position index, moving elements at position index and higher to
// the right and adds 1 to size

    public int get(int index){
        int item = array[index];
        return item;
    }
// Returns the element at position index in the list

    public int set(int index, int item){
        int temp = array[index];
        array[index] = item;
        return temp;
    }
// Replaces the element at position index with item; returns the element formerly
// at position index

    public int remove(int index){
        int temp = array[index];
        
        for(int i=index; i<array.length - 1; i++){
            // int skib = i + 1;
            array[i] = array[i + 1];
        }
        
        size--;
        return temp;
    }
// Removes element from position index, moving elements at position index+1 and
// higher to the left and subtracts 1 from size; returns the element formerly at
// position index

}
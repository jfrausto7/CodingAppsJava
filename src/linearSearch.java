public class linearSearch {

    public static void main(String[] args) {
        int[] entries = {4,5,18,2,9,0,12};
        int search = 18;

        int result = linearSearch(entries, search);

        if(result == -1){
            //we know the integer to be searched is not in the entries array
            System.out.println(search + " is not in entries.");
        }else{
            System.out.println(search + " is at the " + result + "th index.");
        }
    }

    public static int linearSearch(int[] array, int search){
        for(int i = 0; i < array.length; i++){
            if(array[i] == search){
                return i;
            }
        }
        //if we get here, there is no 9 (search integer) in our array
        return -1;
    }
}

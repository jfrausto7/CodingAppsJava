public class Arrays {
    public static void main(String[] args) {
        int[] intArray = new int[6];


        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i;
            System.out.println(intArray[i]);
        }

        String[] names = new String[3];

        names[0] = "Oliver";
        names[1] = "Frosty";
        names[2] = "Maxwell";

    }
}

public class Loops {

    public static void main(String[] args) {
        String word = "Frosty";
        boolean isTrue = false;
        int counter = 0;

        for(int i = 10; i > word.length(); i--){

            System.out.println(i);

        }

        while(!isTrue){
            if(counter == 5){
                isTrue = true;
            }else{
                System.out.println("still false");
            }
            counter++;
        }
    }
}

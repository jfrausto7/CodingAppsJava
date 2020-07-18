public class Parameters {

    public static void main(String[] args) {
        String good = "good";
        String bad = "bad";

        //these next two lines are for printing
        System.out.println(printStuff(good)); //stuff is good
        System.out.println(printStuff(bad)); //stuff is bad
    }

    /**
     * This next method does fadsfasdfasdfasdfasdfas
     *     asdfassdfasdfsadfasdfasfasd
     *     sadfasdfasdfasdfasdfafsd
     *     hrghaerghaergeargaergaergaergaer
     *     agregraergaerghethaerhaerbeatb
     *
     * @param type, which is a string we pass in
     * @return type plus s at the end
     */
    public static String printStuff(String type){
        type = type + "s";
        return type;
    }
}

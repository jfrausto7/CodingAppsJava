public class Car {

    public String carMake;
    public String model = "Camry";
    public int carYear = 2007;
    public boolean isTotaled = false;

    public Car(String make, int year){
        this.carMake = make;
        this.carYear = year;
    }

    public String drive(){

        if(this.carMake == "Toyota"){
            return "Vrooom";
        }else if(this.carMake == "Nissan"){
            return "Zoom";
        }else{
            return ("Boom");
        }
    }
}

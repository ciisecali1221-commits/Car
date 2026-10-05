public class Car {
    private String plateNumber;
    private  String CarModel;
    private  double dailyRate;
    private Boolean rent;
    public  static final String CAM="";
    public static int totalCar;



    public Car(String plateNumber, String carModel, double dailyRate, Boolean rent){
        this.plateNumber=plateNumber;
        this.CarModel=carModel;
        this.dailyRate=dailyRate;
        this.rent=rent;

    }
    public String getPlateNumber(){
        return plateNumber;
    }
    public String getCarModel(){
        return CarModel;
    }
    public double getdailyRate(){
        return dailyRate;
    }
    public Boolean getRent(){
        return rent;
    }
    public void setPlateNumber(String plateNumber){
        this.plateNumber=plateNumber;
    }
    public  void setRent(){
        this.setRent();
    }
    public void returnCar(){
        return;
    }
    public void display(){

    }

    public static void main(String[] args) {

        Car car1 = new Car("BC2342", "2026", 20.9, true);
        Car car2=new Car("XCC876", "2023", 38.5, false);

        System.out.println("Just Rental");
        System.out.println("");
        System.out.println("Car Model: " +car1.CarModel);
        System.out.println("Plate Number:" + car1.plateNumber);
        System.out.println("Daily Rate: " + car1.dailyRate);
        System.out.println("REnt: " + car1.rent);
        System.out.println("");

        System.out.println("Plate Number:" + car2.plateNumber);
        System.out.println("Carmodel:" + car2.CarModel);
        System.out.println("Daily: " + car2.dailyRate);
        System.out.println("RENT: " + car2.rent);




    }

}


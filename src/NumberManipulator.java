public class NumberManipulator {

    public static void main(String[] args) {
        Drivers driver = new Drivers();

        String gender = "Male";
        int age = 20;
        int drivingExperience = 3;
        System.out.println("Initial age:" + age);
        System.out.println("Initial drivingExperience:" + drivingExperience);

        int incrementAge = driver.incrementByOneAge(25);
        int incrementDrivingExperience = driver.incrementByOneDrivingExperience(5);
        System.out.println("Age after increment:" + incrementAge);
        System.out.println("DrivingExperience after increment:" + incrementDrivingExperience);

        int decrementAge = driver.decrementByOneAge(18);
        int decrementDrivingExperience = driver.decrementByOneDrivingExperience(2);
        System.out.println("Age after decrement:" + decrementAge);
        if (decrementAge < 18) {
            System.out.println("Error");
        }
        System.out.println("DrivingExperience after decrement:" + decrementDrivingExperience);

    }
        }



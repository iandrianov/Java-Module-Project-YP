import java.util.ArrayList;
import java.util.Scanner;

public class Race {
    ArrayList<Car> raceParticipants = new ArrayList<>();

    public ArrayList<Car> createRace() {

        Scanner scanner = new Scanner(System.in);
        String name;
        int speed;

        for (int i = 1; i < 4; i++) {

            while (true) {
                Print("Введите название машины №" + i + ":");
                name = scanner.nextLine().trim();
                if (!name.isEmpty()) {
                    break;
                } else {
                    Print("Ошибка!!! Имя машины НЕ может быть пустым. Попробуйте снова:");

                }
            }

            while (true) {
                Print("Введите скорость машины №" + i + ":");
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    scanner.nextLine();
                    if (speed > 0 && speed <= 250) {
                        break;
                    } else {
                        Print("Ошибка!!! Скорость должна быть от 1 до 250. Попробуйте снова.");
                    }
                } else {
                    Print("Ошибка!!!  Введите целое число!");
                    scanner.next();
                }
            }
            raceParticipants.add(new Car(name, speed));
        }
        return raceParticipants;
    }

    public Car findRaceWinner(ArrayList<Car> participants) {
        int maxSpeed = 0;
        Car winner = null;
        for (Car car : participants) {

            if (car.name.equalsIgnoreCase("Lada") || car.name.equalsIgnoreCase("Лада") || car.name.equalsIgnoreCase("Жигули")) {
                System.out.println("🚗 " + car.name + " получает бонус! +100 к скорости 💨");
                car.speed += 100;
            }

            if (car.speed > maxSpeed) {
                winner = car;
                maxSpeed = car.speed;
            }
        }
        return winner;
    }

    static void Print(String text) {
        System.out.println(text);
    }
}

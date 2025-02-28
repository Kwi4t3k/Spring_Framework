package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IVehicleRepository vehicleRepository = new VehicleRepository();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wypożyczalnia pojazdów\n");
            System.out.println("1 - Wyświetl dostępne pojazdy\n");
            System.out.println("2 - Wypożycz pojazd\n");
            System.out.println("3 - Zwróć pojazd\n");
            System.out.println("4 - Wyjście\n");
            System.out.print("Wybierz opcję:");

            int wybor = scanner.nextInt();
            scanner.nextLine();

            if (wybor == 1) {
                boolean ok = false;
                for (Vehicle vehicle : vehicleRepository.getVehicles()) {
                    if (!vehicle.rented) {
                        System.out.println(vehicle);
                        ok = true;
                    }
                }
                if (!ok) {
                    System.out.println("Brak pojazdów\n");
                }
            } else if (wybor == 2) {
                vehicleRepository.rentVehicle(scanner.nextLine());
            } else if (wybor == 3) {
                vehicleRepository.returnVehicle(scanner.nextLine());
            } else if (wybor == 4) {
                System.out.println("Do widzenia");
                scanner.close();
                return;
            }
        }
    }
}
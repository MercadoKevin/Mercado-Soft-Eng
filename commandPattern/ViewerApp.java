package commandPattern;

import java.util.Scanner;

public class ViewerApp {
    public static void main(String[] args) {
      
        Device tv = new Tv();
        Device stereo = new Stereo();
        Device lights = new Lights();
        Device ceilingFan = new CeilingFan(); 

        
        RemoteControl remote = new RemoteControl();

      
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n-- Device Hub --");
            System.out.println("Choose a device:");
            System.out.println("1. TV");
            System.out.println("2. Stereo");
            System.out.println("3. Lights");
            System.out.println("4. Ceiling Fan");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int deviceChoice = scanner.nextInt();

            Device selectedDevice = null;

            switch (deviceChoice) {
                case 1:
                    selectedDevice = tv;
                    System.out.println("TV selected.");
                    break;
                case 2:
                    selectedDevice = stereo;
                    System.out.println("Stereo selected.");
                    break;
                case 3:
                    selectedDevice = lights;
                    System.out.println("Lights selected.");
                    break;
                case 4:
                    selectedDevice = ceilingFan;
                    System.out.println("Ceiling Fan selected.");
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the hub. Goodbye!");
                    continue;
                default:
                    System.out.println("Invalid choice. Please choose a valid device.");
                    continue;
            }

            if (selectedDevice != null) {
                System.out.println("\nChoose an action for the selected device:");
                System.out.println("1. Turn ON");
                System.out.println("2. Turn OFF");
                System.out.print("Enter your choice: ");
                int actionChoice = scanner.nextInt();

                switch (actionChoice) {
                    case 1:
                      
                        remote.setCommand(new PowerOn(selectedDevice));
                        remote.pressButton();
                        break;
                    case 2:
                   
                        remote.setCommand(new PowerOff(selectedDevice));
                        remote.pressButton();
                        break;
                    default:
                        System.out.println("Invalid action choice.");
                        break;
                }
            }
        }

        scanner.close();
    }
}

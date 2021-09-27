package platform.codingnomads.co.ioc.lab.noframework;

public class ComputerController {

    public static void main(String[] args) {
        Computer computer = new Computer(new IntelProcessor(), new SonyMonitor());
        Computer computer1 = new Computer(new AppleProcessor(), new HpMonitor());

        computer.setProcessor(new AppleProcessor());
    }
}

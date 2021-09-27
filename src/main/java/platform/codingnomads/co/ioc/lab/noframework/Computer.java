package platform.codingnomads.co.ioc.lab.noframework;

public class Computer {
    Processor processor;
    Monitor monitor;

    // Constructor Injection.
    public Computer(Processor processor,Monitor monitor) {
        this.processor = processor;
        this.monitor = monitor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}

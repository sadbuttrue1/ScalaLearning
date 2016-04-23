package tk.sadbuttrue.chapter.five;

/**
 * Created by true on 23/04/16.
 */
public class JavaCar {
    private String producer;
    private String model;
    private int issueYear;
    private String registrationNumber;

    public JavaCar(String producer, String model, int issueYear, String registrationNumber) {
        this.producer = producer;
        this.model = model;
        this.issueYear = issueYear;
        this.registrationNumber = registrationNumber;
    }

    public JavaCar(String producer, String model) {
        this(producer, model, -1, "");
    }

    public JavaCar(String producer, String model, int issueYear) {
        this(producer, model, issueYear, "");
    }

    public JavaCar(String producer, String model, String registrationNumber) {
        this(producer, model, -1, registrationNumber);
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "JavaCar{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", issueYear=" + issueYear +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}

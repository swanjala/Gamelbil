package datapreprocessor.data_model;

public class CarModel {

    private String make;
    private String model;
    private String modelPlatformYears;
    private String modelBodyPlatformYears;
    private String modelVersionDescriptionYears;
    private String yearsSold;
    private String modelVersion;
    private String carClassification;
    private String bodyType;
    private String numberOfSeats;
    private String enginePlace;
    private String driveTrain;
    private String cylinders;

    private String numberOfDoors;


    public CarModel(String make ,
                    String model,
                    String modelPlatformYears,
                    String modelBodyPlatformYears,
                    String modelVersion,
                    String modelVersionDescriptionYears,
                    String yearsSold,
                    String carClassification,
                    String bodyType,
                    String numberOfDoors,
                    String numberOfSeats,
                    String enginePlace,
                    String driveTrain,
                    String cylinders
                    ) {
        this.make = make;
        this.model = model;
        this.modelPlatformYears =modelPlatformYears;
        this.modelBodyPlatformYears = modelBodyPlatformYears;
        this.modelVersionDescriptionYears = modelVersionDescriptionYears;
        this.yearsSold = yearsSold;
        this.modelVersion = modelVersion;
        this.bodyType = bodyType;
        this.numberOfSeats = numberOfSeats;
        this.carClassification = carClassification;
        this.enginePlace = enginePlace;
        this.driveTrain = driveTrain;
        this.cylinders = cylinders;
        this.numberOfDoors = numberOfDoors;

    }

    public String getCylinders() {
        return cylinders;
    }

    public void setCylinders(String cylinders) {
        this.cylinders = cylinders;
    }
    public String getDriveTrain() {
        return driveTrain;
    }

    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }
    public String getEnginePlace() {
        return enginePlace;
    }

    public void setEnginePlace(String enginePlace) {
        this.enginePlace = enginePlace;
    }
    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
    public String getYearsSold() {
        return yearsSold;
    }

    public void setYearsSold(String yearsSold) {
        this.yearsSold = yearsSold;
    }

    public String getCarClassification() {
        return carClassification;
    }

    public void setCarClassification(String carClassification) {
        this.carClassification = carClassification;
    }
    public String getModelVersionDescriptionYears() {
        return modelVersionDescriptionYears;
    }

    public void setModelVersionDescriptionYears(String modelVersionDescriptionYears) {
        this.modelVersionDescriptionYears = modelVersionDescriptionYears;
    }

    public String getModelPlatformYears() {
        return modelPlatformYears;
    }

    public void setModelPlatformYears(String modelPlatformYears) {
        this.modelPlatformYears = modelPlatformYears;
    }

    public String getModelBodyPlatformYears() {
        return modelBodyPlatformYears;
    }

    public void setModelBodyPlatformYears(String modelBodyPlatformYears) {
        this.modelBodyPlatformYears = modelBodyPlatformYears;
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelVersion() {
        return modelVersion;
    }

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

}

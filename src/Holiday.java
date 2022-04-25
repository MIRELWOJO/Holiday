import java.time.LocalDateTime;

public class Holiday {
    int month;
    int day;
    String name;

    public Holiday(boolean federallyRecognized) {
        this.federallyRecognized = federallyRecognized;
    }

    String description;

    public boolean isFederallyRecognized() {
        return federallyRecognized;
    }

    public void setFederallyRecognized(boolean federallyRecognized) {
        this.federallyRecognized = federallyRecognized;
    }

    boolean federallyRecognized;

    public Holiday(int month, int day, String name, String description, boolean federallyRecognized) {
        this.month = month;
        this.day = day;
        this.name = name;
        this.description = description;
        this.federallyRecognized = federallyRecognized;
    }

    public Holiday(int month) {
        this.month = month;
    }

    public Holiday(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public boolean iaToday() {
        LocalDateTime now = LocalDateTime.now();
        now.getMonthValue();
        now.getDayOfMonth();
        return now.getMonthValue() == month && now.getDayOfMonth() == day;
    }

}
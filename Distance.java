public class Distance {
    // private field
    private double km;

    // Constructor
    public Distance(double km) {
        this.km = km;
    }

    // Convert km to StepStats object
    public StepStats convert() {
        // 1 km = 1312 steps
        // Round to nearest whole number
        int totalSteps = (int) Math.round(km * 1312);

        // Break totalSteps into thousands, hundred and tens
        int thousands = totalSteps / 1000;    // Get number of thousands
        int remainder = totalSteps % 1000;    // What's left after thousands
        int hundreds = remainder / 100;     // Get number of hundreds from remainder
        remainder = remainder % 100;    // What's left after
        int tens = remainder / 10;      // Get number of tens


        // Return a new StepsStats object with the breakdown
        return new StepStats(thousands, hundreds, tens);

    }
}

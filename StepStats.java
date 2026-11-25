public class StepStats {
    // Private fields
    private int thousands;
    private int hundreds;
    private int tens;

    // Constructor
    public StepStats(int thousands, int hundreds, int tens) {
        // Todo assign parameters to fields 
        this.thousands = thousands;
        this.hundreds = hundreds;
        this.tens = tens;
    }

    // Pretty print methods
    public void prettyPrint() {
        // Build the output step by step
        String result = "";

        // Check which units have non-zero values
        boolean hasThousands = (thousands > 0);
        boolean hasHundreds = (hundreds > 0);
        boolean hasTens = (tens > 0);

        // Count how many non-zero units we have
        int nonZeroCount = 0;
        if (hasThousands) nonZeroCount++;
        if (hasHundreds) nonZeroCount++;
        if (hasTens) nonZeroCount++;

        // Handle the case where all are zero
        if (nonZeroCount == 0) {
            System.out.println("0 steps");
            return;
        }

        // Build the string with proper grammar
        int processed = 0;

        // Add thousands
        if (hasThousands) {
            result += thousands + " thousand";
            if (thousands > 1) result += "s";
            processed++;

            if (processed < nonZeroCount) {
                if (nonZeroCount - processed == 1) {
                    result += " and ";
                } else {
                    result += ", ";
                }
            }
        }

        // Add hundreds
        if(hasHundreds) {
            result += hundreds + " hundred";
            if(hundreds > 1) result += "s";
            processed++;

            if (processed < nonZeroCount) {
                if (nonZeroCount - processed == 1) {
                    result += " and ";
                } else {
                    result += ", ";
                }
            }
        }

        // Add tens
        if (hasTens) {
            result += tens + " ten";
            if(tens > 1) result += "s";
            processed++;
        }

        // Print the final result
        System.out.println(result);


    }
}
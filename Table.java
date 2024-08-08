public class Table {

    public static void main(String[] args) {

        // Create a table of data
        String[][] data = {
            {"Subject Name", "Max_Marks", "Total"},
            {"GENERAL HINDI", "100", "47"},
            {"ENGLISH", "100", "73"},
	    {"VOC G FOND SUBJ", "100", "53"},
	    {"English", "700", "539"},
	    {"MORAL Y.S&P.EDU", "100", "82"},
        };

        // Print the table to the console
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-15s", data[i][j]);
            }
            System.out.println();
        }
    }
}
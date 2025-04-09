import java.io.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        String inputFile = "src/pay.csv";
        String outputFile = "src/output.csv";
        DecimalFormat df = new DecimalFormat("$#.00");

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

            // Write column headers to output
            bw.write("Name,Pay Rate,Hours Worked,Weekly Pay\n");

            // Skip the header line from input
            br.readLine();

            // Process each remaining line
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 3) continue;

                String name = parts[0].trim();
                double rate = Double.parseDouble(parts[1].trim());
                double hours = Double.parseDouble(parts[2].trim());

                double weeklyPay;
                if (hours <= 40) {
                    weeklyPay = rate * hours;
                } else {
                    weeklyPay = (rate * 40) + ((hours - 40) * rate * 1.5);
                }

                String formattedPay = df.format(weeklyPay);
                String outputLine = name + "," + rate + "," + hours + "," + formattedPay + "\n";
                bw.write(outputLine);
            }

            System.out.println("✅ Done! Output written to " + outputFile);
        } catch (IOException e) {
            System.out.println("❌ File error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("❌ Number format error: " + e.getMessage());
        }
    }
}

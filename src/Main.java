import java.io.*;
public class Main {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("Nha Trang", "Vũng Tàu");
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Thay thế thành công và ghi vào file output.txt");
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy tệp input.txt");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

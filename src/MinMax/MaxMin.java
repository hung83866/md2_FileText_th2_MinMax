package MinMax;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MaxMin {

    public static  String Min(String filet) throws FileNotFoundException {
        List<Integer> integers = new ArrayList<>();
        try {
            File file1 = new File(filet);
            if (!file1.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file1));
            String line = "";

            while ((line = br.readLine())!=null){
                integers.add(Integer.parseInt(line));
            }
            return "Min = "+findMin(integers);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Fie không tồn tại or nội dung có lỗi!";
    }
    public static  String Max(String filet) throws FileNotFoundException {
        List<Integer> integers = new ArrayList<>();
        try {
            File file1 = new File(filet);
            if (!file1.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file1));
            String line = "";

            while ((line = br.readLine())!=null){
                integers.add(Integer.parseInt(line));
            }
            return "Max = "+findMax(integers);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Fie không tồn tại or nội dung có lỗi!";
    }
    public static int findMin(List<Integer> arr){
        int min=arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (min>arr.get(i)){
                min = arr.get(i);
            }
        }
        return min;
    }
    public static int findMax(List<Integer> arr){
        int max=arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (max<arr.get(i)){
                max = arr.get(i);
            }
        }
        return max;
    }
    public static void outputFile(String str, String newFile) throws IOException {
        File file1 = new File(newFile);
        OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream(newFile));
        output.write(str);
        output.flush();
    }
}

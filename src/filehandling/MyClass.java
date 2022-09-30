package filehandling;

import java.io.*;

public class MyClass {

    public static void main(String[] args){

        String dirPath = "folder" + File.separator + "anotherFolder";

        File dir = new File(dirPath);

        if(!dir.exists()){
            dir.mkdirs();
        }

        File file = new File(dirPath + File.separator + "MyFile.txt");

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canWrite());

        try {
            FileOutputStream os = new FileOutputStream(file);
            String str = "My String";
            os.write(str.getBytes());
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream is = new FileInputStream(file);
            int i;
            while((i = is.read()) != -1){
                System.out.print((char) i);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


/*        try {
            FileWriter fw = new FileWriter(file);
            fw.write("first line");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            int i;
            while((i = fr.read()) != -1){
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}

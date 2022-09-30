package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyClass {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("c://myfile.txt");
        try {
            System.out.println("random");
            throw new MyException();
        } catch (MyException e) {
           //or  throw new RuntimeException(e);
            e.printException();
            e.printStackTrace();
        }
        System.out.println("after exception");
        //postponing the exception to the calling method
    }


    }
       /* int[] myArray = {1,2,3};
        System.out.println(myArray[3]);*///runtime exception,ArrayIndexOutOfBoundsd

       /* File file = new File("c://myfile.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);//compile time exception
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("after exception");
        //postponing the exception to the calling method
    }*/


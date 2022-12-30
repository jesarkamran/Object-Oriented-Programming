
import java.io.*;
import java.util.ArrayList;

public class FileOperations {
    ObjectOutputStream objectOutputStream = null;

    public void writeInFile(Student student,boolean append){
        try {
            File file = new File("TryingSerialization");
            if (file.exists()){
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(file,append));
                objectOutputStream.writeObject(student);
            }else {
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(file,append));
                objectOutputStream.writeObject(student);
            }
        }catch (IOException e){
            System.out.println("Error In File Writing");
            e.printStackTrace();
        }finally {
            try {
                objectOutputStream.close();
            }catch (Exception e){
                System.out.println("Error In File Writing");
                e.printStackTrace();
            }
        }
    }
    ObjectInputStream objectInputStream;
    public ArrayList<Student> readInFile()
    {
        ArrayList<Student> list = new ArrayList<>();
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("TryingSerialization"));
            while (true) 
            {
                list.add((Student) objectInputStream.readObject());
            }
        }catch (Exception e){
            return list;
        }
    }
}
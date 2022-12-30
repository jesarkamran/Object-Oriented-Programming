import java.io.*;
import java.util.ArrayList;

public class Serialization 
{
    
    public  void dataWriting(Student obj, boolean append)
    {
        ObjectOutputStream objOut = null;
        try 
        {
            File file = new File("Data.ser");
            if (file.exists()) 
            {
                objOut = new MyObjectOutputStream(new FileOutputStream(file, append));
                objOut.writeObject(obj);
            }
            else
            {
                objOut = new ObjectOutputStream(new FileOutputStream(file, append));
                objOut.writeObject(obj);
            }
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e); e.printStackTrace();
        }
        finally
        {
            try
            {
                objOut.close();
            }catch (Exception e) {
            //TODO: handle exception
            System.out.println(e); e.printStackTrace();
            }
        }
    }

    public  ArrayList<Student> objectsIntoArrayList()
    {
        ObjectInputStream objIn = null;
        ArrayList<Student> objList = new ArrayList<Student>();
        try 
        {
            File file = new File("Data.ser");
            objIn = new ObjectInputStream(new FileInputStream(file));
            while(true)
            {
                objList.add((Student) objIn.readObject());
            }
        }catch (ClassNotFoundException e) {
                return objList;
            }
        catch (EOFException e) {
            //TODO: handle exception
            return objList;
        }
        catch (Exception e) {
            //TODO: handle exception
            return objList;
        }
        finally
        {
            try {
                objIn.close(); return objList;
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
    public void dataReading() throws IOException
    {
        ArrayList<Student> list = objectsIntoArrayList();
        System.out.println(list.size());
        for (Student obj : list) 
        {
            System.out.println(obj.toString());
        }
    }

    public boolean createFile(File file) throws IOException
    {
        boolean create = file.createNewFile();
        if (create) 
        {
            return true;
        }
        return false;
    }

    public boolean deleteFile(File file) throws IOException
    {
        boolean del = file.delete();
        if (del) 
        {
            return true;
        }
        return false;
    }
}

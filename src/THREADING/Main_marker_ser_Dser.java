package THREADING;

import java.io.*;

public class Main_marker_ser_Dser {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Serialization example
        Employee e = new Employee();

        e.setId(1);
        e.setName("Code decode");

        FileOutputStream fos = new FileOutputStream("./src/THREADING/employee.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);
        oos.close();
        fos.close();

        //Desrialiazation example

        FileInputStream fis = new FileInputStream("./src/THREADING/employee.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee reCreateObj = (Employee) ois.readObject();
        System.out.println(reCreateObj.getName());
        ois.close();
        fis.close();

    }
}

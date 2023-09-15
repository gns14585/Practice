package Practice.p31_p60.p35;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        String o = "C:/Temp/out1.txt";
        String y = "C:/Temp/out1_copy.txt";

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(o));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(y));) {

            byte[] b = new byte[1024];
            int num = 0;
            while ((num = bis.read(b)) != -1) {
                bos.write(b, 0, num);
            }

            bos.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

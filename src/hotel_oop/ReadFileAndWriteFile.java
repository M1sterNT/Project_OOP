/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_oop;

/**
 *
 * @author MisterNT
 */
import java.io.*;
public class ReadFileAndWriteFile{
    RandomAccessFile file;
    public ReadFileAndWriteFile(String filename){
        try{
        this.file = new RandomAccessFile(filename,"rw");
        }catch(IOException e){
            System.out.println("File cannot Open : => "+filename);
        }
    }
    public static String formText(String x, int k)
    {
         int p = x.length();
	 for (int i = p+1;i <= k ;i++ )
	     x = x+" ";
	 return x;  
	 } 
    public  void closeFile()
    { 
        try { file.close();}
	    catch(IOException e)  {
                System.out.println("error closing file");
                System.exit(1);
            } 
    }
    public void writeInt(int d){
        try{
        file.writeInt(d);
        }catch (IOException e){
            System.out.println("Error Writeing to file Int ");System.exit(1);
        } 
    }
    public void writeDouble(double d){
        try{
        file.writeDouble(d);
        }catch (IOException e){
            System.out.println("Error Writeing to file Double ");System.exit(1);
        } 
    }
    public void writeUTF(String d,int length){
        try{
        file.writeUTF(formText(d,20));
        }catch (IOException e){
            System.out.println("Error Writeing to file UTF ");System.exit(1);
        } 
    }
    public void seek(int d){
        try{
        file.seek(d);
        }catch (IOException e){
            System.out.println("Error seek to file ");System.exit(1);
        } 
    }
    public long length(){
        try {
            return file.length();
        } catch (IOException ex) {
            System.out.println("Error get length to file Int ");System.exit(1);
        }
        return 0;
    }
    
}

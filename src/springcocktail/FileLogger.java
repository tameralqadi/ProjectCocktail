/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springcocktail;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author M.T
 */
public class FileLogger implements Logger{
    private FileWriter fileWriter;
    public FileLogger(String fileMarwanTamer ){
        try{
            fileWriter=new FileWriter(fileMarwanTamer,true);
        }
        catch(IOException mt){
            mt.printStackTrace();
        }
    }
    @Override
    public void log(String message){
        try{
            fileWriter.write("FileLogger:"+message+"\n");
            fileWriter.flush();
        }
        catch(IOException mt){
            mt.printStackTrace();
        }
    }
    public void close(){
        try{
            fileWriter.close();
        }
        catch(IOException mt){
            mt.printStackTrace();
        }
    }
}

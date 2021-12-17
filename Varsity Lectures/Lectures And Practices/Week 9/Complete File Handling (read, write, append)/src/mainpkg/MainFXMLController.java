package mainpkg;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

public class MainFXMLController implements Initializable {
    @FXML    private TextField idTextField;
    @FXML    private TextField nameTextField;
    @FXML    private TextField desigTextField;
    @FXML    private TextField salaryTextField;
    @FXML    private TextArea outputTextArea;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /*
        int a=10,b=0,c;
        c=a/b;
        boolean isVoter = true;
        int centerId=123;
        Scanner s = new Scanner(System.in);
        System.out.print("Voter Id? ");
        int id = s.nextInt();
        if(isVoter==true && centerId == id){
            System.out.println("Code to cast the vote");
        }
        else{
            try{
                throw new VotingException();
            }
            catch(VotingException e){
                e.handlingMethod();
            }
        }
        */
        
        //Scanner s=null;
        //s = new Scanner(System.in);
        //System.out.print("Enter x: ");
        //int x = s.nextInt();
        //System.out.println("x="+x);
            
        //candidate for NullPointerException
        //Employee e = User.getInstance(4161, "****");
        //e.giveAttendance();
        
        // TODO
        //String s1="Hello", s2="World";
        //if(s1==s2) System.out.println("Same");
        //else System.out.println("Not Same");
        
        Employee emp=null;
        //emp = new Employee(123,"asif","foreman",15000f);
        try{
            System.out.println("Salary="+emp.getSalary());
        }
        catch(Exception e){System.out.println(e);}
        System.out.println("Good by...");
    }    

    @FXML
    private void appendTextFileButtonOnClick(ActionEvent event) {       
        File f = null;
        FileWriter fw = null;
        //fw = new FileWriter("abc.txt");
        try {
            //int x = 1234567;
            //float ff = 3.5f;
            //String str = "Hello World";
            //FileWriter fw2 = new FileWriter("test.txt");
            //fw2.write("x=" + x + ",f=" + ff + ",str=" + str);
            //fw2.close();

            f = new File("Emp.txt");      //f = fc.showSaveDialog();
            //fw = new FileWriter(f);
            //fw = new FileWriter("abc.txt",true);
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	idTextField.getText()+","
                +nameTextField.getText()+","	
                +desigTextField.getText()+","	
                +salaryTextField.getText()+"\n"	
            );           
            
        } catch (IOException ex) {
            Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//end of controller method

    @FXML
    private void appendBinaryFileButtonOnClick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;        //Byte stream class handle
        //BufferedOutputStream bos = null;
        DataOutputStream dos = null;        //Data stream class handle
        
        try {
            f = new File("Emp.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
            
            //bos = new BufferedOutputStream(fos);
            //dos = new DataOutputStream(bos);
            dos = new DataOutputStream(fos);
            
            dos.writeInt(Integer.parseInt(idTextField.getText()));
            dos.writeUTF(nameTextField.getText());
            dos.writeUTF(desigTextField.getText());
            dos.writeFloat(Float.parseFloat(salaryTextField.getText()));

        } catch (IOException ex) {
            Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }//end of controller method

    
    @FXML
    private void readBinaryFileButtonOnClick(ActionEvent event) {
        outputTextArea.setText("");
        File f = null;
        FileInputStream fis = null;
        //BufferedInputStream bis = null;
        DataInputStream dis = null;
        String str="";
        try {
            f = new File("Emp.bin");
            if(!f.exists()){
                outputTextArea.setText("Oops! Emp.bin binary file does not exist...");
            }
            else{
                
                fis = new FileInputStream(f);
                //bis = new BufferedInputStream(fis);
                //dis = new DataInputStream(bis);
                dis = new DataInputStream(fis);
                //String str="";
                while(true){                   
                    str+= "Id:"+Integer.toString(dis.readInt())
                        +"; Name:"+dis.readUTF()
                        +"; Designation:"+dis.readUTF()
                        +"; Salary:"+Float.toString(dis.readFloat())+"\n";
                    //outputTextArea.setText(str);
                    
                    //OR
                    /*
                    str = "Id:"+Integer.toString(dis.readInt())
                        +"; Name:"+dis.readUTF()
                        +"; Designation:"+dis.readUTF()
                        +"; Salary:"+Float.toString(dis.readFloat())+"\n";
                    outputTextArea.appendText(str);
                    */
                    
                }//while
                //outputTextArea.setText(str);
            }//else
        } catch (IOException ex) {
            outputTextArea.setText(str);
            Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
                Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }          
    }

    @FXML
    private void idTextFieldOnClick(MouseEvent event) {
        //idTextField.setText("");
        idTextField.clear();
    }

    @FXML
    private void nameTextFieldOnClick(MouseEvent event) {
        nameTextField.setText("");
    }

    @FXML
    private void desigTextFieldOnClick(MouseEvent event) {
        desigTextField.setText("");
    }

    @FXML
    private void salaryTextFieldOnClick(MouseEvent event) {
        salaryTextField.setText("");
    }

    @FXML
    private void appendObjectToBinaryFileButtonOnClick(ActionEvent event) {
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("EmpObjects.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            Employee e = new Employee(
                Integer.parseInt(idTextField.getText()),
                nameTextField.getText(),
                desigTextField.getText(),
                Float.parseFloat(salaryTextField.getText())    
            );
            oos.writeObject(e);

        } catch (IOException ex) {
            Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                
        
        /*
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("EmpObjects.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
            }
            else{
                fos = new FileOutputStream(f);
            }
            
            oos = new ObjectOutputStream(fos);
            
            Employee e = new Employee(
                Integer.parseInt(idTextField.getText()),
                nameTextField.getText(),
                desigTextField.getText(),
                Float.parseFloat(salaryTextField.getText())    
            );
            oos.writeObject(e);

        } catch (IOException ex) {
            Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
        */
    }
    
    @FXML
    private void readObjectsFromFileButtonOnClick(ActionEvent event) {
        outputTextArea.setText("");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("EmpObjects.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Employee emp;
            try{
                outputTextArea.setText("");
                while(true){
                    System.out.println("Printing objects.");
                    emp = (Employee)ois.readObject();
                    //Object obj = ois.readObject();
                    //obj.submitReport();
                    //emp.submitReport();
                    System.out.println("HashCode="+emp.toString());
                    outputTextArea.appendText(emp.toString());
                }
            }//end of nested try
            catch(Exception e){
                //
            }//nested catch     
            outputTextArea.appendText("All objects are loaded successfully...\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }           
    }

    @FXML
    private void readTextFileButtonOnClick(ActionEvent event) {
        outputTextArea.setText("");
        File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
        try {
            f = new File("Emp.txt");
            sc = new Scanner(f);
            if(f.exists()){
                outputTextArea.appendText("Content of Emp.txt:\n");
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    outputTextArea.appendText(
                            "Id="+tokens[0]
                            +", Name="+tokens[1]
                            +", Designation="+tokens[2]
                            +", Salary="+tokens[3]+"\n"                    
                    );
                }
            }
            else 
                outputTextArea.setText("oops! Emp.txt does not exist...");
        } 
        catch (IOException ex) {
            Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
        }        
    }
    
}

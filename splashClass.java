package library_management;
/*
 * @author YUVRAJ ANGULA
 */
public class splashClass {
    public static void main (String []args){
        splashscreen sp = new splashscreen();
        sp.setVisible(true);
        login lf=new login();
          try{
               for(int i=0; i<=100;i++){
                    Thread.sleep(10);
                    sp.jLabel1.setText (Integer.toString(i));
                    sp.jProgressBar1.setValue(i);
                            if(i==100){
                                 sp.setVisible(false);   
                                 lf.setVisible(true);
                                 }
                      }   
             }
       catch(Exception e){}
    }
}

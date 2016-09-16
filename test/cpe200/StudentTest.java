package cpe200;

 import com.sun.xml.internal.bind.v2.model.core.ID;

public class Student {

    public Student() {

                this("John Doe","560610000",1990,false);
            }
    public  Student(String n,String id){
                this.name = n;
               this.id = id;
            }
     public Student(String n,String id,int year,boolean status){
                this.name = !n.equalsIgnoreCase("") ? n : "John Doe";
                this.id = (id.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$"))?id:"560610000";
                this.year = (year>1989)?year:1990;
                this.status = status;
            }
     public void setName(String n){
                if (!n.equals(""))name =n;
            }
     public  void setStudent_id(String id){
                String checkID = "^[0-9][6-9][0-9]{3,0}[0-2][0-9]{3,0}$";
                if(id.matches(checkID)&&id.length()==9)ID = id;
            }
     public  void setYearofBirth(int year){
                if(year >1989)bd =year;
            }
     public String getName(){
                return  name;
            }
     public String getStudent_id(){
                return ID;
            }
     public int getYearOfBirth(){
                return bd;
           }
     public  boolean isActive(){
               return  active;
    }


    @Override
    public String toString() {

        String tmp;
              if(isActive()==true) tmp = "ACTIVE";
                else tmp = "INACTIVE";
               String o = name + " (" + id + ") was born in " + Integer.toString(year)  + " is an " ;
        return o;
    }

    private boolean isValidStudent_id(String id) {
        return true;
    }

    private boolean isValidYOB(int yob) {
        return true;
    }

      private String name;
     private String ID;
     private int bd;
    private boolean status;

}
package Encapsulation;

public class student {
    private String name;
    private String branch;
    private int rollno;


public void setname(String name){
    this.name= name;
}

public String getname(){
    return this.name;
}

    public void setbranch(String branch){
        this.branch= branch;
    }
    public String getbranch(){
        return this.branch;
    }
    public void setrollno(int rollno){
        this.rollno= rollno;
    }
    public int getrollno(){
        return this.rollno;
    }

}
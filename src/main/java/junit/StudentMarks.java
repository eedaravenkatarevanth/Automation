package junit;

public class StudentMarks {
    public int setValue=0;
    public void check(int mathMarks, int scienceMarks){
        if(mathMarks<0 || scienceMarks<0 || mathMarks>100 || scienceMarks>100) setValue=-1;
        else setValue=mathMarks+scienceMarks;
    }
    public int getMarks(){
        return this.setValue;
    }

}

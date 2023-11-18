public class Students {
    int rollNo;
    float marks;

    Students(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String toString() {
        return "Roll No.: "+this.rollNo+" Marks: "+this.marks+"\t";
    }


}

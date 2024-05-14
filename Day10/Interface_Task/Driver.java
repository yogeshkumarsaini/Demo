package Day10.Interface_Task;

public class Driver {
    public static void main(String[] args) {
        Student st = new Student(12,"Yogesh",70);
        st.display();
        System.out.println(st.showRollNo());
        
        Student st1 =new Student(13,"Akash",50);
        st1.display();
        System.out.println(st1.showRollNo());
        
        
        int comparisonResult = st.compareTo(st1);
        if(comparisonResult>0){
            System.out.println("High");
        }
        else if(comparisonResult<0){
            System.out.println("Low");
        }
        else{
            System.out.println("Equal");
        }

    }
    
}

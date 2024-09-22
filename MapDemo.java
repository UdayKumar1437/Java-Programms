import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String , Integer> SubjectMarks = new HashMap<String, Integer>();
        SubjectMarks.put("Telugu", 98);
        SubjectMarks.put("Hindi", 75);
        SubjectMarks.put("English", 98);
        SubjectMarks.put("Mathemetics", 75);
        SubjectMarks.put("Science", 98);
        SubjectMarks.put("Social", 75);
        SubjectMarks.put("Science", 100);
        // System.out.println(SubjectMarks.keySet());
        // System.out.println(SubjectMarks.get("Science"));

        for(String subjectName:SubjectMarks.keySet())
        {
            System.out.println(subjectName + SubjectMarks.get(subjectName));
        }
    }
}

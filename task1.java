//  1 . Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}



import java.util.*;



public class task1 {
    public static void main(String[] args) {
       String key = "country";
       String val = "Belarus";
      

       String[] student1 = new String[]{"name","Ivanov","country","Russia", "city","Moscow", "age","19"};
       String[] student2 = new String[] { "name", "Vetrov", "country", "Belarus", "city", "Minsk", "age", "25" };
       String[] student3 = new String[] { "name", "Tomov", "country", "Belarus", "city", "Minsk", "age", "null" };
    
       ArrayList<HashMap<String,String>> students = new ArrayList<>();
       students.add(toMap(student1));
       students.add(toMap(student2));
       students.add(toMap(student3));

       createReq(students, key,val);
    }
      
    static HashMap<String,String> toMap(String[] student){
        HashMap<String,String> map1 = new HashMap<>();
        for (int i = 0; i < student.length; i++) {
            if(i%2 == 0){
            map1.put(student[i],student[i+1]);
            }
        }
        return map1;
    }

    static void createReq(ArrayList<HashMap<String,String>> st, String key, String val) {
       
        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).containsKey(key) == true && st.get(i).containsValue(val) == true) {
                st.get(i).values().remove("null");
                System.out.println(st.get(i)); 
                    
                }              
               
            }
        }            
}


// 3* . Дана json строка (можно сохранить в файл и читать из файла)

// Написать метод(ы), который распарсит json и, 
// используя StringBuilder, создаст строки вида: 
// Студент [фамилия// ] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.

import java.util.*;

public class task3 {
    public static void main(String[] args){
        ArrayList<HashMap<String,String>>  json =  new ArrayList<>();
        String[] st1 = new String[]{"фамилия:", "Иванов", "оценка:", "5", "предмет:", " Математика"};
        String[] st2 = new String[]{"фамилия:", "Громов", "оценка:", "5", "предмет:", " Информатика"};
        String[] st3 = new String[]{"фамилия:", "Сидоров", "оценка:", "4", "предмет:", " Физика"};
        json.add(toMap(st1));
        json.add(toMap(st2));
        json.add(toMap(st3));

        System.out.println((json));
        System.out.println();
        System.out.println(students(json));
      
    }


    static HashMap<String,String> toMap(String[] student){
        HashMap<String,String> map1 = new HashMap<>();
        for (int i = 0; i < student.length-1; i++) {
            if(i%2 == 0){
            map1.put(student[i],student[i+1]);
            }
        }
        return map1;
    }

    static StringBuilder students ( ArrayList<HashMap<String,String>> array){
        StringBuilder s = new StringBuilder();
        for (int j = 0; j < array.size()-2; j++) {
            for (HashMap<String,String> hashMap : array) {
                s.append("Студент " + hashMap.get("фамилия:") +" ");
                s.append("получил " + hashMap.get("оценка:")+" ");
                s.append("по предмету " + hashMap.get("предмет:")+" ");
                s.append("\n");
            }
        }
        
        return s;
    }

}

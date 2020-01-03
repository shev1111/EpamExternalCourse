package task5.task51.model.utils;

import task5.task51.model.entity.Student;

import java.util.Map;

public class ConversionUtil {

    public static String ConvertJournalRecords(Map<Integer, Student> records) {
        StringBuilder recordsBuilder = new StringBuilder();
        for (Student student :records.values()) {
            recordsBuilder.append( String.format("%3s | %15s | %14s | %10s | %75s | %15s |",
                    student.getId(),
                    student.getName(),
                    student.getSurname(),
                    DateFormatter.getSimpleFormat(student.getBirth()),
                    student.getAddress(),
                    student.getPhone())
            );
        }
        return recordsBuilder.toString();
    }
}

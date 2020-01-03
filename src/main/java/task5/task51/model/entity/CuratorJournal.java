package task5.task51.model.entity;

import java.util.*;

public class CuratorJournal {

    private Map<Integer, Student> records = new LinkedHashMap<>();

    public void addRecord(Student record){
        records.put(record.getId(),record);

    }

    public Student getRecordById (int index) throws IndexOutOfBoundsException {
        return records.get(index);
    }

    public Map<Integer, Student> getRecords() {
        return records;
    }

    public boolean removeRecordById(int id)throws IndexOutOfBoundsException{
        Student student = records.remove(id);
        return student != null && student.getId() == id;
    }
}

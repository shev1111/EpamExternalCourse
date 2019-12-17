package practice.lesson;

public enum DayOfWeek {
    SUNDAY,
    MONDAY(true),
    TUESDAY,
    WEDNESDAY(true),
    THURSDAY,
    FRIDAY(true),
    SATURDAY;
    private boolean flag;

    DayOfWeek() {
    }

    DayOfWeek(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public DayOfWeek nexDay(){
        DayOfWeek[] days = DayOfWeek.values();
        return days[(this.ordinal()+1) % days.length];
    }
}
